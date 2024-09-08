package JAVA_DSA.conditional;

import java.util.Scanner;

public class Ques_Ans {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ques 1 : whether a number is +ve or -ve
        System.out.println("Enter your desired number ");
        float userNum = input.nextFloat();
        if (userNum > 0) {
            System.out.println(userNum + "User Number is +Ve");
        } else {
            System.out.println(userNum + "User number is -Ve");
        }

        System.out.println(); // line gap

        // Ques 2 . You have fever or not
        System.out.println("Do you have fever lets check");
        double temp = 103.5;
        if (temp > 100) {
            System.out.println("Oh Gosh You have fever");
        } else {
            System.out.println("Dont fake your fever dear!");
        }

        System.out.println(); // line gap

        // Ques 3 : Week number to Week Name
        System.out.println("Want some magic !!");
        System.out.println("Do you want to print weekDay Name:");
        System.out.println("1.Mon   2.Tue   3.Wed   4.Thur  5.Fri   6.Sat   7.Sun");
        int userWeekDay = input.nextInt();
        switch (userWeekDay) {
            case 1:
                System.out.println("Your Choice was MonDay");
                break;
            case 2:
                System.out.println("Your Choice was TueDay");
                break;

            case 3:
                System.out.println("Your Choice was WedDay");
                break;

            case 4:
                System.out.println("Your Choice was ThurDay");
                break;

            case 5:
                System.out.println("Your Choice was FriDay");
                break;

            case 6:
                System.out.println("Your Choice was SatDay");
                break;

            case 7:
                System.out.println("Your Choice was SunDay");
                break;

            default:
                break;
        }

        System.out.println(); // line gap

        // Ques 5. Leap year or or not
        System.out.println("Enter the Year you want to check :");
        int userYear = input.nextInt();
        if (userYear % 4 == 0) {
            System.out.println("It is a leap Year");
        } else {
            System.out.println("It is not a leap Year");
        }
    }
}
