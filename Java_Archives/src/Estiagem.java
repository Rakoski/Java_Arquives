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
import java.lang.Math;

public class Estiagem {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        int T = 0;
        while (in.ready()) {
            int N = Integer.parseInt(in.readLine());
            if (N == 0) {
                break;
            }

            if (T > 0) {
                System.out.println("");
            }

            int totalX = 0, totalY = 0;
            int[] consumos = new int[201];
            for (int i = 0; i < N; ++i) {
                String[] numeros = in.readLine().trim().split(" ");

                int X = Integer.parseInt(numeros[0]);
                int Y = Integer.parseInt(numeros[1]);

                totalX += X;
                totalY += Y;
                consumos[Y / X] += X;
            }

            System.out.printf("Cidade# %d:\n", ++T);
            boolean first = true;
            for (int i = 0; i < 201; ++i) {
                if (consumos[i] > 0) {
                    if (first) {
                        first = false;
                    } else {
                        System.out.print(" ");
                    }

                    System.out.printf("%d-%d", consumos[i], i);
                }
            }
            System.out.println("");

            System.out.printf("Consumo medio: %.2f m3.\n", Math.floor((100.0 * totalY) / totalX) / 100.0);
        }
    }
}

