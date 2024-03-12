import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MenstruationAppTest {
    private MenstruationApp myMenstruationApp;

    @BeforeEach
    void initializeMenstruationCycle() {
        myMenstruationApp = new MenstruationApp();
    }
        @Test
        void testDisplayMenstrualAgeRange() {
            assertEquals(0, myMenstruationApp.displayMenstrualAgeRange(0));
        }


        @Test
        public void testMenstrualOvulatingPeriod() {


            int ovulate = myMenstruationApp.displayMenstrualOvulatingPeriod(14);
            assertEquals(14, ovulate);

        }





    }







