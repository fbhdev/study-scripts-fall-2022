import java.util.ArrayList;

public class Course {

    private static String course;
    private static final ArrayList<Module> modules = new ArrayList<>();
    private static final ArrayList<Question> questions = new ArrayList<>();

    public static String getCourse() {
        return Course.course;
    }

    public void setCourse(String course) {
        if(!isValid(course)){
            throw new IllegalArgumentException("Invalid course");
        }
        Course.course = course;
    }

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

    public ArrayList<Module> allModules(){
        return modules;
    }

    public ArrayList<Question> allQuestions() {
        return questions;
    }
}
