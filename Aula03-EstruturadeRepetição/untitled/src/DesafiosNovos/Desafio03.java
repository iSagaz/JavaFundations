package DesafiosNovos;

import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Desafio 3: Média de Números com DO-WHILE
        //Peça ao usuário números até que ele digite 0. Calcule e exiba a média dos números digitados.

        double soma = 0;
        int contador = 0;

        while (true) {
            System.out.println("Digite um numero:");
            double numero = sc.nextDouble();

            if (numero == 0) {
                break;

                soma += numero;
                contador++;

            }
        }
        System.out.println("A soma é igual a:" + soma);
        System.out.println("A media é igual a: " + soma / contador);


        sc.close();
    }
}