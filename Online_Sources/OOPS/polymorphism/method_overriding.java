package OOPS.polymorphism;

//parent class
class parent{

    // methods for parent class
    public void parent_property(){
        System.out.println("Parents property");
    }
    public void marriage_of_child(){
        System.out.println("Arrange marriage");
    }
}

// child class to inhert parent class methods
// and to show overriding of methods
class child extends parent{

    //methods for child class
    public void child_property(){
        System.out.println("Property earned by parent");
    }
    public void marriage_of_child(){
        System.out.println("Love marriage");
    }
}


public class method_overriding {
    public static void main(String[] args) {
        
        System.out.println("Parents choice");
        // creating object for parent class
        parent p = new parent();

        // calling method of parent class
        p.parent_property();
        p.marriage_of_child();

        System.out.println("\n"+"Child choice");
        // creating object for child class
        child c = new child();

        // calling method for child class
        c.child_property();
        c.marriage_of_child();

        System.out.println("\n"+"Inherting ");
        //inherting parent class
        c.parent_property();
    }
}
