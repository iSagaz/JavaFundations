package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class CrudeAvancado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomealunos = new ArrayList<>();
        ArrayList<Double> notasAlunos = new ArrayList<>();
        ArrayList<Integer> idadeAlunos = new ArrayList<>();

        int opcao;

        while (true) {
            System.out.println("Sistema Crud de Alunos");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Consultar Aluno");
            System.out.println("3 - Atualizar cadastro do aluno");
            System.out.println("4 - Excluir Aluno");
            System.out.println("5 - Sair do programa");
            System.out.println("Escolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {


                case 1:
                    System.out.println("Nome do aluno: ");
                    String nomeAluno = sc.nextLine();

                    System.out.println("Idade do aluno: ");
                    int idadeAluno = sc.nextInt();

                    System.out.println("Notas do aluno: ");
                    double notasAluno = sc.nextDouble();


                    nomealunos.add(nomeAluno);
                    idadeAlunos.add(idadeAluno);
                    notasAlunos.add(notasAluno);

                    System.out.println("Cadastro do aluno realizado com sucesso! ");
                    break;

                case 2:
                    System.out.println("\n Lista de alunos: ");
                    for (int i = 0; i < nomealunos.size(); i++) {
                        System.out.println(i + " - Nome: " + nomealunos.get(i) + "Idade: " + idadeAlunos.get(i) + " Notas: " + notasAlunos.get(i));


                    }
                    break;

                case 3:
                    System.out.println("\n Atualizar cadastro do aluno: ");
                    System.out.println("Digite o ID do aluno: ");
                    int idAluno = sc.nextInt();
                    nomealunos.remove(idAluno);
                    sc.nextLine();

                    System.out.println("Digite o idade do aluno: ");
                    int idadeAlunos2 = sc.nextInt();

                    System.out.println("Digite a Nota do aluno: ");
                    double notaAluno2 = sc.nextDouble();

                    System.out.println("Atualizacao feita com sucesso! ");
                    break;

                   nomealunos.set(idAluno, nomealunos);
                   idadeAlunos.set(idadeAlunos2, idadeAlunos);
                   notasAlunos.set(notaAluno2, notasAluno);

                case 4:
                    System.out.println("\n excluir cadastro do aluno: ");
                    System.out.println("Digite o ID do aluno: ");
                    int idRemover = sc.nextInt();
                    sc.nextLine();
                    nomealunos.remove(idRemover);
                    idadeAlunos.remove(idRemover);
                    notasAlunos.remove(idRemover);
                    break;
                case 5:
                    System.out.println("Programa Encerrado");
                    break;

            }
        }
    }
}



















