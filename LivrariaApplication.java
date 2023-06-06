import java.util.Scanner;

public class LivrariaApplication {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       
       System.out.println("Digite seu nome:");
       String nome = sc.nextLine();
       System.out.println("Digita idade");
       String idade = sc.nextLine();
       sc.close();

       double maior = 18;

       if (maior>18){
        System.out.println("MAIOR DE IDADE");
       }
       if (maior<18){
        System.out.println("MENOR DE IDADE");
        
        ;
       }
       System.out.println("olá"+nome+"!");
       System.out.println(maior);
    }
}