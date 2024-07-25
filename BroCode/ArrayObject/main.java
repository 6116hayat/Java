package ArrayObject;

public class main{
    public static void main(String[] args) {

        // food[]  refrigerator = new food[3];

        food food1 = new food("Pizza");
        food food2 = new food("Burger");
        food food3 = new food("Macroni");

        food[] refrigerator = {food1, food2, food3};

        // refrigerator[0] = food1;
        // refrigerator[1] = food2;
        // refrigerator[2] = food3;

        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);

    }
    
}
