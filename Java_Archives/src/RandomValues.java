import java.util.Random;

public class RandomValues {

    public static void main(String[] args) {

        Random random = new Random();

        int x = random.nextInt(6) + 1; // se eu não colocasse aquele "+ 1" ele geraria entre 0-5

        System.out.println(x);
    }
}
