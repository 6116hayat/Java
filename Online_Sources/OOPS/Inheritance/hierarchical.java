package OOPS.Inheritance;
// Base Class/ Super Class
class football_clubs{
    public void print_Line(){
        System.out.println("BEST FOOTBALL CLUB ");
    }
}

// Derived  class 1
class Manchester_United extends football_clubs{
    public void print_Manchestar_United(){
        System.out.println("MANCHESTAR UNIITED");
    }
}

// Derived  class 2
class Manchester_City extends football_clubs{
    public void print_Manchestar_City(){
        System.out.println("MANCHESTAR CITY");
    }
}

// Derived class 3
class Real_Madrid  extends football_clubs{
    public void print_Real_Madrid(){
        System.out.println("REAL MADRID");
    }
}

// Driver class
public class hierarchical {
    public static void main(String[] args) {

        Manchester_United team1 = new Manchester_United();
        team1.print_Line();
        team1.print_Manchestar_United();

        Manchester_City team2  = new Manchester_City();
        team2.print_Line();
        team2.print_Manchestar_City();

        Real_Madrid team3 = new Real_Madrid();
        team3.print_Line();
        team3.print_Real_Madrid();
    }
}
