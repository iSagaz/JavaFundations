package DesafiosNovos;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Desafio 2: Sequência de Fibonacci

        //Peça ao usuário um número inteiro N e utilize a estrutura de repetição for para exibir os primeiros N termos da sequência de
        //Fibonacci. A sequência de Fibonacci é formada de tal maneira que cada número é a soma dos dois anteriores, começando
        //normalmente com os valores 0 e 1.
        System.out.println("Digite um numero:");
        int numero = sc.nextInt();
        int primeiro = 1, segundo = 2;
        for (int i = 1; 1 <= numero; i++) {
            System.out.print(primeiro + "");
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            sc.close();
        }
    }
}