import java.io.IOException;

import java.util.Scanner;
import java.lang.Math;

public class ifpr1 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        double R = scanner.nextDouble();
        double n = 3.14159;

        double Rsquared = R * R;

        double A = Rsquared * n;

        System.out.println("A = " + A);

    }

}