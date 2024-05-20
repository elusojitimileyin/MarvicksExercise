package JavaChapersTest.Chaper17LamdasAndStreams.lambdas;

import java.util.function.ToIntBiFunction;

public class myToIntBiFunction {
    public static void main(String[] args) {
        ToIntBiFunction<Integer,Integer> toIntBiFunction = (a,b)-> a*b;
        System.out.println(toIntBiFunction.applyAsInt(10,2));
    }
}
