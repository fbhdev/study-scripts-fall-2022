public class Grade {

    private static int grade;

    public Grade(){
        setGrade(0);
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
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
        if(isCorrect){
            System.out.println("Correct answer");
            return;
        }
        System.out.println("Incorrect answer");
    }

    public Double arithmetics(int grade){
        return (double) grade / 100;
    }
}
