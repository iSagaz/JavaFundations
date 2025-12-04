package desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Desafio1 {
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
        ArrayList<String> pedidos = new ArrayList<>();
        ArrayList<Integer> ValorLanchePedido = new ArrayList<>();
        ArrayList<Double> Quantidade = new ArrayList<>();
        ArrayList<Integer> ValorTotal = new ArrayList<>();

        int opcao;

        while (true) {
            System.out.println("SISTEMA DE PEDIDOS");
            System.out.println("1 - Fazer pedido");
            System.out.println("2 - Listar pedidos");
            System.out.println("3 - Atualizar pedidos");
            System.out.println("4 - Cancelar pedidos");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma opção do sistema de pedidos:");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("/n ------- CARDAPIO ------");
                    for (int i = 0; i < menuLanches.size(); i++) {
                        System.out.println(i + " - " + menuLanches.get(i) + " - " + menuPrecos.get(i) );
                    }

                    System.out.println("Digite o número do item do pedido:");
                    int indicePedido = sc.nextInt();
                    sc.nextLine();

                    String pedido = menuLanches.get(indicePedido);

                    System.out.println("Selecione a quantidade de pedidos:");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Informe o valor do lanches:");
                    double quantidadeLanchesPedidos = sc.nextDouble();
                    sc.nextLine();

                    double valorLanchePedido = menuPrecos.get(indicePedido);
                    sc.nextLine();

                    double valorTotalPedido = ValorLanchePedido * quantidadeLanchesPedidos ;

                        pedidos.add(valorTotalPedido);
                        ValorLanchePedido.add(IndicePedido);


                    System.out.println("Seu pedido cadastrado com sucesso!");
                    break;

                case 2:
                    if (pedidos.isEmpty()) {
                        System.out.println("Nenhum pedido encontrado!");
                    } else {
                        System.out.println("\nLista de pedidos:");
                        for (int i = 0; i < pedidos.size(); i++) {
                            System.out.println(i + "Pedido: " + pedidos.get(i)  + "Quantidade: " + pedidos.get(i) + "ValorLanchePedido" + pedidos.get(i) + "ValorTotal: " + pedidos.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n ------ Atualizar Pedido ------");
                    System.out.println("Informe o Id do Pedido: ");
                    int idPedido = sc.nextInt();
                    sc.nextLine();
                    if (idPedido >= 0 && idPedido < pedidos.size()) {
                        System.out.println("Informe o novo pedido: ");
                        String nomePedido = sc.nextLine();
                        pedidos.set(idPedido, nomePedido);
                        System.out.println("Pedido atualizado com sucesso!");
                    } else {
                        System.out.println("Pedido não encontrado!");
                    }
                    break;

                case 4:
                    System.out.println("\n ------ Cancelar pedido ------");
                    System.out.println("Informe o Id do pedido: ");
                    int idPedido2 = sc.nextInt();
                    sc.nextLine();
                    if (idPedido2 >= 0 && idPedido2 < pedidos.size()) {
                        pedidos.remove(idPedido2);
                        System.out.println("Pedido removido com sucesso!");
                    } else {
                        System.out.println("Pedido não encontrado!");
                    }
                    break;

                case 5:
                    System.out.println("\n ------ Sair do programa ------");
                    return;

            }
        }
    }
}


