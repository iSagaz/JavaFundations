import entidades.Lanches;
import entidades.ListaPedidos;
import entidades.MenuLanches;
import entidades.Pedido;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuLanches menu = new MenuLanches();
        ListaPedidos listaPedidos = new ListaPedidos();
        int opcao;
        while (true) {
            System.out.println("_____Menu de opcoes____");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Atualizar");
            System.out.println("4 - Excluir");
            System.out.println("5 - Calcular valor total");
            System.out.println("6 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1 -> {
                    menu.exibirCardapio();
                    System.out.println("Digite a opcao desejada: ");
                    int opcao2 = sc.nextInt();
                    sc.nextLine();
                    var lancheEscolhido = menu.getCardapio(opcao2);
                    System.out.println(lancheEscolhido.getNome());
                    System.out.println(lancheEscolhido.getPreco());
                    System.out.println("Digite a quantidade desejada");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    Pedido pedido = new Pedido(lancheEscolhido.getNome(), quantidade,
                            lancheEscolhido.getPreco());

                    listaPedidos.adicionarPedido(pedido);

                }
                case 2 -> {
                    listaPedidos.ListarPedidos();
                    System.out.println("Digite a opcao desejada: ");
                    int opcao2 = sc.nextInt();
                    sc.nextLine();

                }
                case 3 -> {
                    listaPedidos.ListarPedidos();
                    System.out.println("Digite o id do pedido que deseja atualizar: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    menu.exibirCardapio();
                    System.out.println("Digite o lanche desejado: ");
                    int id2 = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite a quantidade desejada: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    var alterarPedido = menu.getCardapio(id2);
                    System.out.println(alterarPedido.getNome());
                    System.out.println(alterarPedido.getPreco());

                    listaPedidos.AlterarPedido(id, alterarPedido.getNome(),
                            quantidade, alterarPedido.getPreco() );




                }
                case 4 -> {
                    listaPedidos.ListarPedidos();
                    System.out.println("Digite o id do lanche que deseja remover:");
                    int id = sc.nextInt();
                    sc.nextLine();
                    listaPedidos.ExcluirPedido(id);
                }
                case 5 -> {
                    listaPedidos.ListarPedidos();
                    System.out.println("O valor total foi de R$: " + listaPedidos.CalcularTotalPedido());


                }

            }
        }
    }
}

