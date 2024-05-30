package JavaChapersTest.Chaper17LamdasAndStreams.streams;

import java.security.SecureRandom;
import java.util.Set;
import java.util.stream.Stream;

public class streamExample1 {

//    Stream.of from the stream interface is use in creating streams
//There are two types of Operations in Streams:
//
//   1. Intermediate Operations
//   2. Terminate Operations
//
//    intermediate operations


//    filter()
//        map()
//            flatMap()
//                limit()
//                    peek()
//                        distinct()
//                            sorted()
//                                reduce()
//                                    collect()

//    terminate operations


//            forEach()    ===== consumer
//                toArray()
//                    count()
//                        anyMatch()
//                            allMatch()
//                                noneMatch()
//                                    findFirst()
//                                        findAny()
//                                            min()
//                                              max()
//                                               reduce()
//                                                   collect()

    public static void main(String[] args) {
        Set<Integer> numbers = Set.of(20,30,40,50);
        Stream<Integer> stream = numbers.stream();
//        stream.forEach((number)->System.out.println(number));

        Stream<String> emptyStream = Stream.empty();

        Stream<Integer>  integerStream = Stream.generate(()->new SecureRandom().nextInt()).limit(4);
        integerStream.forEach((number)->System.out.println(number));
    }
}
