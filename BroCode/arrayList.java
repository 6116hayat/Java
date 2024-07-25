import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        

        // ArraysList =  a re-sizeable array
        //               Elements can be added and removed after compilation phase
        //               store reference data types

        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Hamburger");
        food.add("Cheese Sandwich");

        // Setting new value in arrays list
        food.set(0, "Sushi");
        food.remove(2); // removes indent value from list
        food.clear();//  it clears out the whole arraysList

        for(int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }
    }
}
