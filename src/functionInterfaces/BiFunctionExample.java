package functionInterfaces;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<String, Integer, Dog> biFunction = (str, inter) -> {
            System.out.println("Calling method apply");
            return new Dog(str, inter);
        };

        Dog burek = biFunction.apply("Burek", 6);
        System.out.println(burek);


    }
    public static class Dog{
        private String name;
        private Integer years;

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", years=" + years +
                    '}';
        }

        public Dog(String name, Integer years) {
            this.name = name;
            this.years = years;
        }
    }
}
