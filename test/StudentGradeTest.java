import StudentGradeApp.StudentGradeApp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentGradeTest {
    @Test
    public void numberOfStudents_sizeOfStudent() {
        StudentGradeApp studentGradeApp = new StudentGradeApp();
        studentGradeApp.collectInfo(4, 3);
        assertEquals(4, studentGradeApp.getScores());
    }

    @Test
    public void testForPositiveValue() {
        StudentGradeApp studentGradeApp = new StudentGradeApp();
        studentGradeApp.collectInfo(4, 3);
        assertEquals(83.0, studentGradeApp.calculateStudentGradeScore(34, 20, 29));
    }


    @Test
    public void testForScore() {
        StudentGradeApp studentGradeApp = new StudentGradeApp();
        studentGradeApp.collectInfo(4, 3);
        assertEquals(24, studentGradeApp.calculateStudentGradeScore(2, 20, 2));
    }

    @Test
    public void testForAverageScore() {
        StudentGradeApp studentGradeApp = new StudentGradeApp();
        studentGradeApp.collectInfo(4, 3);
        assertEquals(8, studentGradeApp.calculateAverageStudentGradeScore(2, 20, 2));
    }

    @Test
    public void testForClassGrade() {
        StudentGradeApp studentGradeApp = new StudentGradeApp();
        studentGradeApp.collectInfo(4, 3);
        int[][] scoresGrade = new int[][]{{2, 4, 10}, {2, 20, 2}, {0, 14, 2}, {7, 2, 3}};
        assertEquals(68, studentGradeApp.calculateClassGrade(scoresGrade));
    }

    @Test
    public void testForAverageClassGrade() {
        StudentGradeApp studentGradeApp = new StudentGradeApp();
        studentGradeApp.collectInfo(4, 3);
        int[][] scoresGrade = new int[][]{{2, 4, 10}, {2, 20, 2}, {0, 14, 2}, {7, 2, 3}};
        assertEquals(5.666666666666667, studentGradeApp.calculateAverageClassGrade(scoresGrade));
    }

    @Test
    public void testForEnteringStudentNumberLesserThanZero() {
        StudentGradeApp studentGradeApp = new StudentGradeApp();
        assertThrows(IllegalArgumentException.class, () -> studentGradeApp.collectInfo(-1, 2));
    }

    @Test
    public void testForEnteringSubjectsNumberLesserThanZero() {
        StudentGradeApp studentGradeApp = new StudentGradeApp();
        assertThrows(IllegalArgumentException.class, () -> studentGradeApp.collectInfo(2, -2));
    }
}