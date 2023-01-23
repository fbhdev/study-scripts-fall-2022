/**
 * @author Francois Boulay-Handfield
 */
public class Grade {

    private static int marks = 0;
    private static double grade = 0;
    private static int total = 0;
    private Records records = new Records();

    /**
     * Sets and returns the final grade after arithmetic operations
     * <h1>finalGrade</h1>
     * @return the final grade
     */
    public double finalGrade(){
        if(!isValid(getMarks())){
            throw new IllegalArgumentException("Invalid grade");
        }
        setGrade((double) getMarks() / getTotal() * 100);
        return getGrade();
    }

    /**
     * Formats and print the final grade
     * <h1>printFinalGrade</h1>
     */
    public void printFinalGrade(){
        double percentage = finalGrade();
        System.out.print("Scored " + getMarks() + "/" + getTotal());
        System.out.println("\t–\tYour grade is: " + String.format("%.2f", percentage) + "%");
        System.out.println();
    }

    /**
     * reset() resets the marks and total variables to 0
     */
    public void reset(){
        total = 0;
        marks = 0;
    }

    /**
     * getMarks() returns the number of correct answers
     * @return the marks
     */
    public int getMarks() {
        return marks;
    }

    /**
     * setMarks() is used to set the marks of the user
     * @param marks the grade to set
     */
    public void setMarks(int marks) {
        Grade.marks = marks;
    }

    /**
     * isValid() checks if the grade is valid
     * @return true or false if the grade is valid
     */
    public int getTotal() {
        return total;
    }

    /**
     * isValid() checks if the grade is valid
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * <h1>getGrade</h1>>
     * @return the grade
     */
    public double getGrade() {
        return grade;
    }

    /**
     * <h1>setGrade</h1>
     * @param grade the grade to set
     */
    public void setGrade(double grade) {
        this.grade = grade;
    }

    /**
     * isValid() checks if the grade is valid
     * @param grade the grade to set
     * @return true if the grade is between 0 and 100
     */
    public boolean isValid(int grade){
        return grade >= 0 && grade <= 100;
    }

    /**
     * message() to be displayed upon the user's answer
     * @param isCorrect true if the user answered correctly, false otherwise
     */
    public void message(boolean isCorrect){
        total++;
        if(isCorrect){
            System.out.println("Correct answer");
            return;
        }
        System.out.print("Incorrect answer");
        System.out.println();
    }

    /**
     * leniency() checks if the user's input is close to the correct answer
     * @param answer The correct answer
     * @param input The user's input
     * @return true if the user's input is >= 80% similar to the correct answer, false otherwise
     */
    public boolean leniency(String answer, Input input){
        int total = 0;
        for(int count = 0; count < input.getInput().length(); count++){
            try {
                char a = input.getInput().charAt(count);
                char b = answer.charAt(count);
                a = Character.toLowerCase(a);
                b = Character.toLowerCase(b);
                if (a == b || a + 1 == b || a - 1 == b) {
                    total++;
                }
            }
            catch (StringIndexOutOfBoundsException ignored){
            }
        }
        total = total * 100 / input.getInput().length();
        return total >= 80;
    }

    /**
     * manualCorrection() handles the case when possible manual correction is needed for fair grading
     * @param answer The correct answer
     * @return true if in need of manual correction, false otherwise
     */
    public boolean manualCorrection(String answer){
        System.out.println("The correct answer is: " + answer);
        while(true){
            Input input = new Input("Is manual correction justified? (y/n)");
            if(input.getInput().equals("y")) {
                return true;
            }
            else if(input.getInput().equals("n")) {
                return false;
            }
            else {
                System.out.println("Invalid Input");
            }
            System.out.println();
        }
    }

    /**
     * success() method handles the case when the user answers correctly
     */
    public void success(){
        message(true);
        records.addSuccess(true);
        setMarks(getMarks() + 1);
    }

    /**
     * failure() method handles the case when the user answers incorrectly
     * @param answer The correct answer
     * @param message Display correction message or not
     */
    public void failure(String answer, boolean message){
        message(false);
        records.addSuccess(false);
        if(message) System.out.println(" -> Correct answer is: " + answer);
    }
}

