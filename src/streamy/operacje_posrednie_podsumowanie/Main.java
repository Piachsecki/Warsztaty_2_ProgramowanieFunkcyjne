package streamy.operacje_posrednie_podsumowanie;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
                List<String> cities1 = Arrays.asList(
                "Zakopane",
                "Szczecin",
                "Gdansk",
                "Poznan",
                "Warszawa",
                "Gdynia",
                "Gdansk");


        List<String> collect = cities1.stream().limit(3).collect(Collectors.toList());
        System.out.println(collect);




    }


    static class Person{
        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", city=" + city +
                    '}';
        }

        public String getName() {
            return name;
        }

        public City getCity() {
            return city;
        }

        public Person(String name, City city) {
            this.name = name;
            this.city = city;
        }

        private final String name;

        private final City city;

    }


    static class City {
        private final String name;

        @Override
        public String toString() {
            return "City{" +
                    "name='" + name + '\'' +
                    '}';
        }

        public String getName() {
            return name;
        }

        public City(String name) {
            this.name = name;
        }
    }
}



//    List<Person> people = Arrays.asList(
//            new Person("Roman"  , new City("Zakopane")),
//            new Person("Maciek" , new City("Szczecin")),
//                new Person("Antek"  , new City("Gdansk")),
//                new Person("Kacper" , new City("Poznan")),
//                new Person("Mikolaj", new City("Warszawa")),
//                new Person("Piotrek", new City("Gdynia")),
//            new Person("Aneta"  , new City("Gdansk")));

//    String reduce = people.stream()
//            .map(Person::getCity)
//            .map(city -> city.name)
//            .map(String::toUpperCase)
//            .reduce("start:", (a, b) -> String.format("%s-%s", a, b));
//        System.out.println(reduce);
//
//                List<Integer> collect = people.stream()
//        .peek(p -> System.out.println("Step 1: " + p))
//        .map(Person::getCity)
//        .peek(c -> System.out.println("Step 2 : " + c))
//        .map(City::getName)
//        .peek(d -> System.out.println("Step 3 : " + d))
//        .map(String::length)
//        .peek(l -> System.out.println("Step 4 : " + l))
//        .collect(Collectors.toList());
//        System.out.println(collect);


//
//
//        List<String> cities1 = Arrays.asList(
//                "Zakopane",
//                "Szczecin",
//                "Gdansk",
//                "Poznan",
//                "Warszawa",
//                "Gdynia",
//                "Gdansk");
//        List<String> cities2 = Arrays.asList(
//                "Zakopane",
//                "Szczecin",
//                "Gdansk",
//                "Poznan",
//                "Warszawa",
//                "Gdynia",
//                "Gdansk");
//        List<String> cities3 = Arrays.asList(
//                "Zakopane",
//                "Szczecin",
//                "Gdansk",
//                "Poznan",
//                "Warszawa",
//                "Gdynia",
//                "Gdansk");
//
//
//        List<List<String>> citiesCombined = List.of(cities1, cities2, cities3);
//        System.out.println(citiesCombined);
//
//        Set<String> collect = citiesCombined.stream()
//                .flatMap(list -> list.stream())
//                .collect(Collectors.toSet());
//
//        System.out.println(collect);

