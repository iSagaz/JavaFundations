package com.example.lojaroupa.model;

import jakarta.persistence.*;
import lombok.*;

// informa qual tabela do banco sera usada
@Table(name = "roupa")
// informa que a classe Roupa é uma entidade jpa
// mapea a classe para o banco de dados
@Entity(name = "Roupa")
//lombok
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Roupa {

    @Id // informe que o id é a chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // informa que o banco gera o valor do id

    private int id;
    private String marca;
    private String tipo;
    private String tamanho;
    private int quantidade;
    private double valor;


}
