package JavaChapersTest.Chaper17LamdasAndStreams.lambdas;

import java.util.function.Consumer;

public class myConsumer {
    public static void main(String[] args) {
        Consumer<String> consumer = (word) ->{
                System.out.println(word);};
        consumer.accept("word");
    }
}
