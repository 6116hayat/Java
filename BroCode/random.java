import java.util.Random;

public class random {
    public static void main(String[] args) {
        
        Random rand = new Random();

        int x = rand.nextInt(6) + 1;

        double y = rand.nextDouble();

        boolean z = rand.nextBoolean();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    
}
