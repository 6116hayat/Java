package Online_Sources.Encapsulation;

import java.util.Scanner;

// Java Program for Encapsulation

// Creating a person class
class Person{

    private String name;
    private int age;

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getAge(int age) {return age;}

    public void setAge(int age ) {this.age = age;}

}

// Driver class
public class main {

    public static void main(String[] args) {

    // Creating person object
    Person person = new Person();
    person.setName("Danish");
    person.setAge(13);

    // using methods 
    System.out.println("Name: "+ person.getName());
    System.out.println("Age : "+ person.getAge(13));
    }

}
