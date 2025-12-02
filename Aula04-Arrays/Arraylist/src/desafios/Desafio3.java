package desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Desafio 03: Verificar Elementos Duplicados
        //
        //Crie uma lista de números e descubra quais números são pares. Crie uma nova lista somente com os números
        //pares.
        //
        //Exemplo:
        //
        //Lista de números: [10, 20, 5, 6, 9, 5]
        //
        //Números duplicados: [10, 20,6]

        ArrayList<Integer> numeroPares = new ArrayList<>();
        ArrayList<Integer> Listanumero = new ArrayList<>();

        while(true){
           System.out.println("Digite um numero {0 para parar}: ");
           int numero = sc.nextInt();

           if(numero == 0){
               break;

           } else {

           }
       }

        for(int Valor: numero) {
            System.out.println(Valor);
            System.out.println(numero.indexOf("2"));
            System.out.println(numero.indexOf("4"));
            System.out.println(numero.indexOf("6"));
            System.out.println(numero.indexOf("8"));
            System.out.println(numero.indexOf("10"));



        }





       sc.close();
    }
}