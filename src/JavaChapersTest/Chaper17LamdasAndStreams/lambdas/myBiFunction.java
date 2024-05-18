package JavaChapersTest.Chaper17LamdasAndStreams.lambdas;

import java.util.function.BiFunction;

public class myBiFunction {
    public static void main(String[] args) {

        BiFunction<String, String, Integer> biFunction = (x, y) -> x.length() + y.length();
        System.out.println(biFunction.apply("word", "feminists"));
    }
}