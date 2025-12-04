package exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CrudAvancado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> menuLanches = new ArrayList<>(Arrays.asList(
                "X - Burguer",
                "X - EGG",
                "X - Bacon",
                "X - Salada",
                "X - Tudo"

        ));

        ArrayList<Double> menuPrecos = new ArrayList<>(Arrays.asList(
                22.9,
                24.9,
                26.9,
                26.9,
                29.9

        ));
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
                    System.out.println("\nAtualizar cadastro do aluno: ");
                    System.out.println("Digite o ID do aluno: ");
                    int idAluno = sc.nextInt();
                    sc.nextLine();

                    if (idAluno >= 0 && idAluno < nomealunos.size()) {
                        System.out.println("Digite o novo nome do aluno: ");
                        String novoNome = sc.nextLine();

                        System.out.println("Digite a nova idade do aluno: ");
                        int idadeAlunos2 = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Digite a nova Nota do aluno: ");
                        double notaAluno2 = sc.nextDouble();


                        nomealunos.set(idAluno, novoNome);
                        idadeAlunos.set(idAluno, idadeAlunos2);
                        notasAlunos.set(idAluno, notaAluno2);

                        System.out.println("Atualização feita com sucesso!");
                    } else {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;



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



















