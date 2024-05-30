package JavaChapersTest.ClassExamples;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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


    public static Transaction[] deserialize(String json) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, Transaction[].class);
    }

    public static List<Transaction> getAllTransactionsForTheDay(String input, LocalDate date) throws IOException {

        Path path = Paths.get(input);
        String fileContent = Files.readString(path);
        Transaction[] transactions = deserialize(fileContent);
        return Arrays.stream(transactions).filter((transaction) -> (transaction.getDate().equals(date))).toList();

    }

    public static List<Transaction> returnAllTransaction(String input) throws IOException {
        Path path = Paths.get(input);
        String filContent = Files.readString(path);
        Transaction[] transactions = deserialize(filContent);
        return Arrays.stream(transactions).toList();
    }

    public static List<Transaction> takesTheStartDateAndEndDateAndReturnAllTransactionsInThatPeriod(String input,  String startDate, String endDate) throws IOException {

        Path path = Paths.get(input);
        String fileContent = Files.readString(path);
        Transaction[] transactions = deserialize(fileContent);
        return Arrays.stream(transactions).filter((transaction) ->
//                        !transaction.getDate().isBefore(startDate) && !transaction.getDate().isAfter(endDate))
//                .collect(Collectors.toList());
                (transaction.getDate().compareTo(LocalDate.parse(startDate)) >= 0
                        && transaction.getDate().compareTo(LocalDate.parse(endDate)) <= 0)
        ).toList();

    }

    public static Double getTheAverageOfAllTransactionsInASpecifPeriod(String input, String startDate , String endDate) throws IOException {

       List<Transaction> transactionList = takesTheStartDateAndEndDateAndReturnAllTransactionsInThatPeriod(input,startDate , endDate);

        return transactionList.stream()
                .mapToDouble(transaction -> transaction.getAmount())
                .average().getAsDouble();
    }

    public static Account getAccount(String input, int transactionId) throws IOException{
        Account myAccount = new Account();
        var transactions = returnAllTransaction(input);
        myAccount.setBalance(transactions.stream().filter(transaction -> transaction.getId()== transactionId).mapToDouble(Transaction::getAmount).sum());
        myAccount.setTransactionCount((int) transactions.stream().filter(transaction -> transaction.getId()== transactionId).count());
        myAccount.setId(transactionId);
        return myAccount;
    }
    public static int getTransactionAccount(String input,int transactionId ) throws IOException {
        var transactions = returnAllTransaction(input);
        return transactions.stream()
                .filter(transaction -> transaction.getId() == transactionId)
                .mapToInt( Transaction::getId).sum();
    }

}