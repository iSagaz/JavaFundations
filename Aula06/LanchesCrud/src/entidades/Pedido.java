package entidades;

public class Pedido {
    private String nome;
    private int quantidade;
    private double preco;

    //inicializa o pedido com os valores dos lanches


    public Pedido(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    //consultar atributos privados
    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }
    // alterar ou atualizar atributos privados
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    // calcular valor total
    public double calcularvalorTotal() {
        return this.preco * this.quantidade;
    }
    @Override
    public String toString() {
        return "|" + nome + "|" + quantidade + "|" + preco + "|" + calcularvalorTotal();

    }
}
