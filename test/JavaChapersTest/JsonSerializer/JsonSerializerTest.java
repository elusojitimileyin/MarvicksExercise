package JavaChapersTest.JsonSerializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;


import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class JsonSerializerTest {
    @Test
    public void testSerialize() {

    Person person = new Person();
    person.setName("John");
    LocalDate dateOfBirth =
            LocalDate.of(2024,10,10);
    person.setDateOfBirth(dateOfBirth);
    person.setPhoneNumber("08023578906");
    person.setSex(Sex.SHIM);


    String json = JsonSerializer.serialize(person);
    String expected = "{\"name\":\"John\",\"phoneNumber\":\"08023578906\",\"sex\":\"SHIM\",\"dob\":[2024,10,10]}";
    assertEquals(expected, json);

}

    @Test
    public void testDeserialize() throws JsonProcessingException {
        Person person = new Person("John",LocalDate.now(),"08023578906","SHIM");
//
//        Person person = new Person();
//        person.setName("John");
//        LocalDate dateOfBirth = LocalDate.of(2024,10,10);
//        person.setDateOfBirth(dateOfBirth);
//        person.setPhoneNumber("08023578906");
//        person.setSex(Sex.SHIM);

        String json =
        JsonSerializer.serialize(person);
//                "{\"name\":\"John\",\"dob\":\"2024-03-03\",\"phoneNumber\":\"08023578906\",\"sex\":\"SHIM\"}";


        System.out.println("json:" + json);
        Person personFromJson = JsonSerializer.deserialize(json);
//        System.out.println("personFromJson:" + personFromJson);

        assertNotNull(personFromJson);
        assertEquals(person.getDateOfBirth(), personFromJson.getDateOfBirth());
        assertEquals("John", personFromJson.getName());
        assertEquals("08023578906", personFromJson.getPhoneNumber());
        assertEquals(Sex.SHIM, personFromJson.getSex());

    }
}