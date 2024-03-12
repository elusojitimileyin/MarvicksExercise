import java.util.Scanner;

public class CreditCardValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kindly enter what you would like to validate: ");
        String number = scanner.next();
        int theLength = number.length();

        int firstSum = 0;
        int secondSum = 0;
        String validity = "";
        String cardType = "";
        int[] array = new int[number.length()];

        try {
            if (theLength >= 13 && theLength <= 16) {
                for (int i = 0; i < number.length(); i++) {
                    String broken = String.valueOf(number.charAt(i));
                    array[i] = Integer.parseInt(broken);
                }
                if (array[0] == 4) {
                    cardType = "Visa Card";
                } else if (array[0] == 5) {
                    cardType = "MasterCard";
                } else if (array[0] == 3 && array[1] == 7) {
                    cardType = "American Express Card";
                } else if (array[0] == 6) {
                    cardType = "Discover card";
                }

                for (int i = 0; i < array.length; i++) {
                    if (i % 2 == 0) {
                        int var = array[i] * 2;
                        if (var > 9) {
                            int brokenDown = 0;
                            while (var > 0) {
                                int cals = var % 10;
                                brokenDown += cals;
                                var /= 10;
                            }
                            firstSum += brokenDown;
                        } else {
                            firstSum += var;
                        }
                    } else {
                        secondSum += array[i];
                    }
                }
                int totalRes = firstSum + secondSum;
                if (totalRes % 10 == 0) {
                    validity = "Valid";
                } else {
                    validity = "Invalid";
                }
            } else {
                validity = "Invalid";
                cardType = "Invalid";
            }
        } catch (NumberFormatException e) {
            validity = "Invalid";
            cardType = "Invalid";
            System.out.println("Invalid input. Please enter a numeric string.");
            return;
        }

        System.out.printf("""
                *****************************************
                **Credit Card Type: %s
                **Credit Card Number: %s
                **Credit Card Digit Length: %s
                **Credit Card Validity Status: %s
                ******************************************
                """,cardType,number,theLength,validity);
    }
}
