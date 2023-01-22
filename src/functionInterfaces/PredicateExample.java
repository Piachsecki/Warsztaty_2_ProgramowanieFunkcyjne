package functionInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {


        Predicate<String> predicate1 = str -> {
            System.out.println("Predicate function calling");
            return str.contains("sth");
        };

        System.out.println(predicate1.test("65"));
        System.out.println(predicate1.test("sth1"));


        Predicate<String> predicate2 = PredicateExample::method1;


        System.out.println(predicate2.test("65"));
        System.out.println(predicate2.test("sth1"));


    }

    public static boolean method1(String str) {
        System.out.println("method1 calling");
        return str.contains("65");

    }
}
