import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        do {
            run();
        } while (again());
        System.out.println("Thanks for studying!");
    }

    public static int select(){
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
        System.out.println(questions.size() + " questions available.");
        Input input = new Input("How many questions would you like to answer?");
        int length = Integer.parseInt(input.getInput());
        if(length > 0 && length <= questions.size()){
            return length;
        }
        System.out.println(questions.size() + " questions available.");
        System.out.println();
        return 0;
    }

    public static void run() throws IOException {
        int choice = select();
        if (choice == 1){
            WebServices ws = new WebServices();
            ws.release(true);
            ws.run(length(ws.allQuestions()));
        }
        else if (choice == 2){
            WebDev wd = new WebDev();
            wd.release(true);
            wd.run(length(wd.allQuestions()));
        }
        else if (choice == 3){
            DSA dsa = new DSA();
            dsa.release(true);
            dsa.run(length(dsa.allQuestions()));
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
