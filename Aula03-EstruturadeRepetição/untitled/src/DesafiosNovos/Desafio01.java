package DesafiosNovos;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args){

        //Desafio 1: Fatorial de um Número

        //Peça ao usuário um número inteiro positivo e, usando um for, calcule o fatorial desse número.

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero positivo: ");
        int numero = sc.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero; i++){
            fatorial *= i;

            System.out.println("O Fatorial de " + numero + " é igual a " + fatorial);

        }
    }
}