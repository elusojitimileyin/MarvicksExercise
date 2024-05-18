package ContactInfo;

import ContactInfo.ContactInfo;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private final List<ContactInfo> contacts = new ArrayList<>();

    public void validatePhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 11) {
            throw new NumberFormatException("Phone number must be 11 digits long.");
        } else {
            System.out.println("Phone number validated successfully.");
        }
    }

    public void addContact(String name, String address, String phoneNumber,String emailAddress) {
        validatePhoneNumber(phoneNumber);
        ContactInfo newContactInfo = new ContactInfo(name, address, phoneNumber, emailAddress);
        contacts.add(newContactInfo);
    }

    public void removeContact(String name, String address, String phoneNumber, String emailAddress) {
        for (int index = 0; index < contacts.size(); index++) {
            ContactInfo contact = contacts.get(index);
            if (contact.getName().equals(name) &&
                    contact.getAddress().equals(address) &&
                    contact.getPhoneNumber().equals(phoneNumber) &&
                    contact.getEmailAddress().equals(emailAddress)) {
                contacts.remove(index);
            }
        }
    }

    public int displayContacts() {
        System.out.println("Contact Details: ");
        for (ContactInfo contact : contacts) {
            System.out.println("############################");
            System.out.println(contact.getDisplayInfo());
            System.out.println("############################");
        }
        return contacts.size();
    }

    public int getContacts() {
       return contacts.size();
    }
}

