package CreditCardValidator;

import java.util.Scanner;

public class CreditCardValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kindly enter the number you would like to validate: ");
        String number = scanner.next();
        int theLength = number.length();

        int firstSum = 0;
        int secondSum = 0;
        String validity = "";
        String cardType = "";
        int[] array = new int[number.length()];

        try {
            if (theLength >= 13 && theLength <= 16) {
                for (int index = 0; index < number.length(); index++) {
                    String broken = String.valueOf(number.charAt(index));
                    array[index] = Integer.parseInt(broken);
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
                        int dig = array[i] * 2;
                        if (dig > 9) {
                            int brokenDown = 0;
                            while (dig > 0) {
                                int cals = dig % 10;
                                brokenDown += cals;
                                dig /= 10;
                            }
                            firstSum += brokenDown;
                        } else {
                            firstSum += dig;
                        }
                    } else {
                        secondSum += array[i];
                    }
                }
                int totalSum = firstSum + secondSum;
                if (totalSum % 10 == 0) {
                    validity = "Valid";
                } else {
                    validity = "Invalid";
                }
            } else {
                validity = "Invalid";
                cardType = "Invalid";
            }
        } catch (NumberFormatException e) {
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
