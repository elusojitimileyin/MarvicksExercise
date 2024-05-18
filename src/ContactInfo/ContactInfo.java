package ContactInfo;

public class ContactInfo {
    private final String name;
    private final String address;
    private final String phoneNumber;
    private final String emailAddress;

    public ContactInfo(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getDisplayInfo() {
        return "Name: " + name + "\nAddress: " + address + "\nPhone Number: " + phoneNumber + "\nEmail Address: " + emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}