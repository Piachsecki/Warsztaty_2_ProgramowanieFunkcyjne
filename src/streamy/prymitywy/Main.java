package streamy.prymitywy;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1 , 3, 4, 5);

        int sum = list.stream().mapToInt(a -> a)
                .sum();

        System.out.println(sum);


        OptionalDouble average = list.stream()
                .mapToInt(v -> v)
                .average();
        System.out.println(average);


        DoubleStream doubleStream = list.stream().mapToDouble(v -> v + 0.5);
        doubleStream.forEach(v -> System.out.println("value: "+ v));


    }
}
