/**
 * @author Francois Boulay-Handfield
 */
public class Question extends Course {

    private final int module;
    private final String question;
    private final String course;
    private final String answer;
    private final int number;
    private Grade grade = new Grade();
    private Records records = new Records();

    /**
     * Question() constructor instantiates the Question object
     * @param question the question to ask user
     * @param answer the expected answer
     * @param number the question's number
     * @param module the module the question belongs to
     * @param course the course the question belongs to
     */
    public Question(String question, String answer, int number, int module, String course) {
        this.question = question;
        this.answer = answer;
        this.number = number;
        this.module = module;
        this.course = course;
        allQuestions().add(this);
    }

    /**
     * @param input the expected answer
     * @return true or false if it matches the expected answer
     */
    public boolean isCorrect(String input){
        return input.equalsIgnoreCase(getAnswer());
    }

    /**
     * askUser() handles quizzing flow
     */
    public void askUser(){
        Input input = new Input(getQuestion());
        records.addName(this.toString());
        if(isCorrect(input.getInput())){
            grade.success();
        }
        else if(grade.leniency(getAnswer(), input)){
            grade.success();
        }
        else if(grade.manualCorrection(getAnswer())){
            grade.success();
        }
        else{
            grade.failure(getAnswer(), false);
        }
        System.out.println();
    }

    /**
     * @return the question asked the user
     */
    public String getQuestion() {
        return question;
    }

    /**
     * @return the expected answer
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * @return the question's number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @return a formatted string
     */
    @Override
    public String toString() {
        return "Module " + module + " | Question " + getNumber();
    }
}
