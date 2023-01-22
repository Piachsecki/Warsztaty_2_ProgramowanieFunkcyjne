package functionInterfaces;

import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
//        Optional<String> optional = Optional.of("Optional").filter(s -> s.length() >10);
//
//        System.out.println(optional);



        //PREDICATE
//        List<String> strings = new ArrayList<>();
//        strings.add("SomeVal");
//        strings.add("SomeOPther");
//        strings.add("So2");
//        strings.add("S564356");
//        strings.removeIf(str -> str.contains("56"));
//        System.out.println(strings);


        //CONSUMER
//        Optional.of(1).ifPresent(v -> System.out.println("present"));
//        Optional.empty().ifPresent(v -> System.out.println("present"));



        //SUPPLIER
//        String s = (String) Optional.empty().orElseGet(() -> "default");
//        System.out.println(s);

        //BIPREDICATE


        //BiConsumer
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "Cat");
//        map.put(2, "NotCat");
//
//
//        map.forEach((k, v)->
//                System.out.println("Value for key: " + k + "  is " + v));

        //FUNCTION

//        Optional<Cat> someVal = Optional.of("SomeVal").map(s -> new Cat(s));
//        System.out.println(someVal);


        //BiFunction

//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "Cat");
//        map.put(2, "NotCat");
//        map.replaceAll((k, v)->{
//            System.out.println("Calling bifunction method");
//            return v.concat("Added");
//        });
//        System.out.println(map);


        //Unary

//        List<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("2"); map.put(1, "Cat");
////        map.put(2, "NotCat");
//        list.add("3");
//        list.add("4");
//
//        list.replaceAll(s -> s.concat("Added"));
//        System.out.println(list);

        //BINARYOPERATOR
        //...


//        Optional<Integer> value = Optional.of("Value")
//                .map(a -> a.length())
//                .filter(x -> x > 5);
//        value
//                .ifPresent(toConsume -> System.out.println(toConsume));
//
//
//        List<String> stringList = new ArrayList<>();
//        stringList.removeIf(e -> e.contains("abc"));
//
//        Map<Integer, String> map = new HashMap<>();
//        map.replaceAll((k, v)-> v.concat("added"));


        //Exceptions in lambda
        // handle it with unm checked exceptions - runtime


        Function<String, Integer> stringIntegerFunction = String::length;
        System.out.println(stringIntegerFunction.apply("cos"));






    }

    private static Integer method(String s){
        return s.length();
    }

    private static class Cat{
        public Cat(String s)
        {

        }


    }
}