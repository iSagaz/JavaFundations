package exercicios;

import java.util.Scanner;

public class ExercicioDoWhile {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int opcao = sc.nextInt();

        do {
        System.out.println("Escolha uma opçao");
        System.out.println("1 - Continuar") ;
        System.out.println("2 - Sair");
        opcao = sc.nextInt();

        } while (opcao == 1);

        System.out.println("Voce saiu do programa");

        sc.close();
    }
}