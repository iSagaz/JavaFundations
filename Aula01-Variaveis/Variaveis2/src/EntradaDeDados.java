import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //metodo next - capturar a palavra digitada pelo usuario
        System.out.println("Digite seu nome: ");
        String nome = sc.next();
        sc.nextLine();
        System.out.println(nome);

        //metodo nextline - capturar a linha digitada pelo usuario
        System.out.println("Digite seu nome completo: ");
       String nomeCompleto = sc.nextLine();
        System.out.println(nomeCompleto);

       //metodo nextInt - capturar numeros inteiros
       System.out.println("Digite sua idade:" );
       int idade = sc.nextInt();

       //metodo NextDouble - capturar numeros decimais
        System.out.println("Digite sua altura:" );
        double altura = sc.nextDouble();

        System.out.println("0 " + nomeCompleto + "tem" + idade + "anos" + "e mede" + altura + "n" );
        sc.close();
    }
}