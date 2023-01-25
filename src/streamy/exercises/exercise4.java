package streamy.exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class exercise4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 16, 18, 2, 5, 2, 6, 2, 1, 6, 1, 23, 64, 34);

        List<Integer> collect = numbers.stream()
                .sorted(Comparator.<Integer>naturalOrder().reversed())
                .limit(2)
                .skip(1)
                .collect(Collectors.toList());

        System.out.println(collect);


    }
}
