package desafios;

import java.util.*;

public class Desafio5 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       //Desafio 05: Palavras de Comprimento Par ou Ímpar
       //
       //Solicite que o usuário insira várias palavras. Ordene-as pelo comprimento (do menor para o maior) e exiba o resultado.
       //
       //Exemplo:
       //
       //Palavras inseridas: [Java, Python, App, Aplicação]
       //
       //Palavras com comprimento par: [Python, Aplicação]
       //
       //Palavras com comprimento ímpar: [Java, App]

       ArrayList<String> lista = new ArrayList<>();
       ArrayList<String> listaPar = new ArrayList<>();
       ArrayList<String> listaImPar = new ArrayList<>();
       lista.add("Computador");
       lista.add("Colher");
       lista.add("Escada");
       lista.add("Mouse");
       lista.add("Servidor");
       lista.add("Cadeira");

       for(String objeto: lista){
           int tamanhoObjetos = objeto.length();
           int resto = tamanhoObjetos % 2;
           if(resto==0){
               listaPar.add(objeto);

           } else {
               listaImPar.add(objeto);
           }
       }

       for(int i = 0; i <lista.size(); i++){
       for(int j = 0; j <lista.size(); j++){
           if(i < j) {
               comprimento1 = lista.get(i).length();
               comprimento2 = lista.get(j).length();

               if (comprimento1 > comprimento2){
                buffer = lista.get(i)
                buffer2 = lista.get(j);
                lista.set(j, buffer);
                lista.set(i, buffer2);


              }
           }
        }
   }



       sc.close();
   }
}
