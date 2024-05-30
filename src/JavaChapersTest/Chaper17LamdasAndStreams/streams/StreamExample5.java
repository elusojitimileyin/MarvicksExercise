package JavaChapersTest.Chaper17LamdasAndStreams.streams;

import java.util.List;

public class StreamExample5 {
//    map
    public static void main(String[] args) {

            List<String> words= List.of("djfhffij", "12345","jfnnfipifjifj","fddt");
            words.stream()
                    .map((word)->word.length())
                     .forEach((word)->System.out.println(word));





    }
}
