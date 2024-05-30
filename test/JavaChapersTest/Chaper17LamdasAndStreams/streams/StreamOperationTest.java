package JavaChapersTest.Chaper17LamdasAndStreams.streams;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import static JavaChapersTest.Chaper17LamdasAndStreams.streams.StreamOperation.getEvenNumbersOf;
import static JavaChapersTest.Chaper17LamdasAndStreams.streams.StreamOperation.mapCodePointToCharacter;
import static org.junit.jupiter.api.Assertions.*;

public class StreamOperationTest {

    @Test
    public void testGetEvenNumbers(){

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = getEvenNumbersOf(numbers);
        System.out.printf("even numbers: %s are %s" , numbers,evenNumbers);
        assertNotNull(evenNumbers);
        assertEquals(List.of(2, 4, 6, 8, 10), evenNumbers);
        assertEquals(5,evenNumbers.size());
    }


    @Test
    public void testMapCodePointToCharacter(){

        List<Integer> codePoints = List.of(65,97,98,66,69,48);

        Map<Integer, String> map = mapCodePointToCharacter(codePoints);

        Map<Integer, String> expected = Map.of(

                65,"A",
                97,"a",
                98,"b",
                66,"B",
                69,"E",
                48,"0");

        assertNotNull(map);
        System.out.println(map);
        assertEquals(expected,map);

    }

    @Test
    public void testGetNumbersFormatted(){
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5, 6, 7, 8, 9, 10);

        String result  = StreamOperation.getNumbersFormatted(numbers);

        String expected = "[1,2,2,3,4,4,5,6,7,8,9,10]";

        assertNotNull(result);
        System.out.println(result);
        assertTrue(result.startsWith("["));
        assertTrue(result.endsWith("]"));
        assertEquals(expected,result);

    }

}