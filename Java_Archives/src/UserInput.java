import java.util.Scanner;
// O scanner vem desse import

// Input() em java;

public class UserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o seu nome? ");
        String name = scanner.nextLine().strip();
        System.out.println("E qual é a sua idade?");
        int idade = scanner.nextInt();

        // Preciso limpar o "scanner" pro java não interpretar o food como se fosse \n e pular a parte da food
        // Lembrando que ele intepreta o nextInt() só o número e não o \n que aparece (nextline) por que ele é só
        // next INT e não next LINE. Aí o \n continua no scanner, assim pulando o "food"
        scanner.nextLine();
        // Agora já posso usar ele normalmente

        System.out.println("Por último, qual sua comida favorita?");
        String food = scanner.nextLine().strip();

        System.out.println("Seu nome é "+name+", você tem "+idade+" anos de idade e você ama "+food);

    }

}
