import java.util.Scanner;

public class MainPedido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lanche lanche = new Lanche();

        int opcao;

        while(true){
            System.out.println("Menu de opções:");
            System.out.println("1 - Cadastrar Lanche");
            System.out.println("2 - Listar Lanches");
            System.out.println("3 - Alterar Lanche");
            System.out.println("4 - Remover Lanche");
            System.out.println("5 - Calcular Total do Pedido");
            System.out.println("6 - Sair");
            System.out.println("Escolha uma opção:");
            opcao = sc.nextInt();
            sc.nextLine();  // Consome a linha em branco após o número

            switch(opcao){
                case 1 -> {
                    System.out.println("Digite o nome do lanche:");
                    String nome = sc.nextLine();

                    System.out.println("Digite a quantidade do lanche:");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o preço do lanche:");
                    double preco = sc.nextDouble();
                    sc.nextLine();

                    Lanche lanche = new Lanche(nome, quantidade, preco);
                    lanche.adicionarLanche(lanche);  // Adiciona o lanche ao gerenciamento
                }

                case 2 -> {
                    // Listar todos os lanches
                    lanche.listarLanches();
                }

                case 3 -> {
                    // Atualizar um lanche
                    lanche.listarLanches();
                    System.out.println("Digite o ID do lanche que deseja alterar:");
                    int idLanche = sc.nextInt();
                    sc.nextLine();  // Consome a linha em branco

                    System.out.println("Digite o novo nome do lanche:");
                    String nome = sc.nextLine();

                    System.out.println("Digite a nova quantidade:");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o novo preço:");
                    double preco = sc.nextDouble();
                    sc.nextLine();

                    lanche.atualizarLanche(idLanche, nome, quantidade, preco);  // Atualiza o lanche
                }

                case 4 -> {
                    // Remover um lanche
                    lanche.listarLanches();
                    System.out.println("Digite o ID do lanche que deseja remover:");
                    int idLanche = sc.nextInt();
                    sc.nextLine();
                    lanche.excluirLanche(idLanche);  // Remove o lanche
                }

                case 5 -> {
                    // Calcular o total do pedido
                    double totalPedido = 0;
                    for (Lanche lanche : lanche.setNome()) {
                        totalPedido += lanche.calcularPrecoTotal();  // Soma os totais dos lanches
                    }
                    System.out.println("O valor total do pedido é: R$ " + totalPedido);
                }

                case 6 -> {
                    System.out.println("Programa finalizado com sucesso");
                    return;  // Finaliza o programa
                }

                default -> {
                    System.out.println("Escolha inválida. Tente novamente.");
                }
            }
        }
    }
}
