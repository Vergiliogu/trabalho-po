package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;
import model.lancamentos.Lancamentos;
import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.mockito.*;
import static org.mockito.Mockito.when;
import org.powermock.api.mockito.PowerMockito;

public class ContadorTeste {
    @Mock
    private Lancamentos lancamentos;

    @InjectMocks
    private Contador contador;

    @Before
    public void setup() throws Exception {
        MockitoAnnotations.openMocks(this);
        PowerMockito.whenNew(Lancamentos.class).withNoArguments().thenReturn(lancamentos);
    }

    /*
     * @Test
     * public void deveRetornarSaldoAtual(Contador cont){
     * 
     * }
     */

    @Test
    public void deveRetornarSaldoPorPeriodo() {
        ArrayList<Map<String, String>> listaLancamentos = new ArrayList<>();
        listaLancamentos.add(Map.of(
                "type", "RECEITA",
                "categoria", "Salario",
                "valor", "3000.0",
                "data", LocalDate.of(2022, 01, 01).toString()));
        listaLancamentos.add(Map.of(
                "type", "DESPESA",
                "categoria", "Alimentacao",
                "valor", "-100.0",
                "data", LocalDate.of(2022, 01, 02).toString()));

        when(lancamentos.getPorPeriodo(LocalDate.of(2022, 01, 01), LocalDate.of(2022, 01, 02)))
                .thenReturn(listaLancamentos);
        double saldoPeriodo = this.contador.getSaldoPorPeriodo(LocalDate.of(2022, 01, 01), LocalDate.of(2022, 01, 02));

        assertEquals(2900, saldoPeriodo, 0.0001);
    }

    @Test
    public void deveCalcularSaldo() {
        ArrayList<Map<String, String>> extrato = new ArrayList<>();
        extrato.add(Map.of(
                "type", "RECEITA",
                "categoria", "Salario",
                "valor", "3000.0",
                "data", LocalDate.of(2022, 01, 01).toString()));
        extrato.add(Map.of(
                "type", "DESPESA",
                "categoria", "Alimentacao",
                "valor", "-100.0",
                "data", LocalDate.of(2022, 01, 02).toString()));
        extrato.add(Map.of(
                "type", "DESPESA",
                "categoria", "Alimentacao",
                "valor", "-100.0",
                "data", LocalDate.of(2022, 01, 03).toString()));

        double saldo = this.contador.calcularSaldo(extrato);
        assertEquals(2800, saldo, 0.0001);
    }
}
