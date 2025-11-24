package variaveis;

public class VariaveisRegras {
  public static void main(String[] args){
    //Informar o tipo de valor que sera armazenado
    //nome = "Manoel"; //Nao pode

      String nome = "Manoel"; //esse pode

      //nao pode atribuir valores inadequados a um tipo de varival
      //String pessoa = 10; //nao pode
      //String pessoa = "10"; //esse sim pode

      //nao podemos atribuir o mesmo nome para duas variaveis
      String nome2 = "Diego";

      //Nomes de variaveis nao podem começar com numeros
      //String 3nome = "Diego"; nao pode
      String nome3 = "Diego"; //pode

      //camelCase
      String nomeCompleto = "João Ricardo";
      //snake_case
      String nome_completo = "João Roberto";
      System.out.println(nome_completo);

      //nao podemos usar palavras reservadas como variaveis

    }
}