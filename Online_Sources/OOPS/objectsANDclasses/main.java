package OOPS.objectsANDclasses;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        car car1 = new car("Mercedes", "G-Wagon",2023 ,"White", 25000000 );

        car car2 = new car("Lamborgini", "Urus",2022 ,"Black", 15000000 );
        

        // car car1 = new car();
        // car car2 = new car();

        //displaying details
        car1.displayDetails();
        car2.displayDetails();

        // method drive
        car1.drive();
        car2.drive();
    }
}
