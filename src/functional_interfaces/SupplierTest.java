package functional_interfaces;

/*
@FunctionalInterface
public interface Supplier<T> {

    */

import java.util.function.Supplier;

/**
     * Gets a result.
     *
     * @return a result
     *//*

    T get();
}
*/

public class SupplierTest {
    public static void main(String[] args) {
        String name="Dnyaneshwar";
       /* Supplier<String> supplier=new Supplier<String>() {
            @Override
            public String get() {
                return "Hi "+name;
            }
        };
*/
        Supplier<String> supplier=()->"Hello "+name;
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());


        Supplier<Integer> squareSupplier=()->{
               return ( int )( Math.random() * 9999 );
        };
        System.out.println(squareSupplier.get());
        System.out.println(squareSupplier.get());
        System.out.println(squareSupplier.get());
        System.out.println(squareSupplier.get());
        System.out.println(squareSupplier.get());
        System.out.println(squareSupplier.get());



    }
}
