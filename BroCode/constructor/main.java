package constructor;

public class main {
    
    // constructor = special method that is called when a object is intantiated (created)
public static void main(String[] args) {
    


    Human human1 = new Human("Rick", 65, 70);
    Human human2 = new Human("Morty", 16, 50);

    System.out.println(human2.name);

    // method using
    human2.eat();
    human1.drink();
}

}
