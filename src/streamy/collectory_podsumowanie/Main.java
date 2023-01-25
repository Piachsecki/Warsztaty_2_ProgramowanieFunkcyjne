package streamy.collectory_podsumowanie;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        List<String> cities1 = List.of(null, "Warszawa");
        //mapping
//        Optional<Integer> collect = cities1.stream()
//                .collect(Collectors.mapping(((String a) -> a.length()), Collectors.maxBy(Comparator.naturalOrder())));
//
//        System.out.println(collect);
//
//        //partitioningBy
//        Map<Boolean, List<String>> cin = cities1.stream()
//                .collect(Collectors.partitioningBy(x -> x.contains("cin")));
//        System.out.println(cin);
//
//
//        Map<Integer,List< String>> collect1 = cities1.stream()
//                .collect(Collectors.toMap((String k) -> k.length(), e1 -> List.of(e1), (left, right) -> merge(left, right), () -> new TreeMap<>()));
//        collect1.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));
//        System.out.println(collect1.getClass());


//        Map<Integer, Optional<String>> collect2 = cities1.stream()
//                .collect(Collectors.groupingBy(x -> x.length(), Collectors.maxBy(Comparator.naturalOrder())));
//        collect2.forEach((key, value)-> System.out.println("Keyyyy + " + key + ", Valueeee "+ value));


        Stream<String> myStream = Stream.generate(() -> "Zajavka");
        Predicate<String> stringPredicate = a-> a.contains("avka");
        System.out.println("step1");
//        myStream.re
        System.out.println("step2");

    }

    private static List<String> merge(List<String> left, List<String> right ) {
        List<String> result = new ArrayList<>(left);
        result.addAll(right);


        return result;
    }
}
