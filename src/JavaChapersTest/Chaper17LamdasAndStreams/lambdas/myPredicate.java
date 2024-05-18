package JavaChapersTest.Chaper17LamdasAndStreams.lambdas;

import java.util.function.Predicate;

public class myPredicate {
    public static void main(String[] args) {
        Predicate<String> predicate  = (x) -> x.equals("foo");{
            System.out.println((predicate.test("foo")));

        }
    }
}
