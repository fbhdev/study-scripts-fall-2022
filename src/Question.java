public class Question {

    private String question;
    private String answer;
    private Input input;
    private Grade grade = new Grade();
    private int number;

    public Question(String question, String answer, int number) {
        this.question = question;
        this.answer = answer;
        this.number = number;
    }

    public boolean isCorrect(String input){
        return input.equalsIgnoreCase(getAnswer());
    }

    public void askUser(){
        input = new Input(getQuestion());
        if(isCorrect(input.getInput())){
            grade.message(true);
            grade.setGrade(grade.getGrade() + 1);
        } else {
            grade.message(false);
        }
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Question " + getNumber();
    }
}
