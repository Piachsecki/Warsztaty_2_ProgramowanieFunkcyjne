package exercises.ex2;

public class Main {
    public static void main(String[] args) {
        TriFunction<String, Integer, Dog> ex = ((str, integer, dog) ->{
            System.out.println("Lambda method calling");
            return str.length() + integer + dog.toString().length();
        });


        Integer integer = ex.method("123", 4, new Dog("Kacepr"));
        System.out.println(integer);

        TriFunction<String, Integer, Dog> ex1 = ((str, integer1, dog) ->{
            Integer sum = 0;
            sum+= countChars(str, 'a');
            sum+=integer1;
            sum+= countChars(dog.toString(), ',') + countChars(dog.toString(), '=');
            return sum;
        });

        Integer method = ex1.method("Zajavkla", 23, new Dog("siemka"));
        System.out.println(method);
    }

    private static Integer countChars(String str, char x) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == x){
                sum++;
            }
        }
        return sum;
    }


    private static class Dog{
        private String name;

        public Dog(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public Dog(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        private Integer age;
    }

}


