package JavaChapersTest.Chaper17LamdasAndStreams.streams;

import java.util.List;
import java.util.stream.Stream;

public class StreamExample12 {

//    flatmap is returning one stream
    public static void main(String[] args) {
        List<String> list = List.of(
             "ABCD", "HELLO", "Hey"
        );

        System.out.println(list.stream()
                .flatMap((element)->
        Stream.of(new StringBuilder(element).reverse()))
                .toList());
    }
}
