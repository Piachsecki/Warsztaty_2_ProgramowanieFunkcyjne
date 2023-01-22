package exercises.ex2;

@FunctionalInterface
public interface TriFunction<T, I extends Number, D> {
    Integer method(String s, Integer i, D t);

}
