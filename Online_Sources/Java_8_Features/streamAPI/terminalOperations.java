package Java_8_Features.streamAPI;

import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class terminalOperations {
    public static void main(String[] args) {

        // Creating a list(String)
        List<String> names = Arrays.asList("Sujeet", "Shivam", "Umar");
        // Creating a list(Integer)
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);

        // 1.forEach() : performs an action for each element of the stream
        names.stream().forEach(System.out::println);

        System.out.println(); // for extra line gap

        // 2. collects() : the elements of the stream into a collection or another data
        // structure
        Set<String> nameSet = names.stream().collect(Collectors.toSet());
        System.out.println(nameSet);

        System.out.println(); // for extra line gap

        // 3. reduce() : combines elements of the stream to produce a single result
        int sum = num.stream().reduce(0, Integer::sum);
        System.out.println("Total of num =" + sum);

        System.out.println(); // For Extra line gap

        // 4. count() : Returns the number of elements in the stream
        long count = names.stream().count();
        System.out.println("Number of elements present in the List" + count);

        System.out.println(); // for extra line gap

        // 5. findFirst() : Returns the first element of the stream, if present
        Optional<String> firstname = names.stream().findFirst();
        firstname.ifPresent(System.out::println);

        System.out.println(); // Extra line gap

        // 6. anyMatch() : Return true if any elements of stream match the provided
        // predicte
        boolean hasUmar = names.stream().anyMatch(name -> name.equals("Umar"));
        System.out.println(hasUmar); // true

    }
}
