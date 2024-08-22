package Online_Sources.Encapsulation;

import java.util.Scanner;

class Area{
    int length;
    int breadth;

    // Creating a constructor for values 
    Area(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    // method to calculate area
    public void getArea(){
        int area = length * breadth;
        System.out.println("Area: "+ area);
    }
}

public class area_rectangle {
    // main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Length: ");
        int length = input.nextInt();
        System.out.print("Input Breadth: ");
        int breadth = input.nextInt();

        Area rectangle = new Area(length, breadth);
        rectangle.getArea();
        
    }
    
}
