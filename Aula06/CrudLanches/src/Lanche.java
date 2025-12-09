import java.util.Scanner;

public class Lanche {
        private String nome;
        private int quantidade;
        private double preco;


        public Lanche(String nome, int quantidade, double preco) {
            this.nome = nome;
            this.quantidade = quantidade;
            this.preco = preco;
        }


        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }


        public double calcularPrecoTotal() {
            return this.quantidade * this.preco;
        }


        @Override
        public String toString() {
            return "|" + this.nome + "|" + this.quantidade + "|" + this.preco + "|";
        }
    }




