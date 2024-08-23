package OOPS.Abstract;

// declaring an abstract class
abstract class vehicle{
    private String model;

    public vehicle (String model) {this.model = model;}

    public abstract void makeSound();

    public String getModel() {return model;}
}

//Abstracted class
class lamborgini extends vehicle{
    public lamborgini(String model) {super (model);}

    public void makeSound(){
        System.out.println(getModel()+ " :   VROOM VROOM");
    }
}

// Abstracted class
class porsche extends vehicle{
    public porsche(String model) {super (model); }

    public void makeSound(){
        System.out.println(getModel() + " :  RA RR TA TA TA TA");
    }
}

//Driver Class
public class main{
    public static void main(String[] args) {

        // Creating object of vehicle class
        vehicle car1 = new lamborgini("URUS");

        vehicle car2 = new porsche("911");

        //calling out the methods for the vehicles
        car1.makeSound();
        car2.makeSound();
    }
}