package JavaChapersTest.Chaper17LamdasAndStreams.streams;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample13 {

//    flatmap is returning one stream
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40);

        double average = numbers.stream()
                .flatMapToInt((element) ->IntStream.of(element*2))
                .average().orElseThrow(()->new RuntimeException("number not represent"));
        System.out.println(average);


    }
}
