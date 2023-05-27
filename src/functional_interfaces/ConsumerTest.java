package functional_interfaces;

/*@FunctionalInterface
public interface Consumer<T> {

    */

import java.util.function.Consumer;

/**
     * Performs this operation on the given argument.
     *
     * @param t the input argument
     *//*
    void accept(T t);
}*/
public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> consumer= name->{
            System.out.println(name.toUpperCase());
        } ;
        consumer.accept("java");
        consumer.accept("Android");
        consumer.accept("kotlin");

    }
}
