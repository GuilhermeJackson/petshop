package br.com.teste.primeirorest.view.model;

import java.util.List;

import br.com.teste.primeirorest.shared.AnimalDTO;

public class PessoaModeloResponseDetalhes extends PessoaModeloResponse {
   private List<AnimalDTO> animais;

   public List<AnimalDTO> getAnimais() {
      return this.animais;
   }

   public void setAnimais(List<AnimalDTO> animais) {
      this.animais = animais;
   }

}
