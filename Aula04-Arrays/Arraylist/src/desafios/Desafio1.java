package desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>(6);
        nomes.add("Pedro");
        nomes.add("Ana");
        nomes.add("Amanda");
        nomes.add("Rodrigues");
        nomes.add("Antonio");
        nomes.add("Juanito");

        System.out.println("Digite a primeira letra: ");
        String letra = sc.nextLine();

        char inicial = 'A';
        nomes.removeIf(String itens -> itens.charAt(0) == "A");
        System.out.println("Nomes encontrados com A: " + nomes);


        sc.close();
    }
}
