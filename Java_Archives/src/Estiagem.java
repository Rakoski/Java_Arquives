//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//
//public class Estiagem {
//
//    public void print(String[] args) {
//        System.out.println(Arrays.toString(args));
//    }
//
//    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//
//        int n;
//        int x;
//        int y;
//        int cidade = 0;
//        double mediaCompleta = 0;
//
//        List<Integer> consumoDeCadaUm = new ArrayList<Integer>();
//        List<String> listaDeCidades = new ArrayList<String>();
//        List<Integer> listaDeConsumos = new ArrayList<Integer>();
//        List<String> listaDeMedias = new ArrayList<String>();
//        List<Double> listaDeMediasDaListaDeMedias = new ArrayList<Double>();
//
//        System.out.println("n: ");
//        n = scanner.nextInt();
//
//        while (n != 0) {
//            consumoDeCadaUm.add(cidade++);
//            listaDeCidades.add("Cidade# "+ (consumoDeCadaUm.get(cidade - 1) + 1) + ":");
//            for (int i = 0; i < n; i++) {
//                int mediaDeConsumo;
//
//                System.out.println("X: ");
//                x = scanner.nextInt();
//                System.out.println("Y: ");
//                y = scanner.nextInt();
//
//                listaDeConsumos.add(mediaDeConsumo = (int) Math.floor(y /x));
//                listaDeMediasDaListaDeMedias.add((double) mediaDeConsumo);
//                listaDeMedias.add(x + "-" + mediaDeConsumo);
//            }
//
//            System.out.println(listaDeCidades.get(cidade - 1));
//
//            StringBuilder sb = new StringBuilder();
//            for (String media : listaDeMedias) {
//                sb.append(media).append(" ");
//            }
//            if (sb.length() > 0) {
//                sb.setLength(sb.length() - 1);
//            }
//            System.out.println(sb.toString());
//
//            int totalPares = 0;
//            for (String media : listaDeMedias) {
//                String[] partes = media.split("-");
//                int valor1 = Integer.parseInt(partes[0]);
//                int valor2 = Integer.parseInt(partes[1]);
//                mediaCompleta += (double)(valor1 + valor2) / 2;
//                totalPares++;
//            }
//            mediaCompleta /= totalPares;
//            System.out.println("Consumo médio: " + mediaCompleta);
//
//            listaDeMediasDaListaDeMedias.clear();
//            listaDeMedias.clear();
//            System.out.println("n: ");
//            n = scanner.nextInt();
//        }
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Estiagem {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n;
        int cidade = 0;
        double mediaCompleta = 0;

        while (true) {
            System.out.println("n: ");
            n = Integer.parseInt(br.readLine().trim());
            if (n == 0) break;

            cidade++;
            System.out.println("Cidade# " + cidade + ":");
            double totalConsumo = 0;
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int mediaDeConsumo = y / x;
                System.out.println(x + "-" + mediaDeConsumo);
                totalConsumo += mediaDeConsumo;
            }

            double mediaCidade = totalConsumo / n;
            mediaCompleta += mediaCidade;
            System.out.println("Consumo médio: " + mediaCidade);
        }

        if (cidade != 0) {
            mediaCompleta /= cidade;
            System.out.println("Consumo médio geral: " + mediaCompleta);
        }
    }
}

