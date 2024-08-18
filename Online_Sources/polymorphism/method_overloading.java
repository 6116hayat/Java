package Online_Sources.polymorphism;
// Method Overloading Example

//Class 1 : Helper class
class Helper{

    // 1 Method with 2 integer parameters 
    static int Divide(int a, int b){

        // returns divison of integer nummbers
        return a/b;
    }

    // 2 Method with 2 double numbers
    static double Divide(double a, double b){

        // returns product of double numbers
        return a/b;
    }
}

// Class 2 : 2nd Helper Class
class Helper2{
    
    // 1 method with 2 integers
    static int Multiply(int a, int b ){

        //return product of 2 numbers
        return a * b;
    }

    // 2 method with 3 integers
    static int Multiply(int a, int b,int c ){

        //return product of 2 numbers
        return a * b * c;
    }
}

// class 2 : main class
class method_overloading{
    public static void main(String[] args) {
        
        // using methods of Divide
        System.out.println("Division");
        System.out.println(Helper.Divide(10, 2));
        System.out.println(Helper.Divide(39.6,3.6));

        // Using method of Multiply
        System.out.println("\n"+"Multiply");
        System.out.println(Helper2.Multiply(6,2));
        System.out.println(Helper2.Multiply(2, 3, 6));
    }
}