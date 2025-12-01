package DesafiosNovos;

import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        //Desafio 5: Soma de Dígitos de um Número
        //
        //Peça ao usuário um número inteiro e, com um while, some todos os seus dígitos (exemplo: 123 = 1 + 2 + 3 = 6).

         System.out.println("Digite um numero:");
         int numero = sc.nextInt();
         int soma = 0;
         int casa = 1;
         int digito = 0;

         while(numero > 0){
         digito = (int) (numero % Math.pow (10, casa));
         numero -= digito;
         digito = (int) (digito / Math.pow (10, casa - 1));
         soma += digito;
         casa++;
         }
         System.out.println("A soma dos digitos é: " + soma);

         sc.close();
    }
}