package desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio2 {
   public  static void main(String[] args) {

       //Desafio 02: Soma e Média de Números

       //Crie uma lista de números inteiros. Calcule a soma e a média de todos os números na lista.

       //Exemplo:

       //Lista de números: [10, 20, 30, 40]

       //Soma: 100

       //Média: 25.0

       ArrayList<Integer> numero = new ArrayList<>();

       numero.add("10");
       numero.add("20");
       numero.add("30");
       numero.add("40");
       numero.add("50");
       numero.add("60");
       numero.add("70");
       numero.add("80");
       numero.add("90");
       numero.add("100");

       int somaTotal = 0;

       for (int valor : numero) {
           somaTotal += valor;
       }

       System.out.println("Soma total: " + somaTotal);

       double media = somaTotal / (double) numero.size();  // Cast para double para precisão
       System.out.println("Média: " + media);


   }
}
