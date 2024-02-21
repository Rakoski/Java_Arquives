import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Estiagem {

    public void print(String[] args) {
        System.out.println(Arrays.toString(args));
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n;
        int x;
        int y;
        int cidade = 0;
        List<Integer> consumoDeCadaUm = new ArrayList<Integer>();
        List<String> listaDeCidades = new ArrayList<String>();
        List<Double> listaDeConsumos = new ArrayList<Double>();
        List<String> listaDeMedias = new ArrayList<String>();

        System.out.println("n: ");
        n = scanner.nextInt();

        while (n != 0) {
            for (int i = 0; i < n; i++) {
                double mediaDeConsumo;
                consumoDeCadaUm.add(cidade++);

                System.out.println("X: ");
                x = scanner.nextInt();
                System.out.println("Y: ");
                y = scanner.nextInt();

                if (x > y) {
                    throw new IOException("Y maior que X");
                }

                listaDeConsumos.add(mediaDeConsumo = Math.floor((double) y /x));
                System.out.println("Cidade# "+ (consumoDeCadaUm.get(cidade - 1) + 1) + ":");
                listaDeMedias.add(x + " - " + mediaDeConsumo);
            }
            System.out.println(listaDeMedias);
            System.out.println("n: ");
            n = scanner.nextInt();
        }
    }
}
