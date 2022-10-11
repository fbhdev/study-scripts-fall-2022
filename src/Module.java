import java.util.ArrayList;

public class Module {

    private static final ArrayList<Module> modules = new ArrayList<>();
    private static final ArrayList<Question> questions = new ArrayList<>();
    private String course;
    private int module;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        if(!isValid(course)){
            throw new IllegalArgumentException("Invalid course");
        }
        this.course = course;
    }

    public int getModule() {
        return module;
    }

    public void setModule(int module) {
        this.module = module;
    }

    public static ArrayList<Module> modules(){
        return modules;
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

    public ArrayList<Question> allQuestions() {
        return questions;
    }

    public int length(){
        Input input = new Input("How many questions would you like to answer?");
        int length = Integer.parseInt(input.getInput());
        if(length > 0 && length <= questions.size()){
            return length;
        }
        return 0;
    }

    @Override
    public String toString() {
        return getCourse() + ", Module " + getModule();
    }
}
