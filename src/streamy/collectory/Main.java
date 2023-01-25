package streamy.collectory;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> cities1 = Arrays.asList(
                "Zakopane",
                "Szczecin",
                "Poznan",
                "Poznan",
                "Warszawa",
                "Gdynia",
                "Gdansk");

//        long countResult = cities1.stream().count();
//
//        Long collect = cities1.stream()
//                .map(String::length)
//                .filter(val -> val > 2)
//                .collect(Collectors.counting());
//
//        String collect1 = cities1.stream()
//                .filter(v -> v.length() > 6)
//                .collect(Collectors.joining("-=-", "start ", " end"));
//
//
//        var collect2 = cities1.stream()
//                .filter(v -> v.length() > 6)
//                .collect(Collectors.toCollection(() -> new ArrayList<>()));
//
//        System.out.println(collect1);
//        System.out.println(collect2.getClass());
//
//
//        Optional<String> collect3 = cities1.stream()
//                .collect(Collectors.maxBy(Comparator.<String>naturalOrder().reversed()));
//
//        System.out.println(collect3);
//
//
//        Optional<Integer> reduce = cities1.stream()
//                .map(String::length)
//                .reduce((a, b) -> a + b);
//
//        System.out.println(reduce);
//
//
//        cities1.stream()
//                .collect(Collectors.mapping(String::length, Collectors.reducing(0, (a, b) -> a+b)));
//
//
//        Map<String, Integer> collect4 = cities1.stream()
//                .collect(Collectors.toMap(key -> key, val -> val.length()));
//
//
//        collect4.forEach((key, value) -> System.out.println("Key " + key + ", value " + value));


//        Map<Integer, String> collect5 = cities1.stream()
//                .collect(Collectors.toMap(String::length, v -> v, (left, right) -> left + ", " + right));
//        collect5.forEach((a, b ) -> System.out.println("Key: " + a + " Value: " + b));
//
//
//        Map<Integer, List<String>> collect = cities1.stream()
//                .collect(Collectors.toMap(String::length, List::of, Main::merge));


//        Map<Boolean, List<String>> collect = cities1.stream()
//                .collect(Collectors.partitioningBy(x -> x.length() > 6));
//
//        collect.forEach((x, y)-> System.out.println("Key: " + x +", Value: " + y));


        Map<Integer, Set<String>> collect = cities1.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.toSet()));
        collect.forEach((x, y)-> System.out.println("Key: " + x +", Value: " + y));


    }

//    private static List<String> merge(List<String> left,List<String> right) {
//        List<String> result = new ArrayList<>(left);
//        result.addAll(right);
//        return result;
//
//
//
//    }
}
