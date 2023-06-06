import java.util.Scanner;

public class LivrariaApplication {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       
       System.out.println("Digite seu nome:");
       String nome = sc.nextLine();
       System.out.println("Digita idade");
       int idade = sc.nextInt();
       

       if (idade>=18){
        System.out.println("MAIOR DE IDADE");
       }else{ System.out.println("MENOR DE IDADE");

       }
       

       System.out.println("olá"+nome+"!");
    
       sc.close();
    }
}
