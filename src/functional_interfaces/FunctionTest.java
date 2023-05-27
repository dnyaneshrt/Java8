package functional_interfaces;


/*interface Function(T,R) {
public R apply(T t);
}*/

import java.util.function.Function;

public class FunctionTest{
    public static void main(String[] args) {

       /* Function<String,Integer> function=s->s.length();
        System.out.println(function.apply("Dnyaneshwar"));
        System.out.println(function.apply("Java"));*/

        Function<Integer,Integer> function=n->n*n*n;
        System.out.println(function.apply(25));
        System.out.println(function.apply(15));


    }
}
