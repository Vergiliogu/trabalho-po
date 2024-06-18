package model.lancamentos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

import model.enums.CategoriasDespesas;
import model.enums.TiposCategorias;

/**
 * A class to manage expense records, allowing for insertion and retrieval of
 * expense entries.
 */
public class LancamentosDespesa extends Lancamentos {

  /**
   * Registers a new expense entry in the database.
   *
   * @param categoria the category of the expense.
   * @param valor     the value of the expense.
   * @param data      the date of the expense.
   */
  public void cadastrar(CategoriasDespesas categoria, double valor, LocalDate data) {
    super.cadastrarInDb(TiposCategorias.DESPESA, categoria, -valor, data);
  }

  /**
   * Retrieves all expense records from the database.
   *
   * @return an ArrayList of Maps, where each Map represents an expense record
   *         with keys "type", "categoria", "valor", and "data".
   */
  @Override
  public ArrayList<Map<String, String>> getAll() {
    ArrayList<Map<String, String>> listaLancamentos = super.getAll();
    ArrayList<Map<String, String>> listaDespesas = new ArrayList<Map<String, String>>();

    for (Map<String, String> i : listaLancamentos) {
      if (i.get("type").equals(TiposCategorias.DESPESA.toString())) {
        listaDespesas.add(i);
      }
    }

    return listaDespesas;
  }

  /**
   * Retrieves expense records within a specified period.
   *
   * @param dataInicial the start date of the period.
   * @param dataFinal   the end date of the period.
   * @return an ArrayList of Maps, where each Map represents an expense record
   *         within the specified period.
   * @throws IllegalArgumentException if the start date is after the end date.
   */
  @Override
  public ArrayList<Map<String, String>> getPorPeriodo(LocalDate dataInicial, LocalDate dataFinal) {
    ArrayList<Map<String, String>> listaLancamentos = super.getPorPeriodo(dataInicial, dataFinal);
    ArrayList<Map<String, String>> listaDespesas = new ArrayList<Map<String, String>>();

    for (Map<String, String> i : listaLancamentos) {
      if (i.get("type").equals(TiposCategorias.DESPESA.toString())) {
        listaDespesas.add(i);
      }
    }

    return listaDespesas;
  }
}
