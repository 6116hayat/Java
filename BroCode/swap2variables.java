public class swap2variables {
    public static void main(String[] args) {
        
        String x = "water";
        String y = "orange Powder";
        String temp;

        System.out.println("X = "+ x);
        System.out.println("Y = "+ y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("X = "+ x);
        System.out.println("Y = "+ y);

    }
}
