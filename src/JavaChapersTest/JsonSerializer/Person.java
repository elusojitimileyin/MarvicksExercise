package JavaChapersTest.JsonSerializer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.time.LocalDate;
import java.time.ZoneId;

//@JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.NON_EMPTY)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Person {
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String name;
    @JsonProperty("dob")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate dateOfBirth;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String phoneNumber;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Sex sex;



    public Person( String name, LocalDate dateOfBirth, String phoneNumber, String  sex ) {
        this.name = name;
        this.dateOfBirth = LocalDate.now();
        this.phoneNumber = phoneNumber;
        this.sex = JavaChapersTest.JsonSerializer.Sex.valueOf(sex);

    }

    public Person() {

    }


    @Override
    public String toString() {
        return "Person{" +
                "name:'" + name + '\'' +
                ", dateOfBirth:'" + dateOfBirth + '\'' +
                ", phoneNumber:'" + phoneNumber + '\'' +
                ", sex:" + sex +
                '}';
    }


    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }


    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
