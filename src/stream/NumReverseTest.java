package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NumReverseTest {
    public static void main(String[] args) {
       numRev();
       numRevJava8();
    }

    private static void numRevJava8() {
        System.out.println("sort Number using java 8.............");
        int num=3452;
        System.out.println(num);
        List<Integer> nums=new ArrayList<>();
        for(;num>0;num/=10)
        {
            nums.add(num%10);
        }
        nums.stream()
                .sorted()
                .forEach(System.out::print);
    }

    private static void numRev() {
        int num=3452;
        int sum=0;
        System.out.println(num);
        while(num>0)
        {
            int r=num%10;
            sum=sum*10+r;
            num=num/10;

        }
        System.out.println(sum);
    }
}
