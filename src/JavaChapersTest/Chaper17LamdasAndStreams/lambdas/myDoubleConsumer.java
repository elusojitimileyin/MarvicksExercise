package JavaChapersTest.Chaper17LamdasAndStreams.lambdas;

import java.util.function.DoubleConsumer;

public class myDoubleConsumer {
    public static void main(String[] args) {
        DoubleConsumer doubleConsumer =
                (x) -> System.out.println(x);
        doubleConsumer.accept(10d);
    }
}
