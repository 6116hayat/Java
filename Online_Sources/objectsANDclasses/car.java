package Online_Sources.objectsANDclasses;

import java.util.Scanner;

public class car {

    String car;
    String model;
    int year;
    String color;
    double price;
    
    // creating methods for the car class

    /* 
    public car(){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Car: ");
        car = input.nextLine();

        System.out.print("Enter your car model: ");
        model = input.nextLine();

        System.out.print("Enter year of manufacturing: ");
        year = input.nextInt();

        System.out.print("Enter your color: ");
        color = input.nextLine();

        System.out.print("Enter your car price: ");
        price = input.nextInt();

        input.close();
    }
        */



        

    public car(String car, String model, int year, String color, double price){
        this.car =  car;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }


    // method to display car details 
    public void displayDetails(){
        System.out.println("Car = "+ car);
        System.out.println("Car Model = "+ model);
        System.out.println("manufactured Year = "+ year);
        System.out.println("Car color = "+ color);
        System.out.println("price = "+ price);
    }

    public void drive(){
        System.out.println("You are driving "+ car);
    }
}
