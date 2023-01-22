package functionInterfaces;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = str -> {
            System.out.println("string given: " + str);
        };

        consumer.accept("cos");

        Consumer<String> customer1 = ConsumerExample::print;
        customer1.accept("ktos");

    }

    public static void print(String s1){
        System.out.println("string given from method reference" + s1);
    }


}
