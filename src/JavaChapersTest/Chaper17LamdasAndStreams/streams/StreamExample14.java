package JavaChapersTest.Chaper17LamdasAndStreams.streams;

import java.util.List;
import java.util.stream.IntStream;

public class StreamExample14 {

//    flatmap is returning one stream statistic
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40);

        var stats = numbers.stream()
                .flatMapToInt((element) ->IntStream.of(element*2))
                .summaryStatistics();
        System.out.println(stats);
        stats.accept(6);
        System.out.println(stats);


    }
}
