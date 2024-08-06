import java.util.Scanner;

public class mathClass {
    public static void main(String[] args) {
        
        double x = 3.14;
        double y = -10;

        // to print absolute value 
        double a = Math.abs(y);

        // maxmimum
        double b = Math.max(x, y);
        System.out.println("Max value = "+ b);

        // Minimum
        double c = Math.min(x, y);
        System.out.println("Min value = "+ c);

        // Square Root function
        double d = Math.round(x);

        // Round off to upper and lower value 
        double e = Math.ceil(x);
        double f = Math.floor(x);

        // Pythogoras theorem 
        double parallel;
        double base;
        double hypotenuse;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you Parallel");
        parallel = scanner.nextDouble();
        System.out.println("Enter your base ");
        base = scanner.nextDouble();

        hypotenuse = Math.sqrt((x * x)+ (y * y));
        System.out.println("The hypotenuse is:");

        scanner.close();




    }
}
