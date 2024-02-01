public class Triangle {
    public static void triangle(int rows) {
        int a = 0;
        while (a <= rows) {
            for (int i = 0; i < a; i++) {
                System.out.print("*");
            }
            a++;
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        triangle(5);
    }
}
