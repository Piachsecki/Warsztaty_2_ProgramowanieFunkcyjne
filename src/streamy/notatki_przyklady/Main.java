package streamy.notatki_przyklady;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        reduceFunctional();
    }


    private static void reduceFunctional() {
        String[] someChars = new String[]{"z", "a", "j", "a", "v", "k", "a", " ", "j", "a", "v", "k", "a"};

        String reduced = Stream.of(someChars)
                .reduce("initial", String::concat);
        //.reduce("", (l, r) -> l + r); ①
        System.out.println("2. " + reduced);
        // inny przykład
        List<Integer> integers = List.of(1, 3, 4, 5);
        Integer weirdSum = integers.stream()
                .reduce(0, (a, b) -> a + b + 1);
        System.out.println(weirdSum);
    }

}
