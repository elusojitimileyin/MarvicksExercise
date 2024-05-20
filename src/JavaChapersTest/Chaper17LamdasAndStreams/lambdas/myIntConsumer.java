package JavaChapersTest.Chaper17LamdasAndStreams.lambdas;

import java.util.function.IntConsumer;

public class myIntConsumer {
    public static void main(String[] args) {
        IntConsumer myIntConsumer = System.out::println;
        myIntConsumer.accept(10);
    }
}
