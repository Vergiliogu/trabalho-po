package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

import model.lancamentos.Lancamentos;

public class Contador {
  private double saldo = 0;
  private Lancamentos lancamentos = new Lancamentos();

  public Contador() {
    ArrayList<Map<String, String>> listaLancamentos = this.lancamentos.getAll();
    this.saldo = this.calcularSaldo(listaLancamentos);;
  }

  public double getSaldoAtual() {
    return this.saldo;
  }

  public double getSaldoPorPeriodo(LocalDate dataFinal) {
    ArrayList<Map<String, String>> listaLancamentos = this.lancamentos.getPorPeriodo(dataFinal);
    return this.calcularSaldo(listaLancamentos);
  }

  private double calcularSaldo(ArrayList<Map<String, String>> lancamentos) {
    double saldoCalculado = 0;

    for (Map<String, String> i : lancamentos) {
      saldoCalculado += Double.parseDouble(i.get("valor"));
    }

    return saldoCalculado;
  }
}
