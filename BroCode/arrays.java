public class arrays {
    public static void main(String[] args) {
        
        // Array = used to store multiple values in a single variable

        String[] cars = {"Lambo", "GTR", "Tesla"};

        // Re-asign 
        cars[0] = "Mustang";

        System.out.println(cars);

        // for loop
        for(int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);


            // 2-D Arrays : Arrays of Arrays

            String[][] cars1 = {
                                {"camaro", "Corvette", "maruti"},
                                {"Lambo","Tesla","GTR"},
                                {"Porsche","Ferarri","Mustang"}
                                };

            System.out.print(cars1);
        }
    }
}
