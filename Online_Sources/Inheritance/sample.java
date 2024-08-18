class animal{
    /*
    animal(){
        System.out.println("Animal Class and Constructor:");
    }
    */

    // creating method 
    void display(){
        System.out.println("I am a animal class");
    }
}

class dog extends animal{
    /* 
    dog(){
        super();
        System.out.println("Dog Class And Method");
    }
    */

    @Override
    void display(){
        System.out.println("I am a dog class");
    }

    void printMessage(){
        super.display(); // calls the dsiplay method for animal class
        display(); // calls the display method of dog class
    }
}

public class sample {
    public static void main(String[] args) {
        dog d =  new dog();
        d.printMessage();
    }
}
