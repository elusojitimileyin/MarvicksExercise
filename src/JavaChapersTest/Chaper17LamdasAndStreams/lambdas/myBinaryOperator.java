package JavaChapersTest.Chaper17LamdasAndStreams.lambdas;

import java.util.function.BinaryOperator;

public class myBinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (x, y) -> x / y;
        System.out.println(binaryOperator.apply(10, 2));
    }
}
