package JavaChapersTest.Chaper17LamdasAndStreams.streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamOperation {

//    collection of
    public static List<Integer> getEvenNumbersOf(List<Integer> numbers){
        return numbers.stream()
               .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
    }
//    public static Collection<Integer> getEvenNumbersOf(List<Integer> numbers){
//        return numbers.stream()
//               .filter(number -> number % 2 == 0)
//                .collect(Collectors.toCollection(TreeSet::new));
//    }


    //    public static List<Integer> mapCodePointToCharacter(List<Integer> codePoints) {
//        return codePoints.stream()
//                .collect(Collectors.toMap((codepoint)->codepoint,
//                        Character::toString));
//    }
//    public static Map<Integer, String> mapCodePointToCharacter(List<Integer> codePoints) {
//        return codePoints.stream()
//                .collect(Collectors.toMap(
//                        codepoint -> codepoint,
//                        Character::toString, (a, b)->b));
//
//    }
    public static Map<Integer, String> mapCodePointToCharacter(List<Integer> codePoints) {
        return codePoints.stream()
                .collect(Collectors.toMap(
                        codepoint -> codepoint,
                        Character::toString, (a, b)->b, ()-> new HashMap<>()));

    }
public static String getNumbersFormatted(List<Integer> numbers) {

        return numbers.stream()
                .map((number)->number+"")
                .collect(Collectors.joining(",","[","]"));
}


}