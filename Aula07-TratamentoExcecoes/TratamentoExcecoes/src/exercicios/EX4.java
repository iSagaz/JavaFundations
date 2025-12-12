package exercicios;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EX4 {
   public static void main(String[] args) {

       try {
           FileWriter fw = new FileWriter("exemplo.txt");
           fw.write("Queijos saborosos do samuel\n");
           fw.write("Queijo palitinho\n");
           fw.close();
           System.out.println("Programa finalizado com sucesso");
       } catch (IOException e) {
           System.out.println( e.getMessage());

       }

   }
}
