package model.lancamentos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

import model.DB;
import model.enums.TiposCategorias; //  o que é DB? 

public class Lancamentos {
  private DB db = new DB();

  protected void cadastrarInDb(TiposCategorias type, Enum<?> categoria, double valor, LocalDate data) {// a categoria, despesa ou receita é buscada pelo type. 
    String formattedString = String.format(
        "%s, %s, %s, %s",
        type,
        categoria,
        valor,
        data);

    this.db.insert(formattedString);// variavel criada para representar que é uma string que vai ser formatada conforme o dado inserido. 
  }

  public ArrayList<Map<String, String>> getAll() {
    return this.db.getAll();
  }

  public ArrayList<Map<String, String>> getPorPeriodo(LocalDate dataFinal) {
    ArrayList<Map<String, String>> lancamentos = this.getAll();
    ArrayList<Map<String, String>> lancamentosFiltrados = new ArrayList<Map<String, String>>();

    for (Map<String, String> i : lancamentos) {
      LocalDate dataLancamento = LocalDate.parse(i.get("data"));

      boolean isEqual = dataLancamento.isEqual(dataFinal);
      boolean isBefore = dataLancamento.isBefore(dataFinal);

      if (isEqual || isBefore) {
        lancamentosFiltrados.add(i);
      }
    }

    return lancamentosFiltrados;
  }
}
