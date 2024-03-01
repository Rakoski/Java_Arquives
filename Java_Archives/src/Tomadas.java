import java.io.IOException;
import java.util.Scanner;

public class Tomadas {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int T1;
        int T2;
        int T3;
        int T4;
        int soma;

        T1 = scanner.nextInt();
        T2 = scanner.nextInt();
        T3 = scanner.nextInt();
        T4 = scanner.nextInt();

        soma = (T1 + T2 + T3 + T4) - 3;

        System.out.println(soma);
    }
}