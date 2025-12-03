package desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio4 {
   public  static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       //Desafio 04: Remove Palavras que Contêm um Caracter Específico
       //
       //Crie uma lista de palavras e remova todas que contêm uma letra específica fornecida pelo usuário.
       //
       //Exemplo:
       //
       //Palavras originais: [Banana, Maçã, Abacate, Manga]
       //
       //Removendo palavras que contêm “a": []

       ArrayList<String> lista = new ArrayList<>();
       lista.add("Computador");
       lista.add("Colher");
       lista.add("Escada");
       lista.add("Mouse");
       lista.add("Servidor");
       lista.add("Cadeira");

       System.out.println("Digite uma letra: ");
       String letra = sc.nextLine().toUpperCase();

       lista.removeIf(String nome -> nome.toUpperCase().contains(letra));

          for (String nome : lista) {
           System.out.println("Nome: " + nome);
       }

       sc.close();
   }
}
