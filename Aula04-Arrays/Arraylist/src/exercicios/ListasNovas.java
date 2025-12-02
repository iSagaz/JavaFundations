package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ListasNovas {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       ArrayList<String> nomes = new ArrayList<>(5);
       nomes.add("Pedro");
       nomes.add("Maria");
       nomes.add("Diego");

       //alternando valor
       nomes.add(1, "Enzo");
       nomes.add(2, "Nathan");
       System.out.println(nomes);

       //verificar se o item exite
       System.out.println(nomes.get(0));

       //alterar elemento
       nomes.set(0,"João");
       System.out.println(nomes);

      //pegando o indice
       System.out.println(nomes.indexOf("Pedro"));
       System.out.println(nomes.indexOf("João"));
       System.out.println(nomes.indexOf("Maria"));
       System.out.println(nomes);

      //remover elemento
       nomes.remove("Maria");
       nomes.remove(1);

       //verificar tamanho
       System.out.println(nomes.size());
       System.out.println(nomes);


       //remove if
       nomes.removeIf(String itens -> itens.charAt(0) == "J");

       for (String nome : nomes) {
           System.out.println(nome);
       }


       sc.close();
   }
}
