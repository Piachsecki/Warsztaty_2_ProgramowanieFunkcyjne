package streamy.exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class exercise2 {
    public static void main(String[] args) {
        String[] letters = {"z", "x", "a", "j", "a", "v", "x", "k", "a", "x"};

        String result = Arrays.stream(letters)
                .map(x -> x.toUpperCase())
                .filter(x -> !(x.contains("X")))
                .sorted(Comparator.<String>naturalOrder().reversed())
                .collect(Collectors.joining());

        System.out.println(result);
    }
}
