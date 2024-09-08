import java.util.Scanner;
import java.util.*;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("one word String Input");
        String one_word = input.next();
        System.out.println(one_word);

        System.out.println(); // for extra line gap

        System.out.println("one line String Input");
        String one_line = input.nextLine();
        System.out.println(one_line);

        System.out.println(); // for extra line gap

        System.out.println("Integer");
        int oneInteger = input.nextInt();
        System.out.println(oneInteger);

        System.out.println(); // for extra line gap

        System.out.println("one Byte Input");
        byte oneByte = input.nextByte();
        System.out.println(oneByte);

        System.out.println(); // for extra line gap

        System.out.println("float Input");
        float oneFloat = input.nextFloat();
        System.out.println(oneFloat);

        System.out.println(); // for extra line gap

        System.out.println("Double Input");
        Double oneDouble = input.nextDouble();
        System.out.println(oneDouble);

        System.out.println(); // for extra line gap

        System.out.println("Boolean Input");
        Boolean oneBoolean = input.nextBoolean();
        System.out.println(oneBoolean);

        System.out.println(); // for extra line gap

        System.out.println("Short Input");
        Short oneShort = input.nextShort();
        System.out.println(oneShort);

        System.out.println(); // for extra line gap

        System.out.println("Long Input");
        Long oneLong = input.nextLong();
        System.out.println(oneLong);

    }
}
