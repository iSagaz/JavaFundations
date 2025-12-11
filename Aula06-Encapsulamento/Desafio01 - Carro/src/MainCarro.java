public class MainCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Ford", 1993, 50);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getAno());
        System.out.println(carro1.getVelocidadeMaxima());


        carro1.setModelo("Ferrari");
        System.out.println(carro1.getModelo());

        carro1.setAno(1998);
        System.out.println(carro1.getAno());

        carro1.setVelocidadeMaxima(80);
        System.out.println(carro1.getVelocidadeMaxima());;
    }
}



