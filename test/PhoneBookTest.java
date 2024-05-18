//import ContactInfo.PhoneBook;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//class PhoneBookTest {
//
//    @Test
//    public void testForAddContactInfo() {
//        PhoneBook myPhoneBook = new PhoneBook();
//        myPhoneBook.addContact("timi", "bobi street", "02333333122", "iam@gmail.com");
//        myPhoneBook.addContact("bj", "feso street", "08161232345", "sk@gmail.com");
//        assertEquals(2, myPhoneBook.getContacts());
//    }
//    @Test
//    public void testForAddContactInfo_removeContactInfo() {
//        PhoneBook myPhoneBook = new PhoneBook();
//        myPhoneBook.addContact("timi", "bobi street", "02333333122", "iam@gmail.com");
//        myPhoneBook.addContact("bj", "feso street", "08161232345", "sk@gmail.com");
//        assertEquals(2, myPhoneBook.getContacts());
//        myPhoneBook.removeContact("bj", "feso street", "08161232345", "sk@gmail.com");
//        assertEquals(1, myPhoneBook.getContacts());
//    }
//
//    @Test
//    public void testForAddContactInfo_emptyContactInfo() {
//        PhoneBook myPhoneBook = new PhoneBook();
//        myPhoneBook.addContact("timi", "bobi street", "02333333122", "iam@gmail.com");
//        myPhoneBook.addContact("bj", "feso street", "08161232345", "sk@gmail.com");
//        assertEquals(2, myPhoneBook.getContacts());
//        myPhoneBook.removeContact("timi", "bobi street", "02333333122", "iam@gmail.com");
//        myPhoneBook.removeContact("bj", "feso street", "08161232345", "sk@gmail.com");
//        assertEquals(0, myPhoneBook.getContacts());
//    }
//
//
//    @Test
//    public void testForAddContactInfo_displayContactInfo() {
//        PhoneBook myPhoneBook = new PhoneBook();
//        myPhoneBook.addContact("timi", "bobi street", "02333333122", "iam@gmail.com");
//        myPhoneBook.addContact("bj", "feso street", "08161232345", "sk@gmail.com");
//        assertEquals(2, myPhoneBook.displayContacts());
//    }
//}
//
//
//
//
//
