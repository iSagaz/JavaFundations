package entidade;

import java.util.ArrayList;
import java.util.Scanner;

public class MainAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciarAlunos gerenciarAlunos = new GerenciarAlunos();

        int opcao;

        while(true){
            System.out.println("Menu de opcoes");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Alterar");
            System.out.println("4 - Remover");
            System.out.println("5 - Sair");
            System.out.println("ESCOLHA UMA OPCAO:");
            opcao = sc.nextInt();
            sc.nextLine();
            switch(opcao){

                case 1 -> {
                    System.out.println("Digite o nome do aluno:");
                    String nome = sc.nextLine();

                    System.out.println("Digite a nota do aluno:");
                    double notaAluno = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Digite a nota do aluno:");
                    double nota2 = sc.nextDouble();
                    sc.nextLine();

                    Aluno aluno = new Aluno(nome, notaAluno, nota2);
                    gerenciarAlunos.adicionarAluno(aluno);

                }


                }

            }
        }
    }

