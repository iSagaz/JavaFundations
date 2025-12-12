package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite um numero: ");
            double numero = sc.nextDouble();
            sc.nextLine();
            System.out.println("Digite outro numero: ");
            double numero2 = sc.nextDouble();
            sc.nextLine();

            double divisao = numero / numero2;
            System.out.println("resultado: " + divisao);

        } catch (InputMismatchException e) {
            System.out.println("O QUE VOCE ENTENDE POR NUMERO? ANIMAL ");
        } catch (ArithmeticException e) {
            System.out.println("Por algum acaso da pra dividir 0 por 0? ");
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }


        sc.close();
    }
}
