package model.lancamentos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

import model.DB;
import model.enums.CategoriasReceitas;
import model.enums.TiposCategorias;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.*;

import org.junit.*;
import org.mockito.*;
import org.powermock.api.mockito.PowerMockito;

public class LancamentosReceitaTest {
  @Mock
  private DB db;

  @InjectMocks
  private LancamentosReceita lancamentosReceita;

  @Before
  public void setup() throws Exception {
    MockitoAnnotations.openMocks(this);
    PowerMockito.whenNew(DB.class).withNoArguments().thenReturn(db);
  }

  @Test
  public void shouldCallCadastrarInDbWithCorrectParams() {
    CategoriasReceitas categoria = CategoriasReceitas.Salario;
    double valor = 3000.0;
    LocalDate data = LocalDate.now();

    this.lancamentosReceita.cadastrar(categoria, valor, data);

    // Assertions
    String expectedString = String.format(
        "%s,%s,%s,%s",
        TiposCategorias.RECEITA,
        categoria,
        valor,
        data);

    verify(db, times(1)).insert(expectedString);
  }

  @Test
  public void shouldCallGetAllAndReturnOnlyReceitas() {
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

    ArrayList<Map<String, String>> extrato = this.lancamentosReceita.getAll();

    // Assertions
    verify(db, times(1)).getAll();
    assertEquals(1, extrato.size());
    assertEquals("RECEITA", extrato.get(0).get("type"));
  }

  @Test
  public void shouldThrowExceptionWhenInitialDateIsGreaterThanFinalDate() {
    LocalDate dataInicial = LocalDate.of(2022, 1, 3);
    LocalDate dataFinal = LocalDate.of(2022, 1, 1);

    assertThrows(
        IllegalArgumentException.class,
        () -> this.lancamentosReceita.getPorPeriodo(dataInicial, dataFinal));
  }

  @Test
  public void shouldFilterReceitasByDateCorrectly() {
    ArrayList<Map<String, String>> mockReturn = new ArrayList<>();
    mockReturn.add(Map.of(
        "type", "RECEITA",
        "categoria", "Salario",
        "valor", "3000.0",
        "data", LocalDate.of(2022, 01, 01).toString()));
    mockReturn.add(Map.of(
        "type", "DESPESA",
        "categoria", "Alimentacao",
        "valor", "500.0",
        "data", LocalDate.of(2022, 01, 02).toString()));
    mockReturn.add(Map.of(
        "type", "RECEITA",
        "categoria", "Bonus",
        "valor", "100.0",
        "data", LocalDate.of(2022, 01, 03).toString()));

    when(db.getAll()).thenReturn(mockReturn);

    ArrayList<Map<String, String>> extrato = this.lancamentosReceita.getPorPeriodo(
        LocalDate.of(2022, 1, 1),
        LocalDate.of(2022, 1, 2));

    ArrayList<Map<String, String>> expectedReturn = new ArrayList<>();
    expectedReturn.add(mockReturn.get(0));

    // Assertions
    verify(db, times(1)).getAll();
    assertEquals(expectedReturn, extrato);
  }
}
