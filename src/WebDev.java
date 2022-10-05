import java.util.ArrayList;

public class WebDev {

    public WebDev() {
    }

    private static ArrayList<Module> modules = new ArrayList<>();

    static class ModuleOne{

        private Module module;
        private Question question;
        private ArrayList<Question> questions = new ArrayList<>();

        public ModuleOne(){
            module = new Module("Web Development", 1);
            modules.add(module);
        }

        @Override
        public String toString() {
            return module.getCourse() + ", Module " + module.getModule();
        }

        public void release(){
            questionOne();
            questionTwo();
            questionThree();
            questionFour();
        }

        public void questionOne(){
            question = new Question("Who makes sure that every bit of text on a site, from long explanatory text down to the labels on buttons, supports the brand identity and marketing goals of the organization?", "Content Strategist", 1);
            questions.add(question);
        }

        public void questionTwo(){
            question = new Question("Who organizes the content logically and for ease of findability?", "Information Architect", 2);
            questions.add(question);
        }

        public void questionThree(){
            question = new Question("What is based on a solid understanding of users and their needs based on observations and interviews?", "UX Design", 3);
            questions.add(question);
        }

        public void questionFour(){
            question = new Question("What shows the structure of a web page using only out- lines for each content type and widget?", "Wireframe", 4);
            questions.add(question);
        }

        public void questionFive(){
            question = new Question("What shows the structure of a web page using only out- lines for each content type and widget?", "Wireframe", 4);
            questions.add(question);
        }

    }

    public static void main(String[] args) {
        ModuleOne moduleOne = new ModuleOne();
        System.out.println(moduleOne);
        moduleOne.release();
        for(Question question : moduleOne.questions){
            System.out.println(question);
            question.askUser();
            System.out.println();
        }
    }
}
