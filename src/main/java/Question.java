public class Question extends Course {

    private final int module;
    private final String question;
    private final String course;
    private final String answer;
    private final int number;
    private Grade grade = new Grade();
    private Records records = new Records();

    public Question(String question, String answer, int number, int module, String course) {
        this.question = question;
        this.answer = answer;
        this.number = number;
        this.module = module;
        this.course = course;
        allQuestions().add(this);
    }

    public boolean isCorrect(String input){
        return input.equalsIgnoreCase(getAnswer());
    }

    public void askUser(){
        Input input = new Input(getQuestion());
        records.addName(this.toString());
        if(isCorrect(input.getInput())){
            grade.success();
        }
        else if(grade.leniency(getAnswer(), input)){
            grade.success();
        }
        else if(grade.manualCorrection()){
            grade.success();
        }
        else{
            grade.failure(getAnswer());
        }
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Module " + module + " | Question " + getNumber();
    }
}
