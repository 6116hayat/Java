package StringManipulation;

public class StringExample {

    public static void main(String[] args) {

        // 1. Creating the String
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String :" + str1 + str2); // Displaying the String

        System.out.println(); // For the line Gap

        // 2. Concatenation :
        String result1 = str1 + " " + str2; // Using + Operator
        System.out.println("Using + :" + result1);

        String result2 = str1.concat(" ").concat(str2); // Using concat() method
        System.out.println("Using concat method :" + result2);

        System.out.println(); // For the line Gap

        // 3.length
        int length = str1.length();
        System.out.println("Printing the length of the String :" + length);

        System.out.println(); // For the line Gap

        // 4. Character Access
        char ch = str1.charAt(0); // Accessing the character at index 0
        System.out.println("Character At Index 0: " + ch);

        System.out.println(); // For the line Gap

        // 5. Substring
        String substr = str1.substring(1, 4); // Extracting substring from index 1 to 3
        System.out.println("Substring : " + substr);

        System.out.println(); // For the line Gap

        // 6. Replace
        String replacestr = str2.replace('o', 'a'); // Replacing 'O' with 'A'
        System.out.println("printing out replaced String : " + replacestr);

        System.out.println(); // For the line Gap

        // 7. Split:
        String[] parts = str1.split(" "); // Splitting the string
        System.out.println("Splitted String : " + parts);

        System.out.println(); // For the line Gap

        // 8. Trim
        String trimmedStr = str1.trim(); // Removing leading and trailing spaces
        System.out.println("Trimmed String :" + trimmedStr);

        System.out.println(); // For the line Gap

        // 9. Case conversion
        String upperStr = str1.toUpperCase(); // Converting to uppercase
        System.out.println("UpperCase String :" + upperStr);

        String lowerStr = str1.toLowerCase(); // Converting to lowerCase
        System.out.println("LowerCase String :" + lowerStr);

        System.out.println(); // For the line Gap

        // 10. String Comparison
        boolean isEqual = str1.equals(str2); // Case-Sensitive Comparison

        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2); // Case-Insensitive comparison

    }
}
