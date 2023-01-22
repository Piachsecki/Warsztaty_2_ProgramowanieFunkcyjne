package functionInterfaces;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> integerSupplier = () -> {
            return 2;
        };

        System.out.println(integerSupplier.get());
        Supplier<Integer> integerSupplier1 = SupplierExample::method;

        System.out.println(integerSupplier1.get());
    }


    public static Integer method(){
        return 4;
    }
}
