public class Grade {

    private static int grade = 0;
    private static int questions = 0;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        Grade.grade = grade;
    }

    public void incrementGrade(int marks){
        if(!isValid(getGrade())){
            throw new IllegalArgumentException("Invalid grade");
        }
        if (marks == 1){
            setGrade(getGrade() + 1);
            return;
        }
        setGrade(getGrade() + marks);
    }

    public boolean isValid(int grade){
        return grade >= 0 && grade <= 100;
    }

    public void message(boolean isCorrect){
        questions++;
        if(isCorrect){
            System.out.println("Correct answer");
            return;
        }
        System.out.println("Incorrect answer");
    }

    public Double arithmetics(int grade){
        return (double) grade * 100 / questions;
    }
}
