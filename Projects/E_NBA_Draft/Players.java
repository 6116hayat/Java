package Projects.E_NBA_Draft;

import java.util.*;
import java.util.jar.Attributes.Name;

public class Players {

    private String name;
    private int age;
    private String players_team;
    private double BMI;

    public static void main(String[] args) {

        // Creating the first scanner 
        Scanner scanner1 = new Scanner(System.in);

        // Creating the second Scanner 
        Scanner scanner2 = new Scanner(System.in);


        Date date =  new Date();

        measurements_taking NBA_official01 = new measurements_taking();

        measurements_taking NBA_official02 = new measurements_taking();

        // Creating player objects 
        Players player01 = new Players();
        Players player02 = new Players();

        System.out.println("Welcome to NBA Draft");
        System.out.println("This the measurement taking section");

        // PERSONAL INFORMATION....

        // Assinging the team of the player
        player01.players_team = "Sixers";
        player02.players_team = "Tigers";

        // Asking the name of the player 
        System.out.println("Player 1 Name please!!");
        player01.name = scanner1.nextLine();

        System.out.println("Player 2 Name please!!");
        player02.name = scanner2.nextLine();

        // Asking the player for the age 
        System.out.println("Player 1 Age Please !!");
        player01.age = scanner1.nextInt();

        System.out.println("Player 2 age please!!");
        player01.age = scanner2.nextInt();

        // MEASUREMENT TAKING SECTION... 
        System.out.println("Hello we will take measurements");

        System.out.println("Player 1 Height( in cms) please!!");
        NBA_official01.player_height = scanner1.nextDouble();
        System.out.println("Player 2 Height( in cms) please!!");
        NBA_official02.player_height = scanner2.nextDouble();

        System.out.println("Player 1 Wingspan please!!");
        NBA_official01.player_wingspan = scanner1.nextDouble();
        System.out.println("Player 2 Wingspan please!!");
        NBA_official02.player_wingspan = scanner2.nextDouble();

        System.out.println("Player 1 Weight(in kgs) please!!");
        NBA_official01.player_weight = scanner1.nextDouble();
        System.out.println("Player 2 Weight(in kgs) please!!");
        NBA_official02.player_weight = scanner2.nextDouble();

        System.out.println("Player 1 Body Fat please!!");
        NBA_official01.player_Bodyfat = scanner1.nextDouble();
        System.out.println("Player 2 Body Fat please!!");
        NBA_official02.player_Bodyfat = scanner2.nextDouble();

        // CALCULATIONS..
        double BMI_01 =  NBA_official01.player_weight  / ((NBA_official01.player_height) * (NBA_official01.player_height));
        double BMI_02 =  NBA_official02.player_weight  / ((NBA_official02.player_height) * (NBA_official02.player_height));

        System.out.println("*~~*~~*~~*~~*~~*~~*~~*~~* Players BMI *~~*~~*~~*~~*~~*~~*~~*~~*");

        System.out.printf("%s %.2f\n", "Player 1's BMI", BMI_01);
        System.out.printf("%s %.2f\n", "Player 2's BMI", BMI_02);

        System.out.println("*~~*~~*~~*~~*~~*~~*~~*~~* Players BMI *~~*~~*~~*~~*~~*~~*~~*~~*");

        double body_fatpercent1 = (1.20*BMI_01) + (0.23 * player01.age) - 16.2;
        double body_fatpercent2 = (1.20*BMI_02) + (0.23 * player02.age) - 16.2;

        System.out.println("*~~*~~*~~*~~*~~*~~*~~*~~* Player's Body fat Percentage *~~*~~*~~*~~*~~*~~*~~*~~*");

        System.out.printf("%s %.2f\n", "Player 1's Body Fat Perceentage", body_fatpercent1);
        System.out.printf("%s %.2f\n", "Player 2's Body Fat Perceentage", body_fatpercent2);

        System.out.println("*~~*~~*~~*~~*~~*~~*~~*~~* Player's Body fat Percentage *~~*~~*~~*~~*~~*~~*~~*~~*");

        NBA_official01.player_Bodyfat = body_fatpercent1;
        NBA_official02.player_Bodyfat = body_fatpercent2;

        // Displaying the combine NBA draft stats table
        System.out.println("*~~*~~*~~*~~*~~*~~*~~*~~* NBA DRAFT COMBINE STATS *~~*~~*~~*~~*~~*~~*~~*~~*");

        System.out.printf("%20s", "Players Name");
        System.out.printf("%20s","Player Ages");
        System.out.printf("%20s","Player Height");
        System.out.printf("%20s","Wingspan");
        System.out.printf("%20s","Body Fat (%)");

        System.out.println();

        System.out.println("PLAYER 1 DETAILS");
        System.out.printf("%20s", player01.name);
        System.out.printf("%20s", player01.age);
        System.out.printf("%20s", NBA_official01.player_height);
        System.out.printf("%20s", NBA_official01.player_wingspan);
        System.out.printf("%20s", NBA_official01.player_Bodyfat);

        System.out.println();

        System.out.println("PLAYER 2 DETAILS");
        System.out.printf("%20s", player02.name);
        System.out.printf("%20s", player02.age);
        System.out.printf("%20s", NBA_official02.player_height);
        System.out.printf("%20s", NBA_official02.player_wingspan);
        System.out.printf("%20s", NBA_official02.player_Bodyfat);
    }
}
