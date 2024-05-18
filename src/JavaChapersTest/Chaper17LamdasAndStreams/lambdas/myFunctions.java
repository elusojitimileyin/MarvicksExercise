package JavaChapersTest.Chaper17LamdasAndStreams.lambdas;

import java.util.function.Function;

public class myFunctions {
    public static void main(String[] args) {
        Function<String, Integer> function = String::length;
        System.out.println(function.apply("word feminists"));
    }
}
