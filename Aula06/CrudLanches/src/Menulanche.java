import java.util.ArrayList;

public class Menulanche {
    private ArrayList<Lanche> lanche = new ArrayList<Lanche>();

    public Menulanche() {
        lanche.add(new Lanche("X - tudo", 1,30));
        lanche.add(new Lanche("X - Cheddar", 1,40));
        lanche.add(new Lanche("X - carne", 1,20));
        lanche.add(new Lanche("X - Egg", 1,35));
        lanche.add(new Lanche("X - Bacon", 1,32));
    }

    public void adicionarLanche(Lanche l) {
        lanche.add(l);
        System.out.println("Lanche adicionado com sucesso!");
    }


    public void listarLanches() {
        if (lanche.isEmpty()) {
            System.out.println("Nenhum lanche encontrado.");
        } else {
            for (int i = 0; i < lanche.size(); i++) {
                System.out.println("|" + i + "| " + lanche.get(i).toString());
            }
        }
    }


    public void atualizarLanche(int id, String nome, int quantidade, double preco) {
        if (id >= 0 && id < lanche.size()) {
            Lanche l = lanche.get(id);
            l.setNome(nome);
            l.setQuantidade(quantidade);
            l.setPreco(preco);
            System.out.println("Lanche atualizado com sucesso!");
        } else {
            System.out.println("Lanche com ID " + id + " não encontrado.");
        }
    }


    public void excluirLanche(int id) {
        if (id >= 0 && id < lanche.size()) {
            lanche.remove(id);
            System.out.println("Lanche removido com sucesso!");
        } else {
            System.out.println("Lanche com ID " + id + " não encontrado.");
        }
    }
}





