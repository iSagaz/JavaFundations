package org.example;


import org.example.entidades.Aluno;
import org.example.entidades.GerenciarAlunos;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciarAlunos gerenciarAlunos = new GerenciarAlunos();

        Scanner sc = new Scanner(System.in);
        int opcao;

        while (true) {
            System.out.println("Menu opçoes");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Atualizar aluno");
            System.out.println("4 - Excluir aluno");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o nome do aluno: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite a nota do aluno: ");
                    int nota = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Digite a segunda nota do aluno: ");
                    int nota2 = sc.nextInt();
                    sc.nextLine();

                    Aluno aluno = new Aluno(nome, nota, nota2);
                    gerenciarAlunos.cadastrarAluno(aluno);
                }
                case 2 -> {
                    gerenciarAlunos.listarAlunos();
                }
                case 3 -> {
                    gerenciarAlunos.listarAlunos();
                    System.out.println("Digite o id do aluno que deseja atualizar: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Digite o nome do aluno: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite a nota do aluno: ");
                    int nota = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Digite a segunda nota do aluno: ");
                    int nota2 = sc.nextInt();
                    sc.nextLine();
                    gerenciarAlunos.alterarAluno(id, nome, nota, nota2);

                } case 4 -> {
                    gerenciarAlunos.listarAlunos();
                    System.out.println("Digite o id do aluno que deseja excluir da lista: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    gerenciarAlunos.excluirAluno(id);
                } case 5 -> {
                    System.out.println("Saiu do programa");
                    return;
                }
            }
        }
    }
}