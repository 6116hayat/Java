import java.util.*;

public class Ques_Ans {
    public static void main(String[] args) {
        // Creating an Scanner
        Scanner input = new Scanner(System.in);

        // Ques 1 : Taking an Average of 3 numbers
        System.out.println("Enter first number ");
        int a = input.nextInt();
        System.out.println("Enter Second number ");
        int b = input.nextInt();
        System.out.println("Enter third number ");
        int c = input.nextInt();

        int average = (a + b + c) / 3;
        System.out.println("The Average =" + average);

        System.out.println(); // Line gap

        // Ques 2 : Area of square
        System.out.println("Input the side of square");
        int side = input.nextInt();

        int area = side * side;
        System.out.println("The Area of square :" + area);

        System.out.println(); // line gap

        // Ques 3 : Bill calculator
        System.out.println("Price of pencil");
        float pencil = input.nextFloat();
        System.out.println("Price of pen");
        float pen = input.nextFloat();
        System.out.println("Price of eraser");
        float eraser = input.nextFloat();

        float total = pencil + pen + eraser;
        System.out.println("The total bill :" + total);

        // add on 18% GST
        float gstTotal = total + (0.18f * total);
        System.out.println("Total + Gst :" + gstTotal);

    }

}
