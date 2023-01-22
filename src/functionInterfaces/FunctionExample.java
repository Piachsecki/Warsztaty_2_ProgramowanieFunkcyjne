package functionInterfaces;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Dog> function = str -> {
            System.out.println("Method inside called");
            return new Dog(str);
        };

        Dog burek = function.apply("Burek");
        System.out.println(burek);


    }


    public static class Dog{
        private String name;

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    '}';
        }

        public Dog(String name) {
            this.name = name;
        }
    }
}
