package exercises.ex1;

import java.util.function.BiFunction;
import java.util.function.DoublePredicate;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer, Double, String> ex1 = ((integer, aDouble) -> {
            System.out.println("Given integer: " + integer);
            System.out.println("Given aDouble: " + aDouble);

            return aDouble + integer + "";

        });
        String apply = ex1.apply(6, 28.2);
        System.out.println(apply);

        Integer int1 = 7;
        Double double1 = 27.2;

        BiFunction<Integer, Double, String> ex2 = Main::methodReference;

        System.out.println( ex2.apply(int1, double1));

        }

    private static String methodReference(Integer int1, Double double1) {
        System.out.println("Method reference called");
        return int1 + double1 + "";
    }
}
