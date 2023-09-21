package br.com.teste.primeirorest.view.model;

import lombok.Data;

@Data
public class PessoaModeloResponse {
    protected Integer id;
    protected String nome;
    protected String sobrenome;

    public String getNomeCompleto() {
        return String.format("%s %s", nome, sobrenome);
    }
}
