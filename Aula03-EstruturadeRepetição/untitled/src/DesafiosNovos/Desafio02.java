package DesafiosNovos;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Desafio 2: Sequência de Fibonacci

        //Peça ao usuário um número inteiro N e utilize a estrutura de repetição for para exibir os primeiros N termos da sequência de
        //Fibonacci. A sequência de Fibonacci é formada de tal maneira que cada número é a soma dos dois anteriores, começando
        //normalmente com os valores 0 e 1.

        System.out.println("Informe o termo que deseja saber:");
        int a = 0, b = 1, soma;
        int termo = sc.nextInt();

        for (int i = 1; 1 <= termo; i++) {
            soma = a + b;

            System.out.print(a + "");
            a = b;
            b = soma;


            sc.close();
        }
    }
}