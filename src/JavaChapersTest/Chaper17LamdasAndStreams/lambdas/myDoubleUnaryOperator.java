package JavaChapersTest.Chaper17LamdasAndStreams.lambdas;

import java.util.function.DoubleUnaryOperator;

public class myDoubleUnaryOperator {
    public static void main(String[] args) {
        DoubleUnaryOperator myUnaryOper = (Double)->Double*2;
        System.out.println(myUnaryOper.applyAsDouble(10.0));
    }
}
