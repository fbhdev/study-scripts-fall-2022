import java.util.Collections;

public class DSA extends Course{

    private static final Course course = new Course();
    private static ModuleOne moduleOne;

    public DSA(){
        ModuleOne moduleOne = new ModuleOne();
        course.setCourse("Data Structures and Algorithms");
    }

    static class ModuleOne extends Module {

        private final Module module;

        public ModuleOne() {
            module = new Module();
            module.setModule(1);
            course.allModules().add(module);
        }

        public void questions() {
            new Question("", "", 1, module.getModule(), course.getCourse());
        }
    }

    public void release(boolean shuffle){
        moduleOne.questions();
        if (shuffle) Collections.shuffle(course.allQuestions());
    }

    public void run(int length) {
        if (length == 0) return;
        System.out.println("Welcome to the " + course.getCourse() + " quiz!");
        System.out.println("You will be asked " + length + " questions.");
        for (Question question : course.allQuestions()) {
            if (length == 0) break;
            System.out.println();
            if (length == 1) {
                System.out.println(length + " question left");
            } else {
                System.out.println(length + " questions left");
            }
            System.out.println(question);
            question.askUser();
            System.out.println();
            length--;
        }
        new Grade().grade();
    }
}
