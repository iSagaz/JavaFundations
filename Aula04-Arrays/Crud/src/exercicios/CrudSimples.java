package exercicios;

import java.util.ArrayList;
import java.util.Scanner;


public class CrudSimples {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       ArrayList<String> nomes = new ArrayList<>();

       int opcao;

       while(true){
           System.out.println("Sistema Crud de Alunos");
           System.out.println("1 - Cadastrar Aluno");
           System.out.println("2 - Consultar Aluno");
           System.out.println("3 - Atualizar cadastro do aluno");
           System.out.println("4 - Excluir Aluno");
           System.out.println("5 - Sair do programa");
           System.out.println("Escolha uma opcao: ");
           opcao = sc.nextInt();
           sc.nextLine();
           switch (opcao){
               case 1:
                   System.out.println("Nome do aluno: ");
                   String nome = sc.nextLine();
                   nomes.add(nome);
                   System.out.println("Aluno cadastrado com sucesso!");
                   break;

                   case 2:
                       System.out.println("\n ------ Lista de Alunos");

                       if(nomes.isEmpty()){
                           System.out.println("Nenhum aluno encontrado!");

                       } else {
                           for (String aluno : nomes) {
                               System.out.println(nomes.indexOf(aluno) + " - " + aluno);

                               break;
                           }
                       }


                   case 3:
                       System.out.println("\n ------ Atualizar cadastro do aluno");
                       System.out.println("Informe o Id do aluno: ");
                       int idAluno = sc.nextInt();
                       System.out.println("Informe o Nome do aluno: ");
                       String nomeAluno = sc.nextLine();
                       nomes.set(idAluno, nomeAluno);
                       break;

                   case 4:
                       System.out.println("\n ------ Excluir cadastro do aluno");
                       System.out.println("Informe o Id do aluno: ");
                       int idAluno2 = sc.nextInt();
                       nomes.remove(idAluno2);
                       break;

                   case 5:
                       System.out.println("\n ------ Sair do programa");
                       return;
                           }
                           }
           }
       }


