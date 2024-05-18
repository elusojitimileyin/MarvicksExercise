package JavaChapersTest.ClassExamples;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TransactionAccessor {



    public static int calculateTotalAmountTransaction(String input) throws IOException {
        Path path = Paths.get(input);
        String fileContent = Files.readString(path);

        Transaction[] transactions = deserialize(fileContent);
        int totalAmount = 0;
        for (Transaction transaction : transactions) {
            totalAmount += transaction.getAmount();
        }
    return totalAmount;

    }


    public static Transaction[] deserialize(String json) throws  JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, Transaction[].class);
    }
}