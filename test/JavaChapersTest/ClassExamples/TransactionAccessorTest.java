package JavaChapersTest.ClassExamples;

import JavaChapersTest.JsonSerializer.JsonSerializer;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;


import static JavaChapersTest.ClassExamples.TransactionAccessor.takesTheStartDateAndEndDateAndReturnAllTransactionsInThatPeriod;
import static org.junit.jupiter.api.Assertions.*;

class TransactionAccessorTest {




    @Test
    public void calculateTotalAmountTransaction() throws IOException {
         String  input = "C:\\Users\\DELL\\IdeaProjects\\mavericksExercise\\src\\JavaChapersTest\\ClassExamples\\Transaction.Json";
        int totalAmount = 8000;
        assertEquals(totalAmount,TransactionAccessor.calculateTotalAmountTransaction(input));
    }

    @Test
    public void  testThatGetAllTransactionsForTheDay() throws IOException{
        String  input = "C:\\Users\\DELL\\IdeaProjects\\mavericksExercise\\src\\JavaChapersTest\\ClassExamples\\Transaction.Json";

        String date = "2024-05-16";

        int expected = 1 ;

        assertEquals( expected,TransactionAccessor.getAllTransactionsForTheDay(input, LocalDate.parse(date)).size() );

    }

    @Test
    public void  testThatTakesTheStartDateAndEndDateAndReturnAllTransactionsInThatPeriod() throws IOException{
        String  input = "C:\\Users\\DELL\\IdeaProjects\\mavericksExercise\\src\\JavaChapersTest\\ClassExamples\\Transaction.Json";


        String startDate = "2024-05-12";
        String endDate = "2024-05-26";

        List<Transaction> result = TransactionAccessor.takesTheStartDateAndEndDateAndReturnAllTransactionsInThatPeriod(input, startDate, endDate);


            assertEquals(4, result.size());
            assertEquals(LocalDate.of(2024, 5, 12), result.get(0).getDate());
            assertEquals(LocalDate.of(2024, 5, 16), result.get(1).getDate());
            assertEquals(LocalDate.of(2024, 5, 17), result.get(2).getDate());
            assertEquals(LocalDate.of(2024, 5, 26), result.get(3).getDate());
        }



    @Test
    public void  testThatGetTheAverageOfAllTransactionsInASpecifPeriod() throws IOException {
        String input = "C:\\Users\\DELL\\IdeaProjects\\mavericksExercise\\src\\JavaChapersTest\\ClassExamples\\Transaction.Json";
        String startDate = "2024-05-12";
        String endDate = "2024-05-26";
        Double result = TransactionAccessor.getTheAverageOfAllTransactionsInASpecifPeriod(input,startDate, endDate);
        Double expected = 2000.0;

        assertEquals(expected, result);
    }

    @Test
    public void  testThatGetAllTransactionsAccount() throws IOException{
        String input = "C:\\Users\\DELL\\IdeaProjects\\mavericksExercise\\src\\JavaChapersTest\\ClassExamples\\Transaction.Json";
        int transactionId = 4;
        assertEquals(4, TransactionAccessor.getTransactionAccount(input, transactionId));


    }
    }

