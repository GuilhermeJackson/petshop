package br.com.teste.primeirorest.shared;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class AnimalDTO {
     @Id // vai transformar essa coluna em primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer dono;
    private String nome;
    private Integer idade;
    private String raca;
    private Boolean vivo;
}
