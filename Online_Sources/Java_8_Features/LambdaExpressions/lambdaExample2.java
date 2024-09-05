package Java_8_Features.LambdaExpressions;

@FunctionalInterface
interface FuncInter1 {
    int operation(int a, int b);
}

public class lambdaExample2 {
    public static void main(String[] args) {

        // using Lambda Expressions to define the operations
        FuncInter1 add = (a, b) -> a + b;
        FuncInter1 multiply = (a, b) -> a * b;

        // using the operations
        System.out.println(add.operation(6, 3)); // 9
        System.out.println(multiply.operation(6, 3)); // 18
    }
}
