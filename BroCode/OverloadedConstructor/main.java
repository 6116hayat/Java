package OverloadedConstructor;

public class main{

    public static void main(String[] args) {
        
    

    Pizza pizza = new Pizza("Thicc crust", "tomoato", "goat", "olives");
    
    //Printing the pizza
    System.out.println("Here is your prefered pizza");

    // Priting the ingredients
    System.out.println(pizza.bread);
    System.out.println(pizza.sauce);
    System.out.println(pizza.cheese);
    System.out.println(pizza.topping);

    }
    
}
