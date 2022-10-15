public class Grade {

    private int grade = 0;
    private int total = 0;

    public void grade(){
        if(!isValid(getGrade())){
            throw new IllegalArgumentException("Invalid grade");
        }
        System.out.print("Scored " + getGrade() + "/" + getTotal());
        System.out.println("\t|\tYour grade is: " + arithmetics(getGrade()) + "%");
        System.out.println();
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getTotal() {
        return total;
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

    public String arithmetics(int grade){
        Double percentage = (double) grade / total * 100;
        return String.format("%.2f", percentage);
    }
}
