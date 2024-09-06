package Java_8_Features.LambdaExpressions;

// Not working currently.....

interface InterfaceLambda {

    // abstract method
    void Student(String name);

    // Default method
    default void DefaultName() {
        System.out.println("Default Method..");
    }
}

public class lambdaExample3 {
    public static void main(String[] args) {
        InterfaceLambda myobject = (String name) -> System.out.println("Name is " + name);
    }
}
