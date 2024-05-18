package JavaChapersTest.Chaper17LamdasAndStreams.lambdas;

import java.util.function.UnaryOperator;

public class MyUnaryOperator {

    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = (melody) -> melody + " whooped micheal" ;
        System.out.println((unaryOperator.apply("Melody")));
    }
}
