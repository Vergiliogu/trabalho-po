package model.lancamentos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

import model.enums.CategoriasReceitas;
import model.enums.TiposCategorias;

public class LancamentosReceita extends Lancamentos {
  public void cadastrar(CategoriasReceitas categoria, double valor, LocalDate data) {
    super.cadastrarInDb(TiposCategorias.RECEITA, categoria, valor, data);
  }

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
}
