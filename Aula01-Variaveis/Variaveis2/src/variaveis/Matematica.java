package variaveis;

public class Matematica {
   public static void main (String[] args){
       //potencia
      int base = 2;
      int expoente = 3;
       double potencia = Math.pow(2,3);
      System.out.println("potencia = " + potencia);

      //raiz quadrada
      double numero = 16;
      double raizQuadrada = Math.sqrt(numero);
      System.out.println("raizQuadrada = " + raizQuadrada);

      //random gerar valores aleatorios
       int aleatorio = (int) (Math.random() * 10;
       System.out.println(aleatorio);

       //pi
       double pi = Math.PI;
    System.out.println(pi);

   }
}