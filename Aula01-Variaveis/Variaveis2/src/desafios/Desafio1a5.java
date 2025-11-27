package desafios;

import java.util.Scanner;

public class Desafio1a5 {
    public static void main(String[] args){

        //Desafio 1 conversao de temperatura
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma temperatura em Celsius:" );
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5 ) + 32;
        double kevin = celsius + 273.15;
        System.out.println("A temperatura de fahrenheit é " + celsius + "9 / 5 + 32 " + "kevin = celsius + 273.15");

        //Desafio 2 calculando juros compostos
        System.out.println("Digite a capital inicial:");
        double capital = sc.nextDouble();
        System.out.println("Digite a taxa de juros mensal:");
        double taxa = sc.nextDouble();
        System.out.println("Digite o numero de meses: ");
        int meses = sc.nextInt();




        System.out.println("A montante final é de R$ " + String.format("%.2f"));

       //Desafio 3 media do aluno
        System.out.println("Qual foi a nota das suas 3 avaliações:");
        double nota1 = sc.nextDouble();
        System.out.println("Digite sua nota:");
        double nota2 = sc.nextDouble();
        System.out.println("Digite sua segunda nota");
        double nota3 = sc.nextDouble();
        double notaFinal = (nota1 + nota2 + nota3 ) / 3;
        System.out.println("Sua media final foi de " + notaFinal );

        //Desafio 4 calculalora de juros simples
         System.out.print("Digite o capital inicial: ");
        double capital = sc.nextDouble();
        System.out.print("Digite a taxa de juros mensal: ");
        double taxaJuros = sc.nextDouble() / 100;
        System.out.print("Tempo em meses: ");
        int meses = sc.nextInt();

        double juros = capital * taxaJuros * meses;

        System.out.println("O valor dos juros foi de R$" + String.format("%.2f", juros));


        //Desafio 5 area e perimetro de um circulo
        System.out.println("Qual é o raio do ciruclo");
        double raio = sc.nextDouble();
        double perimetro = Math.PI * 2 * raio;
        double area = Math.pow(raio,2);
        System.out.println()

        sc.close();

    }
}