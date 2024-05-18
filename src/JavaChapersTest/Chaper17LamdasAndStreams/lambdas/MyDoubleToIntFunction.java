package JavaChapersTest.Chaper17LamdasAndStreams.lambdas;

import java.util.function.DoubleToIntFunction;

public class MyDoubleToIntFunction {
    public static void main(String[] args) {
        DoubleToIntFunction doubleToIntFunction = (decimalNumber) ->Double.valueOf(decimalNumber).intValue();
        System.out.println(doubleToIntFunction.applyAsInt(123.456));
    }
}
