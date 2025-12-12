package exercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EX5 {
   public static void main(String[] args) {

       File arquivo = new File("exemplo.txt");
       try {
           Scanner sc = new Scanner(arquivo);

           while (sc.hasNextLine()) {
               System.out.println(sc.nextLine());
           }
       } catch (FileNotFoundException e) {
           System.out.println("A causa do erro foi: " + e.getMessage());
       }

   }
}
