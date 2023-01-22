package exercises.ex3;

import java.util.Optional;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        BinaryOperator<Integer> ex1 = ((x1, x2) -> {
            Integer result = x1.compareTo(x2);
            if(result == 0){
                return null;
            } else if (result > 0) {
                return x1;
            }

            return x2;
        });


        Optional.ofNullable(ex1.apply(197, 17)).ifPresentOrElse(x-> System.out.println("The bigger number is: " + x), Main::throwAnException);


    }

    private static String throwAnException() throws RuntimeException {
        throw new RuntimeException();
    }
}
