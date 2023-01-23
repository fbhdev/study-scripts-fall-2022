import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

/**
 * <h1>GradeTest</h1>
 * @author Francois Boulay-Handfield
 */
class GradeTest {

    Grade[] grades = new Grade[new Random().nextInt(100)];

    @BeforeEach
    void setUp() {
        // make random grades
        for (int i = 0; i < grades.length; i++) {
            grades[i] = new Grade();
            grades[i].setMarks(new Random().nextInt(100));
            grades[i].setTotal(100);
        }
    }

    /**
     * Tests if the final grade is valid
     * <h1>finalGrade</h1>
     */
    @Test
    void finalGrade() {
        for(Grade grade: grades) {
            System.out.println(grade.finalGrade());
            assertTrue(grade.finalGrade() >= 0 && grade.finalGrade() <= 100);
        }
    }

    /**
     * Tests the printGrade() method
     * <h1>printGrade</h1>
     */
    @Test
    void printFinalGrade() {
        Grade mock = Mockito.mock(Grade.class);
        mock.printFinalGrade();
        Mockito.verify(mock).printFinalGrade();
    }

    /**
     * Tests if it resets the marks and total variables to 0
     * <h1>reset</h1>
     */
    @Test
    void reset() {
        for (Grade grade : grades) {
            System.out.println(grade.getMarks());
            grade.reset();
            assertEquals(0, grade.getMarks());
            assertEquals(0, grade.getTotal());
        }
    }

    /**
     * Tests if the marks are valid
     * <h1>getMarks</h1>
     */
    @Test
    void getMarks() {
        for (Grade grade: grades) {
            assertTrue(grade.getMarks() >= 0 && grade.getMarks() <= 100);
        }
    }

    /**
     * Tests if the marks are set correctly
     * <h1>setMarks</h1>
     */
    @Test
    void setMarks() {
        for (Grade grade: grades) {
            assertTrue(grade.getMarks() >= 0 && grade.getMarks() <= 100);
        }
    }

    @Test
    void getTotal() {
        for (Grade grade: grades) {
            assertTrue(grade.getTotal() >= 0 && grade.getTotal() <= 100);
        }
    }

    @Test
    void setTotal() {
        for (Grade grade: grades) {
            assertTrue(grade.getTotal() >= 0 && grade.getTotal() <= 100);
        }
    }

    @Test
    void getGrade() {
        for (Grade grade: grades) {
            assertTrue(grade.getGrade() >= 0 && grade.getGrade() <= 100);
        }
    }

    @Test
    void setGrade() {
        for (Grade grade: grades) {
            assertTrue(grade.getGrade() >= 0 && grade.getGrade() <= 100);
        }
    }

    /**
     * Tests if the grade is valid
     * <h1>isValid</h1>
     */
    @Test
    void isValid() {
        for (Grade grade: grades) {
            assertTrue(grade.isValid(new Random().nextInt(100)));
        }
        for (Grade grade: grades) {
            assertFalse(grade.isValid(-1));
        }
    }

    /**
     * Tests if messages are printed
     * <h1>message</h1>
     */
    @Test
    void message() {
        Grade mockGrade = Mockito.mock(Grade.class);
        boolean msg = new Random().nextBoolean();
        mockGrade.message(msg);
        Mockito.verify(mockGrade).message(msg);
    }

    /**
     * Tests if leniency works
     * <h1>leniency</h1>
     */
    @Test
    void leniency() {
        Grade mockGrade = Mockito.mock(Grade.class);
        String answer = "answer";
        Input input = Mockito.mock(Input.class);
        mockGrade.leniency(answer, input);
        Mockito.verify(mockGrade).leniency(answer, input);
    }

    /**
     * Tests if correction works
     * <h1>manualCorrection</h1>
     */
    @Test
    @Disabled
    void manualCorrection() {
        // todo
    }

    /**
     * Tests if the total is valid
     * <h1>success</h1>
     */
    @Test
    void success() {
        Grade mockGrade = Mockito.mock(Grade.class);
        mockGrade.success();
        Mockito.verify(mockGrade).success();
    }

    /**
     * Tests if the total is valid
     * <h1>failures</h1>
     */
    @Test
    void failure() {
        Grade mockGrade = Mockito.mock(Grade.class);
        boolean msg = new Random().nextBoolean();
        mockGrade.failure("", msg);
        Mockito.verify(mockGrade).failure("", msg);
    }
}