package Project;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
//        Producer<String> myProducer = new Producer<>();
//        Supplier<String> mySupplier = myProducer.getSupplierImpl("myAwesomeString");
//        System.out.println(mySupplier.get());
//
//        Consumer<String> myConsumer = myProducer.getConsumerImpl();
//        myConsumer.accept("It is my parameter");
//
//
//        Function<String, String> myFunction = myProducer.getFunctionImpl("This is longer String");
//        String apply = myFunction.apply("this is ");
//        System.out.println(apply);
//

//        Transformer transformer = new Transformer();
//        Function<String, Integer> myFunction2 = Transformer.getFunctionImpl();
//        Optional<Integer> myOptional = Optional.of("myString").map(myFunction2);
//        System.out.println(myOptional);
//
//        UnaryOperator<String> myUnaryOperator = Transformer.getUnaryOperator();
//        Optional<String> myOptional2 = Optional.of("Hello").map(myUnaryOperator);
//        System.out.println(myOptional2);


        MyConsumer myConsumer = new MyConsumer();
        myConsumer.mySupplier(() -> "hello");
        myConsumer.myConsumerFun(System.out::println);
        myConsumer.myFunction(x-> x.toString());




    }
}
