package br.com.teste.animaisms.compartilhado;

import lombok.Data;

@Data
public class AnimalDto {
    private Integer id;
    private Integer dono;
    private String nome;
    private Integer idade;
    private String raca;
    private Boolean vivo;

   
}
