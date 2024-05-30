package JavaChapersTest.Chaper17LamdasAndStreams.streams;

import java.util.List;
import java.util.stream.IntStream;

public class StreamExample15 {

//    limit
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40);

        numbers = numbers.stream()
                .limit(4)
                .toList();
        System.out.println(numbers);


    }
}
