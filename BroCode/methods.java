public class methods {
    public static void main(String[] args) {
        
        // method : a block of code that is executed whenevr it is called 
        String name = "Hayat";
        int age  = 20;

        hello(name, age);

    }

    static void hello(String name, int age){
        System.out.println("Hello " + name);
        System.out.println("Your age is "+ age);
    }

}
