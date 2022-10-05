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
            setInput(scanner().nextLine());
        }
        // adapts it to int
        catch (Exception e){
            setInput(String.valueOf(scanner().nextInt()));
        }
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
