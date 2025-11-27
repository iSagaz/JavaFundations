package exercicios;

import java.util.Scanner;

public class Desafio6 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor gasto: ");
        double valorGasto = sc.nextDouble();
        sc.nextLine();
        System.out.println("Qual seria a forma de pagamento: ");
        System.out.println("Dinheiro/pix");
        System.out.println("Debito");
        System.out.print("Credito");
        System.out.println("O metodo de pagamento foi de: ");
        String opcao = sc.nextLine();
        double valorFinal;

        Switch(opcao) {
            case A:
              valorFinal= valorGasto * 0.9
              break;

              case B:
                valorFinal = valorGasto * 0.95;
                break;

            case C:
                System.out.println("Informe a forma de parcelamento");
                System.out.println(" 1 - a vista");
                System.out.println("2 - 2 parcelas");
                System.out.println("3 - 3 parcelas");
                break;

            case "1":
                valorFinal= valorGasto;
                System.out.println("O valor final foi de " + valorFinal);
             break;

            case "2":                                         valorFinal = valorGasto * 1.05 / 2;
                        System.out.println("O valor final foi de " + valorFinal);
                        break;

                    case "3":
                        valorFinal = valorGasto * 1.1 / 3;
                        System.out.println("O valor final foi de " + valorFinal);
                        break;
              

        sc.close();
    }
}