package exercicios;

import java.util.Scanner;

public class Desafios1a5 {
    public static void main(String[] args) {
        // Desafio 1 nota do aluno

        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();

        if (nota >= 7) {
            System.out.println("Aprovado ");
        } else if (nota >= 5) {
            System.out.println("Recuperação ");
        } else {
            System.out.println("Reprovado ");
        }

        // Desafio 2 calculadora de multa por excesso de velocidade

        System.out.println("Digite a velocidade do veiculo: ");
        int velocidade = sc.nextInt();
        
        if (velocidade > 90 ) {
        double

        }
        } else if (velocidade > 90) {
             System.out.println("Pagara multa de 10 reais");
        }

        //Desafio 3 Advinhe o numero

        System.out.println("Escolha um numero de 1 a 10 :");
        int numero = sc.nextInt();
        int aleatorio = (int) (Math.random() * 10);

        if (numero == aleatorio) {
            System.out.println("Parabens Voce acertou!");
        } else {
            System.out.println("Poxa que pena, voce errou!");

            System.out.println("O numero era " + aleatorio);
        }



         // Desafio 4 Conversor de moedas

        System.out.println("Digite um valor em reais:");
        double valor = sc.nextDouble();
        System.out.println("Digite qual moeda gostaria de converter");
        String moeda = sc.next();
        double dolar = sc.nextDouble();
        double libra = sc.nextDouble();
        double euro = sc.nextDouble();









        // Desafio 5 Calculo de taxa de emprestimo
        System.out.println("Digite o valor do seu emprestimo: ");
        double emprestimo = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite o numero de parcelas:  ")
        System.out.println("6x - 5% de juros"
        System.out.println("12x - 10% de juros")
                System.out.println("24x - 20% de juros")

        int parcelas = sc.nextInt();
        double valorFinal;

        if (parcelas == 6) {

            System.out.println("O valor final é de " + valor final)
    }

        







        sc.close();
        }
    }