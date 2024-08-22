package OOPS.Encapsulation;

class details{

    String name;
    String Breed;

    public String  getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String  getBreed() {return Breed;}
    public void setBreed(String Breed) {this.Breed = Breed;}
}

public class Cat {
    //main function
    public static void main(String[] args) {

        // Creating cat object 
        details cat = new details();

        cat.setName("silky");
        cat.setBreed("Persian");

        System.out.println("Name: "+ cat.getName());
        System.out.println("Breed: "+ cat.getBreed());
    }
}
