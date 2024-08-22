
//base class
class car{
    // method for base class
    public void print_model(){
        System.out.println("G-Wagon");
    }
}

// intermediate class ONE
class color extends car{
    // method for intermediate  class
    public void print_color(){
        System.out.println("White");
    }
}

//// intermediate class TWO
class brand extends color{
    // method for intermediate  class
    public void print_brand(){
        System.out.println("Manufacturig brand: MERCEDES");
    }
}

// Driver class
public class multi_Inheritance {
    public static void main(String[] args) {

        // creating an object for 3 classes
        brand car1 = new brand();

        //calling method from car class
        car1.print_model();

        // calling method from color class
        car1.print_color();

        // calling method from brand class
        car1.print_brand();


    }
}
