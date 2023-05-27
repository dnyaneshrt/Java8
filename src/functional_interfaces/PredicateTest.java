package functional_interfaces;

import java.util.function.Predicate;
/*interface Predicate<T> {
    public boolean test(T t);
}*/
public class PredicateTest {
    public static void main(String[] args) {
     /*   int age=15;
        if(age<18)
            System.out.println("cannot vote.. go and play");
        else
            System.out.println("you can vote");*/

    /*    Predicate<Integer> p1=new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer>18)
                    return true;
                else
                    return false;
            }
        };*/
          Predicate<Integer> p1=(i)->i>18;
         /*  if(p1.test(25))
               System.out.println("you can vote");
           else
               System.out.println("you cannot vote");*/

      /*  Integer[] nums=new Integer[]{15,25,78,13,24,63};
        for(Integer i:nums)
        {
            if(p1.test(i))
                System.out.println(i+" you can vote");
            else
                System.out.println(i+" you cannot vote");
        }*/

        Predicate<String> predicate=s->s.length()>4; //this predicate will return true for strings whose length>5 only


       String[] names=new String[]{"sonali","manoj","neha","Akshay"};
       for(String name:names)
       {
           System.out.println(name+":::"+predicate.test(name));
       }

        System.out.println("predicate.negate()..............................");
        for(String name:names)
        {
            System.out.println(name+":::"+predicate.negate().test(name));
        }

        Predicate<Integer> predicate1=i->i%2==0;  //this predicate will return true for even numbers only
        for(int i=1;i<=10;i++)
        {
            if(predicate1.test(i))
                System.out.println(i);
        }

        System.out.println("predicate.negate()..............................");
        for(int i=1;i<=10;i++)
        {
            if(predicate1.negate().test(i))
                System.out.println(i);
        }
    }
}
