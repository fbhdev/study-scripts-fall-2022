import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Main class encapsulates the running time logic
 * @author Francois Boulay-Handfield
 */
public class Main {

    private static String course;
    private static final int MODULES = 12;

    private enum CourseType {
        WEB_SERVICES, WEB_DEVELOPMENT, PROGRAMMING_TECHNIQUES_2, DATA_STRUCTURES_AND_ALGORITHMS
    }


    /**
     * <h1>main</h1>
     * @param args the arguments to pass
     */
    public static void main(String[] args)  {
        do {
            processCommands();
        } while (again());
        System.out.println("Thanks for studying!");
    }

    /**
     * <h1>selectCourse</h1>
     * @return selection between 1 and 5
     */
    public static int selectCourse(){
        int menuCount = 0;
        System.out.println(++menuCount + ". Web Services");
        System.out.println(++menuCount + ". Web Development");
        System.out.println(++menuCount + ". Data Structures and Algorithms");
        System.out.println(++menuCount + ". Programming Techniques 2");
        System.out.println(++menuCount + ". Exit");
        Input input = new Input("Select a course");
        System.out.println();
        for(int count = 1; count <= menuCount; count++){
            if(input.getInput().equals(String.valueOf(count))){
                return count;
            }
        }
        return 0;
    }

    /**
     * <h1>isValidAnswer</h1>
     * @param input the input to process
     * @param expected the expected input
     * @return true if the input is the expected input
     */
    private static boolean isValidAnswer(String input, String expected){
        Pattern pattern = Pattern.compile(expected, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

    /**
     * <h1>selectedModules</h1>
     * @param modules the modules to process
     */
    private static void selectedModules(ArrayList<Integer> modules){
        if (modules.size() > 0) {
            StringBuilder sb = new StringBuilder();
            for(int module : modules){
                sb.append(module).append(" ");
            }
            System.out.println("Selected modules: " + sb);
        }
    }

    /**
     * <h1>isAllSelected</h1>
     * @param modules the modules to process
     * @return the total number of modules
     */
    private static boolean isAllSelected(ArrayList<Integer> modules){
        return modules.size() == MODULES;
    }

    /**
     * <h1>addModule</h1>
     * @param input the input to process
     * @param modules the modules to process
     */
    private static void addModule(String input, ArrayList<Integer> modules){
        int module = Integer.parseInt(input);
        if (module > 0 && module <= MODULES) {
            System.out.println(module + " added to study list.");
            modules.add(module);
        }
        else if(module == 0){
            for (int count = 1; count <= MODULES; count++) {
                modules.add(count);
            }
            System.out.println(modules.size() + " modules added to study list.");
        }
        else {
            System.out.println("Invalid module number.");
        }
    }

    /**
     * <h1>selectModules</h1>
     * @return the selected modules
     */
    public static ArrayList<Integer> selectModules(){
        Input input;
        ArrayList<Integer> modules = new ArrayList<>();
        while(true) {
            if (isAllSelected(modules)) {
                break;
            }
            selectedModules(modules);
            String question = "Select modules to study (1-" + MODULES + ") | 0 to add all modules, \"Exit\" to exit";
            System.out.println();
            input = new Input(question);
            if (isValidAnswer(input.getInput(), "exit")) {
                System.out.println("No more modules selected.");
                System.out.println();
                break;
            }
            try {
                addModule(input.getInput(), modules);
            }
            catch (Exception e) {
                System.out.println("Invalid input");
            }
        }
        Collections.sort(modules);
        return modules;
    }

    /**
     * <h1>again</h1>
     * @return true if the user wishes to study more, false otherwise
     */
    public static boolean again(){
        while (true) {
            Input input = new Input("Would you like to study more? (y/n)");
            if (isValidAnswer(input.getInput(), "^y")) {
                return true;
            }
            else if (isValidAnswer(input.getInput(), "^n")) {
                return false;
            }
            else {
                System.out.println("Invalid input");
            }
        }
    }

    /**
     * <h1>length</h1>
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
     * <h1>random</h1>
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
     * <h1>flow</h1>
     * @param length number of available questions per respective course
     */
    public static void flow(int length){
        if (length == 0) return;
        Records.setNumQuestions(length);
        Course.setCourse(course);
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
        new Grade().printFinalGrade();
        Course.allQuestions().clear();
        Records.save(course);
    }

    /**
     * <h1>load</h1>
     * @param course the course to set
     * @param modules the modules to set
     */
    public static void load(CourseType course, ArrayList<Integer> modules) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(course + ".csv"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String line;
        try {
            int module;
            while ((line = reader.readLine()) != null) {
                String[] split = line.split(";");
                try {
                    module = Integer.parseInt(split[2]);
                }
                catch (Exception e){
                    continue;
                }
                if (split.length == 4 && modules.contains(module)) {
                    new Question(split[0], split[1], Integer.parseInt(split[2]), split[3]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * <h1>release</h1>
     * @param course the course to set
     * @param shuffle whether to shuffle the questions or not
     */
    public static void release(CourseType course, boolean shuffle){
        load(course, selectModules());
        if (shuffle) Collections.shuffle(Course.allQuestions());
    }

    /**
     * <h1>processCommands</h1>
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
