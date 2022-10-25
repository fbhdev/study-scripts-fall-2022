import java.util.ArrayList;

public class Course {

    private static String course;
    private static final ArrayList<Module> modules = new ArrayList<>();
    private static final ArrayList<Question> questions = new ArrayList<>();

    /**
     * @return a String with the course's name
     */
    public static String getCourse() {
        return Course.course;
    }

    /**
     * @param course the course to set
     * @throws IllegalArgumentException if course not in isValid()
     */
    public void setCourse(String course) {
        if(!isValid(course)){
            throw new IllegalArgumentException("Invalid course");
        }
        Course.course = course;
    }

    /**
     * @param course to set
     * @return true if in String[] courses, false otherwise
     */
    public boolean isValid(String course){
        String[] courses = {
                "Web Development",
                "Web Services",
                "Programming Techniques 2",
                "Data Structures and Algorithms"
        };

        for(String c : courses){
            if(c.equalsIgnoreCase(course)){
                return true;
            }
        }
        return false;
    }

    /**
     * @return an ArrayList with all the course's Module objects
     */
    public static ArrayList<Module> allModules(){
        return modules;
    }

    /**
     * @return an ArrayList with all the course's Question objects
     */
    public static ArrayList<Question> allQuestions() {
        return questions;
    }
}
