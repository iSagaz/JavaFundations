package desafio;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args){
    // crie um programa desafiando a maquina
    // a maquina vai gerar um numero de 0 a 100 e voce vai tentar acertar esse numero
    // o programa so vai parar quando voce acertar, informe se o que o usuario digitou
    // a maior ou menor o que gerou

        Scanner sc = new Scanner(System.in);

        int numeroAleatorio = (int) (Math.random() * 101);
        System.out.println(numeroAleatorio);
        while(true) {
            System.out.println("Digite um numero de 0 a 100: ");
            int numero = sc.nextInt();

            if(numero < numeroAleatorio){
                System.out.println("Numero muito baixo");
            }

            else if(numero > numeroAleatorio) {
                System.out.println("Numero muito alto");

            } else {

                System.out.println("Parabens, voce acertou");
                break;

            }



        }

              sc.close();
    }
}