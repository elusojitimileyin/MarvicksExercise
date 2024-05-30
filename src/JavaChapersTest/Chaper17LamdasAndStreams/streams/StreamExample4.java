package JavaChapersTest.Chaper17LamdasAndStreams.streams;

import JavaChapersTest.ClassExamples.Transaction;

import java.util.List;

public class StreamExample4 {

//    filter
    public static void main(String[] args) {
        List<String> word = List.of("djfhffij", "12345","jfnnfipifjifj");

        word.stream()
                .filter(s->s.length() <= 5)
                .forEach(System.out::println);//.forEach((s) -> System.Out.println(s.toString()));


    }
}
