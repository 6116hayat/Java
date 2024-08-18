package Online_Sources.constructors_thisKEYWORD;

import java.util.Scanner;

// this program will use default construstor as well as default 
    // this keyword

    // Contructor
public class Dog{
    String name;
    String breed;

    // Constructor 
    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    //Methods 

    public void bark(){
        System.out.println(name + " said BOW BOW");
    }


    public static void main(String[] args) {
        Dog dog1 = new Dog("Doggo", "German Shepherd");
        Dog dog2 = new Dog("Millow", "Pug");

        System.out.println("Dog 1 name : "+ dog1.name);
        System.out.println("DOg 1 Breed : "+dog1.breed);

        System.out.println("Dog 2 name : "+ dog2.name);
        System.out.println("DOg 2 Breed : "+dog2.breed);

        Scanner input = new Scanner(System.in);
        System.out.println("Choose a Dog to Bark: 1 or 2");
        System.out.println("1 : Doggo"+"\n"+ "2 : Millow");
        int userChoice = input.nextInt();

        if(userChoice == 1){
            dog1.bark();
        }
        if (userChoice == 2) {
            dog2.bark();
        }

    }
}   
