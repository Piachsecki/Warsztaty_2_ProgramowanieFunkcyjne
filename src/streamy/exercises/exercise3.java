package streamy.exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class exercise3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 16, 18, 2, 5, 2, 6, 2, 1, 6, 1, 23, 64, 34);
        numbers.stream()
                .sorted(Comparator.naturalOrder())
                .distinct()
                .limit(2)
                .skip(1)
                .forEach(x -> System.out.println(x));



    }
}
