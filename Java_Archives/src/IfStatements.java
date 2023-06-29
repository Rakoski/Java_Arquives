import java.util.Objects;
import java.util.Scanner;

public class IfStatements {

    public static void main(String[] args) {

        while(true) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            if (idade > 70) {
                System.out.println("OK boomer");
            } else if (idade >= 18) {
                System.out.println("Você é um adulto");
            } else if (idade >= 13) {
                System.out.println("Você é um adolescente");
            } else {
                System.out.println("Você é uma criança!");
            }

            System.out.println("Deseja continuar? ");
            String resposta = scanner.nextLine();

             if(resposta.equals("não")){
                 System.out.println("Obrigado por usar o programa!");
                 try {
                     Thread.sleep(2000); // Sleep for 2 seconds
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
                scanner.close();
                break;
            }
            else {
                continue;
            }
        }
    }

}
