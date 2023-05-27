package lamda;

@FunctionalInterface
interface ITest
{
    int findSquare(int num);
}
public class LamdaTest {

    public static void main(String[] args) {
        ITest iTest=a->a*a;
        System.out.println(iTest.findSquare(25));
    }
}
