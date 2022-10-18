public class Question extends Course {

    private final int module;
    private final String question;
    private final String course;
    private final String answer;
    private boolean isCorrect;
    private final int number;

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
        Grade grade = new Grade();
        Records.addName(this.toString());
        if(isCorrect(input.getInput())){
            grade.message(true);
            Records.addSuccess(true);
            grade.setGrade(grade.getGrade() + 1);

        }
        else if(grade.leniency(getAnswer(), input)){
            grade.message(true);
            Records.addSuccess(true);
            grade.setGrade(grade.getGrade() + 1);
        }
        else{
            grade.message(false);
            Records.addSuccess(false);
            System.out.println("Correct answer is: " + getAnswer());
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