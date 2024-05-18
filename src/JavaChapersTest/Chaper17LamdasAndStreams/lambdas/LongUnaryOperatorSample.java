package JavaChapersTest.Chaper17LamdasAndStreams.lambdas;

import java.util.function.LongUnaryOperator;

public class LongUnaryOperatorSample {

    public static void main(String[] args) {
        LongUnaryOperator longUnaryOperator = (num) -> num * 2;
        Long result = longUnaryOperator.applyAsLong(30L);
        System.out.println(result);

    }
}
