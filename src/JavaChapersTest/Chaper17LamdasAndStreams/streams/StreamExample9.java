package JavaChapersTest.Chaper17LamdasAndStreams.streams;

import java.util.List;

public class StreamExample9 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,4,7,1,2,7,9,3,8,9,5,6);

        List<Integer> result = numbers.stream()
                .distinct()
                .sorted()
                .toList();
        System.out.println(result);
    }
}
