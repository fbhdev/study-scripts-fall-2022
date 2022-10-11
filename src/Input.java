import java.util.Scanner;

public class Input {

    private String input;

    public Input(String question){
        System.out.print(question + " -> ");
        stringInput();
    }

    public Scanner scanner(){
        return new Scanner(System.in);
    }

    public void stringInput(){
        try {
            while (true) {
                input = scanner().nextLine();
                if (input.equals(" ") || input.isEmpty()) {
                    System.out.print("Please enter a valid input -> ");
                    continue;
                }
                break;
            }
        }
        catch (Exception e){
            while (true) {
                input = String.valueOf(scanner().nextInt());
                if (input.equals(" ") || input.isEmpty()) {
                    System.out.print("Please enter a valid input -> ");
                    continue;
                }
                break;
            }
        }
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
