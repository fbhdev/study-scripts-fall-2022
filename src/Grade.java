public class Grade {

    private static int grade = 0;
    private static int total = 0;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        Grade.grade = grade;
    }

    public int getTotal() {
        return total;
    }

    public void incrementGrade(int marks){
        if(!isValid(getGrade())){
            throw new IllegalArgumentException("Invalid grade");
        }
        setGrade(getGrade() + marks);
    }

    public boolean isValid(int grade){
        return grade >= 0 && grade <= 100;
    }

    public void message(boolean isCorrect){
        total++;
        if(isCorrect){
            System.out.println("Correct answer");
            return;
        }
        System.out.println("Incorrect answer");
    }

    public String arithmetics(int grade){
        Double percentage = (double) grade / total * 100;
        return String.format("%.2f", percentage);
    }
}
