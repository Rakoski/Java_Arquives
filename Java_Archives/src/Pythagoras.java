import java.util.Scanner;

public class Pythagoras {
    public static void main(String[] args) {

        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        a = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("b: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("A sua hipotenusa é " + c);

        scanner.close();
    }
}
