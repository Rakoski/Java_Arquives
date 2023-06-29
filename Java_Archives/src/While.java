import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        // while loops execute a block of code as long as it's condition remains true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        do {
            System.out.println("Entre seu nome:");
            name = scanner.nextLine();
        }
        while (name.isBlank());

        System.out.println("Hello " + name);
    }
}
