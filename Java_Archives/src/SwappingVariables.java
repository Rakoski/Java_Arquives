// Swapping variables

public class SwappingVariables {

    public static void main(String[] args) {

        String x = "agua";
        System.out.println("X é " + x);

        String y = "Suco Prats";
        System.out.println("Y é " + y);

        String buffer;

        buffer = x;
        x = y;
        y = buffer;

        System.out.println("Agora, x é " + x);
        System.out.println("Agora, y é " + y);

    }

}
