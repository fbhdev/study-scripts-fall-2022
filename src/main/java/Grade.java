public class Grade {

    private static int grade = 0;
    private static int total = 0;
    private Records records = new Records();

    public void grade(){
        if(!isValid(getGrade())){
            throw new IllegalArgumentException("Invalid grade");
        }
        setGrade(getGrade());
        System.out.print("Scored " + getGrade() + "/" + getTotal());
        System.out.println("\t|\tYour grade is: " + arithmetics(getGrade()) + "%");
        System.out.println();
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        Grade.grade = grade;
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
        System.out.print("Incorrect answer");
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

    public boolean manualCorrection(String answer){
        System.out.println("The correct answer is: " + answer);
        Input input = new Input("Is manual correction justified in this case? (y/n)");
        return input.getInput().equals("y");
    }

    public void success(){
        message(true);
        records.addSuccess(true);
        setGrade(getGrade() + 1);
    }

    public void failure(String answer, boolean message){
        message(false);
        records.addSuccess(false);
        if(message){
            System.out.println(" -> Correct answer is: " + answer);
        }
    }

    public String arithmetics(int grade){
        Double percentage = (double) grade / total * 100;
        return String.format("%.2f", percentage);
    }
}
