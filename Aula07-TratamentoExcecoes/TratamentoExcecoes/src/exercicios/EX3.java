package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX3 {
   public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int[] numeros = {10,20,30,40};

       System.out.println("Digite a posiçao de um valor na matriz: ");

        try {
            int posicao = sc.nextInt();
            System.out.println("Lista: " + numeros[posicao]);
        } catch (InputMismatchException e) {
            System.out.println("Para de ser burro e escreva um numero");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
       System.out.println("Programa finalizado com sucesso");


        sc.close();
   }
}
