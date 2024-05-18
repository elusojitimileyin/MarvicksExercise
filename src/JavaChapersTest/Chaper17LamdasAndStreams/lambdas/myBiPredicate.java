package JavaChapersTest.Chaper17LamdasAndStreams.lambdas;

import java.util.function.BiPredicate;

public class myBiPredicate {

    public static void main(String[] args) {
        BiPredicate<String, String> biPredicate = (word, number) -> word.length() == number.length();
        System.out.println((biPredicate.test("word", "number")));
    }
}
