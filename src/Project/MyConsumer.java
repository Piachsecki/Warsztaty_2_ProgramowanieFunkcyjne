package Project;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MyConsumer  {

    public <T> void mySupplier(Supplier<T> supplier) {
//        System.out.println(supplier.get());
        T t = supplier.get();
        System.out.println(t);
    }

    public <T> void myConsumerFun(Consumer<String> consumer){
        consumer.accept("my argh");
    }

    public <T extends Number, R> void myFunction(Function<Integer, String> function){
        System.out.println(function.apply(123));
    }


}
