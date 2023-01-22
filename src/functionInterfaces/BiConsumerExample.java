package functionInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (str1, str2) -> {
            System.out.println("Given 2 string are : " + str1 + " + " + str2);
        };

        biConsumer.accept("elo", "siema");
    }
}
