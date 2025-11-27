package desafios;

import java.util.Scanner;

public class Desafio2a5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Desafio 2: Classificaçao de Triângulos


        System.out.println("Digite o lado A: ");
        int ladoA = sc.nextInt();
        System.out.print("Digite o lado B: ");
        int ladoB = sc.nextInt();
        System.out.println("Digite o lado C: ");
        int ladoC = sc.nextInt();

        boolean ladoAB = ladoA + ladoB > ladoC;
        boolean ladoAC = ladoA + ladoC > ladoB;
        boolean ladoBC = ladoB + ladoC > ladoA;

        if (ladoAB && ladoAC && ladoBC) {
            if (ladoA == ladoB && ladoA == ladoC) {
                System.out.println("Esse é um triangulo equilatero");

            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("Esse é um triangulo isosceles");

            } else {
                System.out.println("Esse é um triangulo escaleno");


            }
        }


        //Desafio 3: Calculadora de Seguro de Automóveis

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite seu sexo [M/F]: ");
        String sexo = sc.next();

        System.out.println("Digite anos de motorista: ");
        int anos = sc.nextInt();

        if (idade < 25) {
            if (sexo.equals("M")) ;
            System.out.println("O seu seguro ficou 2000 reais");
        } else {
            System.out.println("O seu seguro ficou 1200 reais");
        }

        //Desafio 4: Sistema de Descontos

        System.out.println("Qual o valor da sua compra e o numero de itens adquiridos: ");
        double compra = sc.nextDouble();
        int itens = sc.nextInt();
        double total;

        if (compra >= 1000) {
            total = compra * 0.8;
            System.out.printf("O valor sem desconto é %.2f e com desconto é de %.2f", compra,total);
        } else if (compra >= 500 || itens >= 5) {
            total = compra * 0.9;
            System.out.printf("O seu valor sem desconto é %.2f e com desconto é %.2f", compra, total);
        } else if (compra >= 300 || itens >= 3) {
            total = compra * 0.95;
            System.out.println("O seu valor sem desconto é %.2f e com desconto é %.2f");
        } else {
            System.out.println("O valor nao tem desconto, ficando assim %.2f");
        }
          //Desafio 5 Validação de Login e Senha
            System.out.println("\nFaça o login:");
            sc.nextLine();
            String login = sc.nextLine();

            System.out.println("Entre com sua senha agora: ");
            String senha = sc.nextLine();

            if(login.length() >= 5 && senha.length() >= 8){
                System.out.println("Senha e login validos" );
            } else {
                System.out.println("Login ou senha incorretos");
            }

            sc.close();
    }
}
