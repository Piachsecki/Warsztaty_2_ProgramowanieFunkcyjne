package streamy.exercises;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class exercise1 {
    public static void main(String[] args) {
        System.out.println(        factorialFunctional(5));
    }

    private static int factorialFunctional(int i1) {
        return IntStream.rangeClosed(1, i1)
                .reduce(1, (left, right) -> left * right);
    }
}
