package org.example;

import org.example.entidades.GerenciarRoupa;
import org.example.entidades.Roupa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GerenciarRoupa gerenciarRoupa = new GerenciarRoupa();

        Roupa roupa = new Roupa("Adidas", "Calça", "M",  2,200);

        gerenciarRoupa.cadastrarRoupa(roupa);
    }

}

