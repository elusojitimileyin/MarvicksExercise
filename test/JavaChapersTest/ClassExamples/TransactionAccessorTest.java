package JavaChapersTest.ClassExamples;

import JavaChapersTest.JsonSerializer.JsonSerializer;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;


import static org.junit.jupiter.api.Assertions.*;

class TransactionAccessorTest {




    @Test
    public void calculateTotalAmountTransaction() throws IOException {
        String  input = "C:\\Users\\DELL\\IdeaProjects\\mavericksExercise\\src\\JavaChapersTest\\ClassExamples\\Transaction.Json";
        int totalAmount = 8000;
        assertEquals(totalAmount,TransactionAccessor.calculateTotalAmountTransaction(input));
    }



}