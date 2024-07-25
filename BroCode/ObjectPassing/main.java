package ObjectPassing;

public class main {
    public static void main(String[] args) {
        
        garage garage = new garage();

        car car1 = new car("BMW");
        car car2 = new car("Tesla");


        garage.park(car1);
        garage.park(car2);
    }
}
