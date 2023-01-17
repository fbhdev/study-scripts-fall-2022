import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <h1>CourseTest</h1>
 * @author Francois Boulay-Handfield
 */
class CourseTest {

    /**
     * Test courses
     * <h1>courses</h1>
     */
    void courses() {
        assertTrue(Course.courses().length > 0);
    }


    /**
     * Test that the course is named correctly.
     * <h1>getCourse</h1>
     */
    @Test
    void getCourse() {
        Course.setCourse("Web Development");
        assertEquals("Web Development", Course.getCourse());
    }

    /**
     * Test that the course is set correctly.
     * <h1>setCourse</h1>
     */
    @Test
    void setCourse() {
        // todo
    }

    /**
     * Test that the course is named correctly.
     * <h1>isValid</h1>
     */
    @Test
    void isValid() {
        final String[] courses = {
                "Web Development",
                "Web Services",
                "Programming Techniques 2",
                "Data Structures and Algorithms"
        };
        for(String course : courses){
            assertTrue(Course.isValid(course));
        }
    }

    /**
     * Test that the course is named correctly.
     * <h1>allQuestions</h1>
     */
    @Test
    void allQuestions() {
        // todo
    }
}