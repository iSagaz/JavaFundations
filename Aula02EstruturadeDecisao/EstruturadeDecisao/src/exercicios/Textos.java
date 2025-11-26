package exercicios;

public class Textos {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Voce esta gravida [S/N]: ");
      String resposta = sc.nextLine();

      if(resposta.equals("S")) {
          System.out.println("Ela nao vai pagar o trem");
      } else {
          System.out.println("Ela vai pagar o trem");
      }
      //comparar igualdade em valores do tipo String é usado o equals()


      sc.close();
    }
}
