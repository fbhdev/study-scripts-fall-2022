import java.util.ArrayList;

public class Main {

    public static void main(String[] args)  {
        do {
            run();
        } while (again());
        System.out.println("Thanks for studying!");
    }

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
        System.out.println("You will answer " + length + " questions.");
        System.out.println();
        return length;
    }


    public static int random(int size){
        int length = 0;
        Input random = new Input("Random number of questions?");
        while(true) {
            if (random.getInput().equalsIgnoreCase("y")) {
                length = (int) (Math.random() * size + 1);
                if(length > 100){
                    length = 100;
                }
                if (length > size) {
                    length = size;
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

    public static void flow(int length, String course) {
        if (length == 0) return;
        Records.setNumQuestions(length);
        System.out.println();
        System.out.println("Welcome to the " + course + " quiz!");
        System.out.println("You will be asked " + length + " questions.");
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
            System.out.println(question);
            question.askUser();
            length--;
        }
        new Grade().printGrade();
        Course.allQuestions().clear();
        Records.save(course);
    }

    public static void run() {
        int choice = selectCourse();
        if (choice == 1){
            WebServices ws = new WebServices();
            System.out.println(Course.getCourse());
            ws.release(true);
            flow(length(Course.allQuestions()), Course.getCourse());
        }
        else if (choice == 2){
            WebDev wd = new WebDev();
            System.out.println(Course.getCourse());
            wd.release(true);
            flow(length(Course.allQuestions()), Course.getCourse());
        }
        else if (choice == 3){
            DSA dsa = new DSA();
            System.out.println(Course.getCourse());
            dsa.release(true);
            flow(length(Course.allQuestions()), Course.getCourse());
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
