import java.util.Scanner;

public class EntradaFixacao {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Qual sua cidade?:"  );
      String cidade = sc.nextLine();

      System.out.println("Informe seu estado:" );
      String estado = sc.nextLine();

      //\n quebra linha
      //crie duas variaveis, uma para armezenar a populaçao da cidade e outra
      // o tamanho da cidade

      System.out.println("Digite a população da sua cidade:" );
      int população = sc.nextInt();
      System.out.println("Digite o tamanho da sua cidade:" );
     double tamanho = sc.nextDouble();
      System.out.println("cidade" + cidade + "\nestado" + estado + "\npopulação");

      sc.close();

    }
}