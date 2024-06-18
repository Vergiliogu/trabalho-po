package model.lancamentos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

import model.DB;
import model.enums.CategoriasDespesas;
import model.enums.TiposCategorias;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.*;

import org.junit.*;
import org.mockito.*;
import org.powermock.api.mockito.PowerMockito;

public class LancamentosDespesaTest {
  @Mock
  private DB db;

  @InjectMocks
  private LancamentosDespesa lancamentosDespesa;

  @Before
  public void setup() throws Exception {
    MockitoAnnotations.openMocks(this);
    PowerMockito.whenNew(DB.class).withNoArguments().thenReturn(db);
  }

  @Test
  public void shouldCallCadastrarInDbWithCorrectParams() {
    CategoriasDespesas categoria = CategoriasDespesas.Alimentacao;
    double valor = 3000.0;
    LocalDate data = LocalDate.now();

    this.lancamentosDespesa.cadastrar(categoria, valor, data);

    // Assertions
    String expectedString = String.format(
        "%s,%s,%s,%s",
        TiposCategorias.DESPESA,
        categoria,
        -valor,
        data);

    verify(db, times(1)).insert(expectedString);
  }

  @Test
  public void shouldCallGetAllAndReturnOnlyDespesas() {
    ArrayList<Map<String, String>> mockReturn = new ArrayList<Map<String, String>>();
    mockReturn.add(Map.of(
        "type", "RECEITA",
        "categoria", "Salario",
        "valor", "3000.0",
        "data", LocalDate.now().toString()));
    mockReturn.add(Map.of(
        "type", "DESPESA",
        "categoria", "Alimentacao",
        "valor", "-100.0",
        "data", LocalDate.now().toString()));

    when(db.getAll()).thenReturn(mockReturn);

    ArrayList<Map<String, String>> extrato = this.lancamentosDespesa.getAll();

    // Assertions
    verify(db, times(1)).getAll();
    assertEquals(1, extrato.size());
    assertEquals("DESPESA", extrato.get(0).get("type"));
  }

  @Test
  public void shouldThrowExceptionWhenInitialDateIsGreaterThanFinalDate() {
    LocalDate dataInicial = LocalDate.of(2022, 1, 3);
    LocalDate dataFinal = LocalDate.of(2022, 1, 1);

    assertThrows(
        IllegalArgumentException.class,
        () -> this.lancamentosDespesa.getPorPeriodo(dataInicial, dataFinal));
  }

  @Test
  public void shouldFilterReceitasByDateCorrectly() {
    ArrayList<Map<String, String>> mockReturn = new ArrayList<>();
    mockReturn.add(Map.of(
        "type", "DESPESA",
        "categoria", "Alimentacao",
        "valor", "-30.0",
        "data", LocalDate.of(2022, 01, 01).toString()));
    mockReturn.add(Map.of(
        "type", "RECEITA",
        "categoria", "Salario",
        "valor", "500.0",
        "data", LocalDate.of(2022, 01, 02).toString()));
    mockReturn.add(Map.of(
        "type", "DESPESA",
        "categoria", "Alimentacao",
        "valor", "-100.0",
        "data", LocalDate.of(2022, 01, 03).toString()));

    when(db.getAll()).thenReturn(mockReturn);

    ArrayList<Map<String, String>> extrato = this.lancamentosDespesa.getPorPeriodo(
        LocalDate.of(2022, 1, 1),
        LocalDate.of(2022, 1, 2));

    ArrayList<Map<String, String>> expectedReturn = new ArrayList<>();
    expectedReturn.add(mockReturn.get(0));

    // Assertions
    verify(db, times(1)).getAll();
    assertEquals(expectedReturn, extrato);
  }
}
