package exercicios;

import java.util.Scanner;

public class Desafio {
   public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] pontuacao = new int[10];
        double soma = 0;

        for(int i = 0; i <= pontuacao.length; i++) {
            System.out.println("Digite a nota do estudante:");
            int nota_estudante = sc.nextInt();
            soma += nota_estudante;
            pontuacao[i] = nota_estudante;
        }
        for(int pontos: pontuacao){
            System.out.println("Nota :" + pontos);
        }

       sc.close();
   }
}
