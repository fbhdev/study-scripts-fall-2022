import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Main class encapsulates the running time logic
 * @author Francois Boulay-Handfield
 */
public class Main {

    static String course = "";
    private enum CourseType {
        WEB_SERVICES, WEB_DEVELOPMENT, PROGRAMMING_TECHNIQUES_2, DATA_STRUCTURES_AND_ALGORITHMS
    }

    /**
     * main() runs the program
     * @param args the arguments to pass
     */
    public static void main(String[] args)  {
        do {
            processCommands();
        } while (again());
        System.out.println("Thanks for studying!");
    }

    /**
     * selectCourse() acts as the welcome menu
     * @return selection between 1 and 5
     */
    public static int selectCourse(){
        System.out.println("1. Web Services");
        System.out.println("2. Web Development");
        System.out.println("3. Data Structures and Algorithms");
        System.out.println("4. Programming Techniques 2");
        System.out.println("5. Exit");
        Input input = new Input("Select a course");
        System.out.println();
        for(int count = 1; count <= 5; count++){
            if(input.getInput().equals(String.valueOf(count))){
                return count;
            }
        }
        return 0;
    }

    /**
     * again() prompts the user for another round of studying
     * @return true if the user wishes to study more, false otherwise
     */
    public static boolean again(){
        while (true) {
            Input input = new Input("Would you like to study more? (y/n)");
            if (input.getInput().equalsIgnoreCase("y")) {
                return true;
            }
            if (input.getInput().equalsIgnoreCase("n")) {
                return false;
            }
            System.out.print("Please enter a valid input -> ");
        }
    }

    /**
     * length() returns the desired quiz length, random or user-defined
     * @param questions, the ArrayList with respective course questions
     * @return the desired length of the quiz
     */
    public static int length(ArrayList<Question> questions){
        int size = questions.size();
        System.out.println(size + " questions available.");
        int length = random(size);
        if(length == 0){
            while(true) {
                Input input = new Input("How many questions would you like to answer?");
                length = Integer.parseInt(input.getInput());
                if (!(length > 0 && length <= questions.size() && length <= 100)) {
                    continue;
                }
                length = Integer.parseInt(input.getInput());
                break;
            }
        }
        return length;
    }

    /**
     * random() handles logic regarding generation of maximum random number
     * @param size of the ArrayList questions
     * @return random length
     */
    public static int random(int size){
        int length = 0;
        while(true) {
            Input random = new Input("Random number of questions?");
            if (random.getInput().equalsIgnoreCase("y")) {
                length = (int) (Math.random() * 100 + 1);
                if (length > size) {
                    length = (int) (Math.random() * size + 1);
                }
                break;
            }
            else if (random.getInput().equalsIgnoreCase("n")) {
                break;
            }
            else {
                System.out.print("Please enter a valid input -> ");
            }
        }
        return length;
    }

    /**
     * flow() handles the quiz logic
     * @param length number of available questions per respective course
     */
    public static void flow(int length){
        if (length == 0) return;
        Records.setNumQuestions(length);
        System.out.println();
        System.out.println("Welcome to the " + course + " quiz!");
        System.out.println("You will be asked " + length + " questions.");
        System.out.println();
        for (Question question : Course.allQuestions()) {
            if (length == 0) {
                break;
            }
            if (length > 1) {
                System.out.println(length + " questions left");
            }
            else {
                System.out.println(length + " question left");
            }
            question.askUser();
            length--;
        }
        new Grade().printGrade();
        Course.allQuestions().clear();
        Records.save(course);
    }

    public static void load(CourseType course) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(course + ".csv"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                String[] split = line.split(";");
                if (split.length == 4) {
                    new Question(split[0], split[1], Integer.parseInt(split[2]), split[3]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void release(CourseType course, boolean shuffle){
        load(course);
        if (shuffle) Collections.shuffle(Course.allQuestions());
    }

    /**
     * run() handles logic based on menu selection
     */
    public static void processCommands() {
        int choice = selectCourse();
        if (choice == 1){
            course = "Web Services";
            release(CourseType.WEB_SERVICES, true);
            flow(length(Course.allQuestions()));
        }
        else if (choice == 2){
            course = "Web Development";
            release(CourseType.WEB_DEVELOPMENT, true);
            flow(length(Course.allQuestions()));
        }
        else if (choice == 3){
            course = "Data Structures and Algorithms";
            release(CourseType.DATA_STRUCTURES_AND_ALGORITHMS, true);
            flow(length(Course.allQuestions()));
        }
//        else if (choice == 4){
//            PT2 pt2 = new PT2();
//            pt2.release(true);
//            pt2.run(length(pt2.allQuestions()));
//        }
        else if (choice == 5){
            System.exit(0);
        }
        else {
            System.out.println("Invalid choice");
            System.out.println();
        }
    }
}
