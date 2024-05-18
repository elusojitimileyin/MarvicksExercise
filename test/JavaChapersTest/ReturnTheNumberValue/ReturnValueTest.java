package JavaChapersTest.ReturnTheNumberValue;

import JavaChapersTest.ClassExamples.TransactionAccessor;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ReturnValueTest {
    @Test
    public void testToReturnTheNumberOfDigitInTheFile() throws IOException {
        String  input = "C:\\Users\\DELL\\IdeaProjects\\mavericksExercise\\src\\JavaChapersTest\\Chaper15\\Stream\\samples.txt";
        int totalNumberOfDigits = 5;
        assertEquals(totalNumberOfDigits, ReturnValue.returnTheNumberOfDigitInTheFile(input));
    }


    @Test
    public void testToReturnTheNumberOfSentencesInTheFile() throws IOException {
        String  input = "C:\\Users\\DELL\\IdeaProjects\\mavericksExercise\\src\\JavaChapersTest\\Chaper15\\Stream\\samples.txt";
        int totalNumberOfSentences = 3;
        assertEquals(totalNumberOfSentences, ReturnValue.returnTheNumberOfSentenceInTheFile(input));
    }

}