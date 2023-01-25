package streamy.operacje_terminujace;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = List.of("v1", "v2", "v3");

        String[] someChars = new String[]{
                "z", "a", "j", "a", "v", "k", "a"
        };


//        List<String> result = stringList.stream()
//                .peek(value -> System.out.println("value: "+ value))
//                .collect(Collectors.toList());
//
//        System.out.println(stringList.stream().count());

//        Optional<String> first1 = stringList.stream().findFirst();
//        Optional<String> first2 = stringList.stream().findAny();
//        System.out.println(first1);
//        System.out.println(first2);

//        Optional<String> min = stringList.stream().min(String::compareTo);
//        Optional<String> max = stringList.stream().max(String::compareTo);
//        Optional<String> max2 = Stream.<String>empty().max(Comparator.naturalOrder());
//        System.out.println(min);
//        System.out.println(max);
//        System.out.println(max2);


//        boolean elo = stringList.stream().allMatch(x -> x.contains("elo"));
//        System.out.println(elo);
//
//        boolean b = stringList.stream().anyMatch(x -> x.contains("1"));
//        boolean c = stringList.stream().anyMatch(x -> x.contains("elo"));
//        System.out.println(b);
//        System.out.println(c);


//        stringList.stream().forEach(System.out::println);








//        Optional<String> reduce = stringList.stream().reduce((a, b) -> a + b);
//        System.out.println(reduce);
//
//



//
//        String start = Stream.of(someChars).reduce("start", (a, b) -> a + "//" + b);
//        System.out.println(start);

        String collect = Arrays.stream(someChars).collect(Collectors.joining(";"));
        System.out.println(collect);
//
////        Stream.of(someChars).collect(() -> new ArrayList<Character>());
//        System.out.println(collect);


    }
}
