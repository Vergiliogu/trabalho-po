package model.lancamentos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

import model.DB;
import model.enums.CategoriasDespesas;
import model.enums.TiposCategorias;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.*;
import org.mockito.*;
import org.powermock.api.mockito.PowerMockito;

public class LancamentosTest {
  @Mock
  private DB db;

  @InjectMocks
  private Lancamentos lancamentos;

  @Before
  public void setup() throws Exception {
    MockitoAnnotations.openMocks(this);
    PowerMockito.whenNew(DB.class).withNoArguments().thenReturn(db);
  }

  @Test
  public void shouldCallDbInsertWithCorrectParams() {
    TiposCategorias type = TiposCategorias.DESPESA;
    CategoriasDespesas categoria = CategoriasDespesas.Alimentacao;
    double valor = 100.0;
    LocalDate data = LocalDate.now();

    this.lancamentos.cadastrarInDb(type, categoria, valor, data);

    // Assertions
    String expectedString = String.format(
        "%s,%s,%s,%s",
        type,
        categoria,
        valor,
        data);

    verify(db, times(1)).insert(expectedString);
  }

  @Test
  public void shouldCallDbGetAllAndReturnCorrectValues() {
    ArrayList<Map<String, String>> mockReturn = new ArrayList<Map<String, String>>();
    mockReturn.add(Map.of(
        "type", "DESPESA",
        "categoria", "Alimentacao",
        "valor", "100.0",
        "data", LocalDate.now().toString()));

    when(db.getAll()).thenReturn(mockReturn);

    ArrayList<Map<String, String>> lancamentos = this.lancamentos.getAll();

    // Assertions
    verify(db, times(1)).getAll();
    assertEquals(mockReturn, lancamentos);
  }

  @Test
  public void shouldThrowExceptionWhenInitialDateIsGreaterThanFinalDate() {
    LocalDate dataInicial = LocalDate.of(2022, 1, 3);
    LocalDate dataFinal = LocalDate.of(2022, 1, 1);

    assertThrows(
        IllegalArgumentException.class,
        () -> this.lancamentos.getPorPeriodo(dataInicial, dataFinal));
  }

  @Test
  public void shouldFilterLancamentosByDateCorrectly() {
    ArrayList<Map<String, String>> mockReturn = new ArrayList<Map<String, String>>();
    mockReturn.add(Map.of(
        "type", "RECEITA",
        "categoria", "Salario",
        "valor", "3000.0",
        "data", LocalDate.of(2022, 01, 01).toString()));
    mockReturn.add(Map.of(
        "type", "DESPESA",
        "categoria", "Alimentacao",
        "valor", "-100.0",
        "data", LocalDate.of(2022, 01, 02).toString()));
    mockReturn.add(Map.of(
        "type", "DESPESA",
        "categoria", "Alimentacao",
        "valor", "-100.0",
        "data", LocalDate.of(2022, 01, 03).toString()));

    when(db.getAll()).thenReturn(mockReturn);

    ArrayList<Map<String, String>> lancamentos = this.lancamentos.getPorPeriodo(
        LocalDate.of(2022, 1, 1),
        LocalDate.of(2022, 1, 2));

    ArrayList<Map<String, String>> expectedReturn = new ArrayList<Map<String, String>>();
    expectedReturn.add(mockReturn.get(0));
    expectedReturn.add(mockReturn.get(1));

    // Assertions
    verify(db, times(1)).getAll();
    assertEquals(expectedReturn, lancamentos);
  }
}
