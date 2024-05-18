package MenstruationApp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenstruationAppMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MenstruationCycle menstruationApp = new MenstruationCycle();

        System.out.println("Welcome to the Menstruation Tracking App!");

        try {
            System.out.print("Enter your full name: ");
            menstruationApp.setFullName(scanner.nextLine());

            System.out.print("Enter your gender: ");
            menstruationApp.setGender(scanner.nextLine());

            System.out.print("Enter the day of your last period: ");
            menstruationApp.setLastPeriodDay(scanner.nextInt());

            System.out.print("Enter the month of your last period: ");
            menstruationApp.setLastPeriodMonth(scanner.nextInt());

            System.out.print("Enter your average cycle length (in days): ");
            menstruationApp.setAverageCycle(scanner.nextInt());

            System.out.print("Enter your age: ");
            menstruationApp.setAge(scanner.nextInt());

            menstruationApp.calculateAndDisplayCycleInfo();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid data.");
        } finally {
            scanner.close();
        }
    }
}