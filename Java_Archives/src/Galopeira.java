import java.io.IOException;
import java.util.Scanner;

public class Galopeira {
    public static int contaAsLetras(String palavra) {
        char[] arrayDeString = palavra.toCharArray();
        int numero = 0;

        for (int j = 0; j < arrayDeString.length; j++) {
            numero++;
        }
        return numero;
    }

    public static int main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int numeroDePalavras = scanner.nextInt();

        for (int i = 0; i < numeroDePalavras; i++) {
            String palavra = scanner.nextLine();

            int numeroDeLetras = contaAsLetras(palavra);
            return numeroDeLetras;
        }
        return numeroDePalavras;
    }
}