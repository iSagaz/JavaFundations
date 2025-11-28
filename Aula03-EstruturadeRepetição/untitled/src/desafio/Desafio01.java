package desafio;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        //desafio
        //criar um programa que soma 6 valores digitados pelo usuario
        //porem o programa so vai somar impares e multiplos de 3

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();
        int soma = 0;

        for (int i = 1; i <= 6; i++){


            if(numero % 2 != 0 && numero % 3 == 0) {
                soma += numero;
            }
        }
        System.out.println("Essa soma foi:" + soma);

        sc.close();
    }
}