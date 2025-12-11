package entidades;

import java.util.ArrayList;

public class MenuLanches {
    private ArrayList<Lanches> cardapio = new ArrayList<>();


    //inicializa a lista com os objetos lanches
    public MenuLanches() {


        cardapio.add(new Lanches("X -Tudo", 30));
        cardapio.add(new Lanches("X -Bacon", 22));
        cardapio.add(new Lanches("X - Salada", 24));
        cardapio.add(new Lanches("X - Egg", 26));
        cardapio.add(new Lanches("X - Queijo", 26));
        cardapio.add(new Lanches("X - Frango", 30));
    }
    //percorre a lista cardapio e mostra todos os lanches cadastrados
    public void exibirCardapio() {
        System.out.println("_____MENU LANCHES_____");
        System.out.println("| ID | lANCHE | PRECO |");
        for (int i = 0; i < cardapio.size(); i++) {
            System.out.println("|" + i + " | " + cardapio.get(i).toString());
        }
    }
    //
    public  Lanches getCardapio(int index) {
        return cardapio.get(index);
    }
}

