import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;
public class Criptografia {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int n;
        String praColocarNaLista;

        List<String> listaPraCriptografar = new ArrayList<String>();

        System.out.println("digite seu número: ");
        n = scanner.nextInt();
        scanner.nextLine();

        while (n != 0) {
            praColocarNaLista = scanner.nextLine();
            listaPraCriptografar.add(praColocarNaLista);
            criptografar("aooo");
            n--;
        }
    }

    private static String criptografar(String inputString) {

        List<String> caracteresASCII = new ArrayList<String>();
        List<String> caracteresDoInput = new ArrayList<String>();


        for (int asciiValue = 0; asciiValue <= 127; asciiValue++) {

            System.out.println("char disso: " + Arrays.toString(inputString.getBytes(StandardCharsets.UTF_8)));
            caracteresASCII.add(Character.toString((char) asciiValue));
        }



        System.out.println(caracteresASCII.get(3));

        return inputString;
    }
}