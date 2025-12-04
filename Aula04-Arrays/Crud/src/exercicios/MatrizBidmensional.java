package exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MatrizBidmensional {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       ArrayList<String> menuLanches = new ArrayList<>(Arrays.asList(
               "X - Burguer",
               "X - EGG",
               "X - Bacon",
               "X - Salada",
               "X - Tudo"

       ));

       ArrayList<Double> menuPrecos = new ArrayList<>(Arrays.asList(
               22,9,
               24,9,
               26,9,
               26,9,
               29,9

       ));

       System.out.println("/n ------- CARDAPIO ------");
       for (int i = 0; i < menuLanches.size(); i++) {
           System.out.println(i + " - " + menuLanches.get(i) + " - " + menuPrecos.get(i) );
       }





       sc.close();
   }
}
