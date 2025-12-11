package entidades;

import java.util.ArrayList;

public class ListaPedidos {
    private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

    // adicionar pedido na lista pedidos
    public void adicionarPedido(Pedido pedido) {
        if(pedido.getQuantidade() < 0) {
            System.out.println("Digite uma quantidade maior do que zero");

        } else {
            pedidos.add(pedido);
            System.out.println("Pedido adicionado com sucesso");
        }
    }
    public void ListarPedidos() {
        for(int i  = 0; i < pedidos.size(); i++) {
            System.out.println(pedidos.get(i).toString());
        }
    }
    public void AlterarPedido(int id,String nome, int quantidade, double preco) {
        if(quantidade < 0) {
            System.out.println("Digite uma quantidade maior do que zero");
        } else {
            var pedidoAlterado = pedidos.get(id);
            pedidoAlterado.setNome(nome);
            pedidoAlterado.setQuantidade(quantidade);
            pedidoAlterado.setPreco(preco);
            System.out.println("Pedido alterado com sucesso");
        }
    }
    public void ExcluirPedido(int id) {
        if(pedidos.contains(id)) {
            pedidos.remove(id);
            System.out.println("Pedido removido com sucesso");
        }
    }
    public double CalcularTotalPedido() {
        double total = 0;
        for(Pedido pedido : pedidos) {
            total = total + pedido.getPreco();


        }
        return total;

    }
}
