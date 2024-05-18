package JavaChapersTest.ClassExamples;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Transaction {

    private int id;
    private String name;

    private double amount;

    private Type type;
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate date;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }



//    @Override
//    public String toString() {
//        return "Transaction{" +
//                "name:'" + name + '\'' +
//                ", id:'" + id + '\'' +
//                ", amount:'" + amount + '\'' +
//                ", amount:'" + amount + '\'' +
//                ", date:" + date +
//                '}';
//    }

}