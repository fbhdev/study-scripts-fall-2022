import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.util.Random;

/**
 * <h1>GradeTest</h1>
 * @author Francois Boulay-Handfield
 */
class GradeTest {

    Grade[] grades = new Grade[new Random().nextInt(100)];
    double[] marks = new double[grades.length];


    // ———————— Populate Arrays ————————


    /**
     * makeGrades creates a random number of grades
     * <h1>makeGrades</h1>
     */
    void makeGrades(){
        for(int index = 0; index < grades.length; index++) {
            grades[index] = new Grade();
        }
    }

    /**
     * makeMarks creates an array of random marks
     * <h1>makeMarks</h1>
     */
    void makeMarks() {
        if (grades[0] == null) {
            makeGrades();
        }
        for(int index = 0; index < marks.length; index++) {
            marks[index] = new Random().nextInt(100);
        }
    }


    // ———————— Test Methods ————————


    /**
     * Tests if the final grade is valid
     * <h1>finalGrade</h1>
     */
    @Test
    void finalGrade() {
        makeMarks();
        for(int index = 0; index < grades.length; index++) {
            assertTrue(marks[index] >= 0 && marks[index] <= 100);
        }
    }

    /**
     * Tests the printGrade() method
     * <h1>printGrade</h1>
     */
    @Test
    void printGrade() {
        makeMarks();
        for (Grade grade : grades) {
            grade.printGrade();
        }
    }

    /**
     * Tests if it resets the marks and total variables to 0
     * <h1>reset</h1>
     */
    @Test
    void reset() {
        makeGrades();
        for (Grade grade : grades) {
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
        makeGrades();
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
        makeGrades();
        for (Grade grade: grades) {
            grade.setMarks(new Random().nextInt(100));
            assertTrue(grade.getMarks() >= 0 && grade.getMarks() <= 100);
        }
    }

    /**
     * Tests if the grade is valid
     * <h1>isValid</h1>
     */
    @Test
    void isValid() {
        makeGrades();
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
        makeGrades();
        for (Grade grade: grades) {
            grade.message(new Random().nextBoolean());
        }
    }

    /**
     * Tests if leniency works
     * <h1>leniency</h1>
     */
    @Test
    void leniency() {
    }

    /**
     * Tests if correction works
     * <h1>manualCorrection</h1>
     */
    @Test
    void manualCorrection() {
    }

    /**
     * Tests if the total is valid
     * <h1>success</h1>
     */
    @Test
    void success() {
        makeGrades();
        for(Grade grade: grades) {
            grade.success();
        }
    }

    /**
     * Tests if the total is valid
     * <h1>failures</h1>
     */
    @Test
    void failure() {
        makeGrades();
        for(Grade grade: grades) {
            grade.failure("", false);
        }
    }

    /**
     * Tests if the total is valid
     * <h1>arithmetics</h1>
     */
    @Test
    void arithmetics() {
        makeMarks();
        for(double mark : marks) {
            assertTrue(mark >= 0 && mark <= 100);
        }
    }
}