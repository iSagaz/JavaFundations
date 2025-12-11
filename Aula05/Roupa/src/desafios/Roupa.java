package desafios;

public class Roupa {

    String marca;
    String tipo;
    String tamanho;
    int quantidade;
    double valor;


    @Override
    public String toString() {
        return "Roupa{" +
                "marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", quantidade=" + quantidade +
                ", valor=" + valor +
                '}';
    }

    public Roupa(String marca, String tipo, String tamanho, int quantidade, double valor) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.valor = valor;

        public double valorTotal ( int quantidade){
            return this.quantidade * this.valor;
        }


        public void vendas ( int quantidade){
            this.quantidade += quantidade;

            if(this.quantidade > 0){
                this.quantidade -= quantidade;

            }


        public void abastecer(int quantidade){
                if(quantidade > 0){
                    this.quantidade += quantidade;
                    System.out.println("Estoque abastecido com sucesso!");
                } else {

                }
            }
        }

    }
}
