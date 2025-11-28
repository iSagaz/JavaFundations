package exercicios;


import java.util.Scanner;

public class Exercicioswhile {
   public static void main(String[] args){

       Scanner sc = new Scanner(System.in)  ;

    while (true) {
        System.out.println("Digite um numero [Digite 999 para parar]:");
       int numero = sc.nextInt();
       if(numero == 999){
           System.out.println("Voce chegou ao limite");
           break;
       }
        System.out.println(numero);


    }
        sc.close();
    }
}
