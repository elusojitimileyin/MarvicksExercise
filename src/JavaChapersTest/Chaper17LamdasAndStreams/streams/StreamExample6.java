package JavaChapersTest.Chaper17LamdasAndStreams.streams;


// In java there are three primitive types streams;
// int streams
    // long streams
    // double streams

// In java there are  non-primitive types streams;

    // Stream<String>
    // Stream<Integer>
    // Stream<Long>
    // Stream<Double>
    // Stream<Float>
    // Stream<Character>
    // Stream<Boolean>

// There is stream of objects
//Using map to object

    // Streams<Object>

import java.util.stream.IntStream;

public class StreamExample6 {
    public static void main(String[] args) {
        String word = "Hello";
//        IntStream intStream =word.chars();
//        intStream.forEach((element)-> System.out.println(element));

        Boolean result = word.chars()
                .filter((number) -> number > 100)
//                .map((number) -> number * number)
//                .forEach(System.out::println);


                .mapToObj((number)->Boolean.TRUE)
//                .distinct()
                .reduce(false,(a,b)-> a!=b);

        System.out.println(result);
    }
}
