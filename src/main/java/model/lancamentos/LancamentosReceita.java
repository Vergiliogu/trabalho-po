package model.lancamentos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

import model.enums.CategoriasReceitas;
import model.enums.TiposCategorias;

/**
 * A class to manage income records, allowing for insertion and retrieval of
 * income entries.
 */
public class LancamentosReceita extends Lancamentos {

  /**
   * Registers a new income entry in the database.
   *
   * @param categoria the category of the income.
   * @param valor     the value of the income.
   * @param data      the date of the income.
   */
  public void cadastrar(CategoriasReceitas categoria, double valor, LocalDate data) {
    super.cadastrarInDb(TiposCategorias.RECEITA, categoria, valor, data);
  }

  /**
   * Retrieves all income records from the database.
   *
   * @return an ArrayList of Maps, where each Map represents an income record with
   *         keys "type", "categoria", "valor", and "data".
   */
  @Override
  public ArrayList<Map<String, String>> getAll() {
    ArrayList<Map<String, String>> listaLancamentos = super.getAll();
    ArrayList<Map<String, String>> listaReceita = new ArrayList<Map<String, String>>();

    for (Map<String, String> i : listaLancamentos) {
      if (i.get("type").equals(TiposCategorias.RECEITA.toString())) {
        listaReceita.add(i);
      }
    }

    return listaReceita;
  }

  /**
   * Retrieves income records within a specified period.
   *
   * @param dataInicial the start date of the period.
   * @param dataFinal   the end date of the period.
   * @return an ArrayList of Maps, where each Map represents an income record
   *         within the specified period.
   * @throws IllegalArgumentException if the start date is after the end date.
   */
  @Override
  public ArrayList<Map<String, String>> getPorPeriodo(LocalDate dataInicial, LocalDate dataFinal) {
    ArrayList<Map<String, String>> listaLancamentos = super.getPorPeriodo(dataInicial, dataFinal);
    ArrayList<Map<String, String>> listaReceita = new ArrayList<Map<String, String>>();

    for (Map<String, String> i : listaLancamentos) {
      if (i.get("type").equals(TiposCategorias.RECEITA.toString())) {
        listaReceita.add(i);
      }
    }

    return listaReceita;
  }
}
