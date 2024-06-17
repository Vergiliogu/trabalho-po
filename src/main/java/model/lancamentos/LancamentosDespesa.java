package model.lancamentos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

import model.enums.CategoriasDespesas;
import model.enums.TiposCategorias;

public class LancamentosDespesa extends Lancamentos {
  public void cadastrar(CategoriasDespesas categoria, double valor, LocalDate data) {
    super.cadastrarInDb(TiposCategorias.DESPESA, categoria, -valor, data);
  }

  @Override
  public ArrayList<Map<String, String>> getAll() {
    ArrayList<Map<String, String>> listaLancamentos = super.getAll();// o que é e pra que serve? Map é o que o professor vai perguntar na próxima aula? 
    ArrayList<Map<String, String>> listaDespesas = new ArrayList<Map<String, String>>();

    for (Map<String, String> i : listaLancamentos) {
      if (i.get("type").equals(TiposCategorias.DESPESA.toString())) {
        listaDespesas.add(i);
      }
    }

    return listaDespesas;
  }

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
