package OOPS;


public class main {
    public static void main(String[] args) {
        
        // object =  an instance of a class that may contain attributes and methods
        //  example: (phone,  fan, bag, table)

        Car myCar1 = new Car();
        Car myCar2 = new Car();

        System.out.println(myCar1.make);
        System.out.println(myCar1.model);

        myCar1.drive();
        myCar1.brake();
    }
}
