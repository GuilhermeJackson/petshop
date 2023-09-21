package br.com.teste.primeirorest.shared;

import java.util.List;

import lombok.Data;

@Data
public class PessoaDto {
    private Integer id;
    private String nome;
    private String sobrenome;
    private List<AnimalDTO> animais;
}
