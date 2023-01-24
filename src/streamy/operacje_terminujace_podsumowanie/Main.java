package streamy.operacje_terminujace_podsumowanie;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();


        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
//
//        Set<Integer> collect = list.stream().
//                collect(Collectors.toSet());
//        System.out.println(collect);
//
//
//        Integer reduce = list.stream().reduce(0, (a, b) -> a + b);
//        System.out.println(reduce);


        Integer reduce1 = list.stream().reduce(1, (currentState, nextElem) -> {
            System.out.println("currentState " + currentState);
            System.out.println("currentState + 4 " + (currentState + 1));
            return currentState + 4;
        });

        System.out.println(reduce1);
    }
}
