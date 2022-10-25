import java.util.Scanner;

/**
 * @author Francois Boulay-Handfield
 */
public class Input {

    private String input;

    /**
     * Input() constructor instantiates an Input object
     * @param question asked the user
     */
    public Input(String question){
        System.out.print(question + " ⟶ ");
        input();
    }

    /**
     * @return a Scanner object
     */
    public Scanner scanner(){
        return new Scanner(System.in);
    }

    /**
     * input() checks if input is String or Integer
     * Failsafe mechanism checks for empty or whitespace
     */
    public void input(){
        try {
            while (true) {
                input = scanner().nextLine();
                if (input.equals(" ") || input.isEmpty()) {
                    System.out.print("Please enter a valid input ⟶ ");
                    continue;
                }
                break;
            }
        }
        catch (Exception e){
            while (true) {
                input = String.valueOf(scanner().nextInt());
                if (input.equals(" ") || input.isEmpty()) {
                    System.out.print("Please enter a valid input ⟶ ");
                    continue;
                }
                break;
            }
        }
    }

    /**
     * @return the input
     */
    public String getInput() {
        return input;
    }
}
