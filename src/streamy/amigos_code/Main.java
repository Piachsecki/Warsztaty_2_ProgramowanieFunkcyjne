package streamy.amigos_code;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = getPeople();

        List<Person> females = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

//    females.forEach(System.out::println);

        // Sort
        List<Person> collect = people.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .collect(Collectors.toList());

        collect.forEach(System.out::println);

        boolean b = people.stream()
                .allMatch(p -> p.getAge() > 7);
        System.out.println(b);

        boolean b1 = people.stream()
                .anyMatch(p -> p.getAge() < 23);
        System.out.println(b1);


        Optional<Person> max = people.stream()
                .max(Comparator.comparing(x -> x.getAge()));
        max
                .ifPresent(System.out::println);


        //group

        Map<Gender, List<Person>> collect1 = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));
        System.out.println(collect1);


    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("Antonio", 20, Gender.MALE),
                new Person("Alina Smith", 33, Gender.FEMALE),
                new Person("Helen White", 57, Gender.FEMALE),
                new Person("Alex Boz", 14, Gender.MALE),
                new Person("Jamie Goa", 99, Gender.MALE),
                new Person("Anna Cook", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE)
        );
    }
}
