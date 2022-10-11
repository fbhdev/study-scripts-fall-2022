import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        run();
    }

    public static int select(){
        System.out.println("Select a module");
        System.out.println("1. Web Services");
        System.out.println("2. Web Development");
        System.out.println("3. Data Structures and Algorithms");
        System.out.println("4. Programming Techniques 2");
        System.out.println("5. Exit");
        System.out.println();
        System.out.print("Enter your choice -> ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        for(int count = 1; count <= 5; count++){
            if(choice == count){
                System.out.println();
                System.out.println("You have selected " + choice);
                return choice;
            }
        }
        return 0;
    }

    public static void run(){
        int choice = select();
        if (choice == 1){
            WebServices ws = new WebServices();
            ws.run();
        }
        else if (choice == 2){
            WebDev wd = new WebDev();
            wd.run();
        }
        else{
            return;
        }
    }
}
