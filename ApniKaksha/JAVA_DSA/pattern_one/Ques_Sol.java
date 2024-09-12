package JAVA_DSA.pattern_one;

public class Ques_Sol {
    public static void main(String[] args) {

        // 1.Inverted half number pyramid :
        /*
         * 12345
         * 1234
         * 123
         * 12
         * 1
         */
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();// line gap

        // 2. printing 0-1 triangle pattern
        /*
         * 1
         * 01
         * 101
         * 0101
         * 10101
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }
}
