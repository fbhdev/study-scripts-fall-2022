
public class Main {

    public static void main(String[] args) {
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
        Input input = new Input("Select a module");
        System.out.println();
        for(int count = 1; count <= 5; count++){
            if(input.getInput().equals(String.valueOf(count))){
                return count;
            }
        }
        return 0;
    }

    public static boolean again(){
        Input input = new Input("Would you like to study more? (y/n)");
        return input.getInput().equalsIgnoreCase("y");
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
