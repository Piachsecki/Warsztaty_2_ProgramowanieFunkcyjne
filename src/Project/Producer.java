package Project;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Producer<T> {

    public Supplier<T> getSupplierImpl(T t){
        return () -> t;
    }

    public Consumer<T> getConsumerImpl(){
        return u -> System.out.println("Consumed: " + u);
    }

    public Function<T, T > getFunctionImpl(T t){
        return u-> u.toString().compareTo(t.toString()) > 0 ? u : t;
    }


}
