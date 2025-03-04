import java.util.Random;

public class MathHomework {
    public static int getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100) + 1;
    }
}
