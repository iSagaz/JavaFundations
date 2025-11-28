package exercicios;

import java.util.Scanner;

public class Switch {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Informe quantos reais voce possui: ");
       double reais = sc.nextDouble();
       System.out.println("Informe para qual moeda deseja converter: ");
       System.out.println("1 - Dolar");
       System.out.println("2 - Euro");
       System.out.println("3 - libra");
       System.out.println("O metodo escolhido foi: ");
       int opçao = sc.nextInt();

       Switch(opçao) {
           case 1:
               double dolar = reais * 0.20;
               System.out.println("O valor é U$$ " + dolar);
               break;

           case 2:
               double euro = reais * 0.18;
               System.out.println("O valor é &" + euro);
               break;
           case 3:
               double libra = reais * 0.15;
               System.out.println("O valor é de &" = libra);
               break;

           default:
               System.out.println("Opçao invalida");
               break;

               sc.close();
       }
   }