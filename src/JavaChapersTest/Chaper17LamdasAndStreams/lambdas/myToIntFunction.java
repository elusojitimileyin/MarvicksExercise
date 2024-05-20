package JavaChapersTest.Chaper17LamdasAndStreams.lambdas;

import java.util.function.ToIntFunction;

public class myToIntFunction {
    public static void main(String[] args) {
        ToIntFunction<String> toIntFunction = String::length;
        System.out.println(toIntFunction.applyAsInt("word"));
    }
}
