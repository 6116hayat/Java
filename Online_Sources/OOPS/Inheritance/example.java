package Online_Sources.Inheritance;

import java.util.Scanner;

// Base class for all the employee
class Employee{
    int salary = 30000;
}

class Engineer extends Employee{
    int benefits = 10000;
}

class Builder extends Employee{
    int benefits = 5000;
}

class Worker extends Employee{
    int benefits = 2000;
}

// Driver Class
class example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        Engineer e1 = new Engineer();
        Builder b1 = new Builder();
        Worker w1 = new Worker();

        System.out.println("What Employee Are You ??");
        System.out.println("1 : Engineer"+"\n"+ "2 : Builder"+ "\n"+ "3 : Worker");
        
        //taking userChoice
        int userChoice = input.nextInt();

        // choices made by the computer
        if(userChoice == 1){
            int total = e1.salary + e1.benefits;
            System.out.println("Salary : " + e1.salary+ "\n" +" Benefits :"+ e1.benefits);
            System.out.println("Total : " +total);
        }
        if(userChoice == 2){
            int total = b1.salary + b1.benefits;
            System.out.println("Salary : " + b1.salary+ "\n" +" Benefits :"+ b1.benefits);
            System.out.println("Total : " +total);
        }
        if(userChoice == 3){
            int total = w1.salary + w1.benefits;
            System.out.println("Salary : " + w1.salary+ "\n" +" Benefits :"+ w1.benefits);
            System.out.println("Total : " +total);
        }
        if(userChoice > 3){
            System.out.println("Choose from 3 options!!"+ "\n"+ "Smart ASS");
        }
    }
}
