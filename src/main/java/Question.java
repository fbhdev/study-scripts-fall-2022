/**
 * <h1>Question</h1>
 * @author Francois Boulay-Handfield
 */
public class Question extends Course {

    private final int module;
    private final String question;
    private final String course;
    private final String answer;
    private Grade grade = new Grade();
    private Records records = new Records();

    /**
     * Question() constructor instantiates the Question object
     * @param question the question to ask user
     * @param answer the expected answer
     * @param module the module the question belongs to
     * @param course the course the question belongs to
     */
    public Question(String question, String answer, int module, String course) {
        this.question = question;
        this.answer = answer;
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
     * <h1>askUser</h1>
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
     * <h1>getQuestion</h1>
     * @return the question asked the user
     */
    public String getQuestion() {
        return question;
    }

    /**
     * <h1>getAnswer</h1>
     * @return the expected answer
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * <h1>getModule</h1>
     * @return the module the question belongs to
     */
    public int getModule(){
        return module;
    }

    /**
     * <h1>toString</h1>
     * @return a formatted string
     */
    @Override
    public String toString() {
        return getModule() + " → " + getQuestion();
    }
}
