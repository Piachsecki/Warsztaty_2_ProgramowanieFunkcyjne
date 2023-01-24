package streamy.differences;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> cities1 = Arrays.asList(
                "Zakopane",
                "Szczecin",
                "Gdansk",
                "Poznan",
                "Warszawa",
                "Gdynia",
                "Gdansk");

        List<Integer> collect = cities1.stream()
                .map(String::length)
                .sorted(Comparator.<Integer, Integer>comparing(a -> a).reversed())
                .filter(elem -> elem > 5)
                .skip(1)
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(collect);


        List<String> collect1 = cities1.stream()
                .peek(elem -> System.out.println("Step 1  : " + elem))
                .filter(elem -> elem.length() > 5)
                .peek(elem -> System.out.println("Step 2  : " + elem))
                .sorted(Comparator.<String>naturalOrder().reversed())
                .peek(elem -> System.out.println("Step 3  : " + elem))
                .skip(1)
                .peek(elem -> System.out.println("Step 4  : " + elem))
                .limit(2)
                .peek(elem -> System.out.println("Step 5  : " + elem))
                .collect(Collectors.toList());

        System.out.println(collect1);


    }
}
