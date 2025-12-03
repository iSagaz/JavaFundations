package desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio1 {
   public  static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       ArrayList<String> pedidos = new ArrayList<>();

       int opcao;

       while (true) {
           System.out.println("SISTEMA DE PEDIDOS");
           System.out.println("1 - Fazer pedido");
           System.out.println("2 - Listar pedidos");
           System.out.println("3 - Atualizar pedidos");
           System.out.println("4 - Cancelar pedidos");
           System.out.println("5 - Sair");
           opcao = sc.nextInt();
           sc.nextLine();
           switch (opcao) {
               case 1:
                   System.out.println("Informe seu Pedido: ");
                   String pedido = sc.nextLine();
                   pedidos.add(pedido);
                   System.out.println("Seu pedido cadastrado com sucesso!");
                   break;

               case 2:
                   if (pedidos.isEmpty()) {
                       System.out.println("Nenhum pedido encontrado!");
                       break;

                   } else {

                       for (String lanche : pedidos) {
                           System.out.println("\n Listas de pedidos");
                           System.out.println(pedidos.indexOf(lanche) + " - " + lanche);
                           break;
                       }
                   }
               case 3:
                   System.out.println("\n ------ Atualizar Pedido");
                   System.out.println("Informe o Id do Pedido: ");
                   int idPedido = sc.nextInt();
                   System.out.println("Informe o pedido: ");
                   String nomePedido = sc.nextLine();
                   pedidos.set(idPedido, nomePedido);
                   break;


               case 4:
                   System.out.println("\n ------ Excluir cadastro do aluno");
                   System.out.println("Informe o Id do aluno: ");
                   int idAluno2 = sc.nextInt();
                   pedidos.remove(idAluno2);
                   break;

               case 5:
                   System.out.println("\n ------ Sair do programa");
                   return;

                        }
                    }

           }
       }
