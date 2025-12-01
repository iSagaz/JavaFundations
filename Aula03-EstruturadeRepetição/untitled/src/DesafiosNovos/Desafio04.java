package DesafiosNovos;

import java.util.Scanner;

public class Desafio04 {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       //Desafio 4: Número Par ou Ímpar com WHILE
       //
       //Solicite números ao usuário, informando se são pares ou ímpares, e acumule as somas de números pares e de números impares.
       //O programa encerra ao receber 0, exibindo as somas totais de pares e ímpares.

       int somaPar = 0;
       int somaImpar = 0;

       while (true) {
           System.out.println("Digite um numero: ");
           int numero = sc.nextInt();


           int resto = numero % 2;

           if (resto == 0){ ;
           somaPar += numero;

       } else{

           somaImpar += numero;
           System.out.println("A soma dos numeros pares é igual a: " + somaPar);
           System.out.println("A soma dos nmeros impares é igual a: " + somaImpar);

       }
   }

       sc.close();
   }
}
