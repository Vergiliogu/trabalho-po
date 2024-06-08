package model.lancamentos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

import model.DB;
import model.enums.TiposCategorias; //  o que é DB? 

public class Lancamentos {
  private DB db = new DB();

  // A categoria, despesa ou receita é buscada pelo type.
  protected void cadastrarInDb(TiposCategorias type, Enum<?> categoria, double valor, LocalDate data) {
    // Variavel criada para representar que é uma string que vai ser formatada
    // conforme o dado inserido.
    String formattedString = String.format(
        "%s,%s,%s,%s",
        type,
        categoria,
        valor,
        data);

    this.db.insert(formattedString);
  }

  public ArrayList<Map<String, String>> getAll() {
    return this.db.getAll();
  }

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
