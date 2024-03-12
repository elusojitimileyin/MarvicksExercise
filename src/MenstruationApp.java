
import java.util.Scanner;

public class MenstruationApp {



    public int displayMenstrualOvulatingPeriod(int ovulate){

        if(ovulate >= 13 && ovulate <= 15){
            System.out.println("ovulating period");
        }
        else {
            System.out.println("non ovulating period");
        }
        return ovulate;
    }
    public int displayMenstrualCycleDaysPeriod(){

        System.out.println("how old are you?");
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        if(days >=21 && days <= 35) {
            System.out.println(" menstrual period ");
            if (days == 28){

                System.out.println("perfect period");
            }
        }
        else {
            System.out.println("non menstrual period ");
        }


        return days;
    }
    public int displayMenstrualAgeRange(int age) {

        if (age >= 12 && age <= 52) {
            System.out.println("Normal menstruation cycle age range");
            if (age == 12) {
                System.out.println("Starting age");
            }
            if (age >= 48 && age < 52) {
                System.out.println("menopause age");
            }
            if (age > 12 && age <= 47) {
                System.out.println("normal age");
            }

        } else {
            System.out.println("Abnormal menstruation age range");
        }
        return  age;
    }
//        public static void main(String[] args) {
//
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("what is your name?");
//            String name = scanner.nextLine();
//            System.out.println("how old are you?");
//            int age = scanner.nextInt();
//
//            MenstruationApp menstruation = new MenstruationApp();
//            menstruation.displayMenstrualAgeRange(age);
//            int ovulate = scanner.nextInt();
//            menstruation.displayMenstrualOvulatingPeriod(ovulate);
//
//            int days = scanner.nextInt();
//            menstruation.displayMenstrualOvulatingPeriod(days);
//        }
}


