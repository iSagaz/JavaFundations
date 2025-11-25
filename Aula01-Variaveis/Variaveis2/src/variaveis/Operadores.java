package variaveis;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        System.out.println("Digite um numero: ");
        int numero2 = sc.nextInt();

        //operador soma (+)
        int soma = numero + numero2;
        System.out.println("A soma de " + numero + "+" + numero2 + "=" + soma);

        //operador multiplicaçao
        int multiplicaçao = numero * numero2;
        System.out.println("A multiplicaçao de " + numero + "*" + numero2 + "=" + multiplicaçao);

        //operador subtraçao
        int subtraçao = numero - numero2;
        System.out.println("A subtraçao de " + numero + "-" + numero2 + "=" + subtraçao);

       //operador divisao
        double divisao = (double) numero / numero2;
        System.out.println("A divisao de " + numero + "/" + numero2 + "=" + divisao);

       //operador modulo
       int modulo = numero % numero2;
       System.out.println("O modulo de " + numero + "%" + numero2 + "=" + modulo);


        sc.close();
      }
    }