import MenstruationApp.MenstruationCycle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

public class MenstruationCycleTest {
    private MenstruationCycle myMenstruationApp;

    @BeforeEach
    void initializeMenstruationCycle() {
        myMenstruationApp = new MenstruationCycle();
    }

        @Test
        void testThatGetFullNameIsValid(){
            myMenstruationApp.setFullName("Oba ");
            assertEquals("Oba ", myMenstruationApp.getFullName());

        }
        @Test
        void testThatGetGenderIsValid(){
            myMenstruationApp.setGender("female");
            assertEquals("female", myMenstruationApp.getGender());

        }
        @Test
        void testThatGetAgeIsValid(){
            myMenstruationApp.setAge(26);
            assertEquals(26, myMenstruationApp.getAge());

        }
        @Test
        void testThatSetAverageCycleIsValid(){
            myMenstruationApp.setAverageCycle(30);
            assertEquals( 30,myMenstruationApp.getAverageCycle());
        }

        @Test
        void calculateAndDisplayCycleInfo() {
            myMenstruationApp.setAverageCycle(35);
            myMenstruationApp.setLastPeriodDay(1);
            myMenstruationApp.setLastPeriodMonth(3);
            assertEquals(LocalDate.of(2024, 04, 05), myMenstruationApp.calculateAndDisplayCycleInfo());
        }

        @Test
        void InvalidAgeLimitBelowAgeLimit(){
            assertThrows(InputMismatchException.class,() -> myMenstruationApp.setAge(9));
        }

        @Test
        void InvalidAgeAboveAgeLimit(){
            assertThrows(InputMismatchException.class,() -> myMenstruationApp.setAge(69));
        }
        @Test
        void InvalidAverageCycleBelowLimit(){
            assertThrows(InputMismatchException.class,() -> myMenstruationApp.setAverageCycle(15));
        }
        @Test
        void InvalidAverageCycleAboveLimit(){
            assertThrows(InputMismatchException.class,() -> myMenstruationApp.setAverageCycle(49));
        }

        @Test
        void InvalidLastPeriodMonth(){
            assertThrows(InputMismatchException.class,() -> myMenstruationApp.setLastPeriodMonth(30));
        }

        @Test
        void NegativePeriodMonth(){
            assertThrows(InputMismatchException.class,() -> myMenstruationApp.setLastPeriodMonth(-2));

        }
        @Test
        void negativePeriodDay(){
            assertThrows(InputMismatchException.class,() -> myMenstruationApp.setLastPeriodDay(-2));
        }
        @Test
        void maximumPeriodDay(){
            assertThrows(InputMismatchException.class,() -> myMenstruationApp.setLastPeriodDay(35));
        }

        @Test
        void testGender(){
            assertThrows(InputMismatchException.class,() -> myMenstruationApp.setGender("male"));

        }

    }