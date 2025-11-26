public class VerificaNota {
   public static void main(String[] args){

       Scanner sc = new Scanner(System.in);

       System.out.println("Digite a nota: ");
       Int nota = sc.nextInt();

       if ( nota >= 70 ) {
           System.out.println("Aprovado");
       } else if ( nota >= 50) {
           System.out.println("Recuperação");
       } else {
           System.out.println("Reprovado");
       }
       sc.close();
   }
}