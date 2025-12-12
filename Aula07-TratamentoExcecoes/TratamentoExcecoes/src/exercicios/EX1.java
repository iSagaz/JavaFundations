package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite uma nota: ");
            double nota = sc.nextDouble();
            sc.nextLine();

            System.out.println("Digite outro nota: ");
            double nota2 = sc.nextDouble();
            sc.nextLine();

            double media = (nota+nota2)/2;
            sc.nextLine();
            System.out.println("Media: "+media);

        } catch (InputMismatchException e){
            System.out.println("Letra não seu animal ");
        }











        sc.close();
    }
}
