package model.lancamentos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

import model.DB;
import model.enums.TiposCategorias;

/**
 * A class to manage financial records, allowing for insertion and retrieval of
 * entries.
 */
public class Lancamentos {
  private DB db = new DB();

  /**
   * Registers a new entry in the database.
   *
   * @param type      the type of category for the entry.
   * @param categoria the specific category of the entry.
   * @param valor     the value of the entry.
   * @param data      the date of the entry.
   */
  protected void cadastrarInDb(TiposCategorias type, Enum<?> categoria, double valor, LocalDate data) {
    String formattedString = String.format(
        "%s,%s,%s,%s",
        type,
        categoria,
        valor,
        data);

    this.db.insert(formattedString);
  }

  /**
   * Retrieves all records from the database.
   *
   * @return an ArrayList of Maps, where each Map represents a record with keys
   *         "type", "categoria", "valor", and "data".
   */
  public ArrayList<Map<String, String>> getAll() {
    return this.db.getAll();
  }

  /**
   * Retrieves records within a specified period.
   *
   * @param dataInicial the start date of the period.
   * @param dataFinal   the end date of the period.
   * @return an ArrayList of Maps, where each Map represents a record within the
   *         specified period.
   * @throws IllegalArgumentException if the start date is after the end date.
   */
  public ArrayList<Map<String, String>> getPorPeriodo(LocalDate dataInicial, LocalDate dataFinal) {
    if (dataInicial.isAfter(dataFinal)) {
      throw new IllegalArgumentException("Data inicial não pode ser maior que a data final");
    }

    ArrayList<Map<String, String>> lancamentos = this.getAll();
    ArrayList<Map<String, String>> lancamentosFiltrados = new ArrayList<>();

    for (Map<String, String> i : lancamentos) {
      LocalDate dataLancamento = LocalDate.parse(i.get("data"));

      boolean isEqualBefore = dataLancamento.isEqual(dataFinal);
      boolean isBefore = dataLancamento.isBefore(dataFinal);

      boolean isEqualAfter = dataLancamento.isEqual(dataInicial);
      boolean isAfter = dataLancamento.isAfter(dataInicial);

      if ((isEqualBefore || isBefore) && (isEqualAfter || isAfter)) {
        lancamentosFiltrados.add(i);
      }
    }

    return lancamentosFiltrados;
  }
}
