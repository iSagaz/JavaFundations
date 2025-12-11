package entidades;

public class Lanches {
    private String nome;
    private double preco;

    public Lanches(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    // getters e setters
    //getters serve para pegar as informacoes dos atributos
    //setters serve para alterar as informacoes dos atributos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    // exibir as informacoes dos atributos
    @Override
    public String toString() {
        return "Lanches{" +
                "nome ='" + nome + '\'' +
                ", preco =" + preco +
                '}';
    }
}
