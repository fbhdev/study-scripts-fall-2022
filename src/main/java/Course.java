import java.util.ArrayList;

/**
 * Course class encapsulates the course logic
 * @author Francois Boulay-Handfield
 */
public class Course {

    private static String course;
    private static final ArrayList<Module> modules = new ArrayList<>();
    private static final ArrayList<Question> questions = new ArrayList<>();
    private static final String[] courses = {
            "Web Development",
            "Web Services",
            "Programming Techniques 2",
            "Data Structures and Algorithms"
    };

    /**
     * <h1>courses</h1>
     * @return an array with all courses
     */
    public static String[] courses() {
        return Course.courses;
    }

    /**
     * <h1>getCourse</h1>
     * @return a String with the course's name
     */
    public static String getCourse() {
        return Course.course;
    }

    /**
     * <h1>setCourse</h1>
     * @param course the course to set
     * @throws IllegalArgumentException if course not in isValid()
     */
    public static void setCourse(String course) {
        if(!isValid(course)){
            throw new IllegalArgumentException("Invalid course");
        }
        Course.course = course;
    }

    /**
     * <h1>isValid</h1>
     * @param course to set
     * @return true if in String[] courses, false otherwise
     */
    public static boolean isValid(String course){
        for(String c : courses){
            if(c.equalsIgnoreCase(course)){
                return true;
            }
        }
        return false;
    }

    /**
     * <h1>allQuestions</h1>
     * @return an ArrayList with all the course's Question objects
     */
    public static ArrayList<Question> allQuestions() {
        return questions;
    }
}
