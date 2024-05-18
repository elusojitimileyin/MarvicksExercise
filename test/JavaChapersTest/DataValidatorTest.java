package JavaChapersTest;

import JavaChapersTest.ClassExamples.DataValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataValidatorTest {
    @Test
    public void testValidatePhoneNumber(){
        String phoneNumber = "";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertFalse(isPhoneNumberValid);
    }

    @Test
    public void testValidatePhoneNumber2(){
        String phoneNumber = "08012345678";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue(isPhoneNumberValid);
    }

    @Test
    public void testValidatePhoneNumber3(){
        String phoneNumber = "+2348012345678";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue(isPhoneNumberValid);
    }

    @Test
    public void testValidatePhoneNumber4(){
        String phoneNumber = "+234801234567893";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertFalse(isPhoneNumberValid);
    }
    @Test
    public void testValidatePhoneNumber5(){
        String phoneNumber = "2348012345678";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue(isPhoneNumberValid);
    }
    @Test
    public void testValidatePhoneNumber6(){
        String phoneNumber = "2347112345678";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertFalse(isPhoneNumberValid);
    }
    @Test
    public void testValidatePhoneNumber7(){
        String phoneNumber = "a234711.2345678";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertFalse(isPhoneNumberValid);
    }
    @Test
    public void testValidatePhoneNumber8(){
        String phoneNumber = "+234-8012345678";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue(isPhoneNumberValid);
    }
    @Test
    public void testValidatePhoneNumber9(){
        String phoneNumber = "080 123 45678";
        boolean isPhoneNumberValid = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue(isPhoneNumberValid);
    }
    @Test
    public void testValidateEmail(){
        String email = "T.Tobantu@native.semicolon.africa";
        boolean isEmailValid = DataValidator.isEmailValid(email);
        assertTrue(isEmailValid);
    }
}