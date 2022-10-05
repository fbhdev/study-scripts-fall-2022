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
            questionFive();
            questionSix();
            questionSeven();
            questionEight();
            questionNine();
            questionTen();
            questionEleven();
            questionTwelve();
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
            question = new Question("What shows the structure of a web page using only outlines for each content type and widget?", "Wireframe", 4);
            questions.add(question);
        }

        public void questionFive(){
            question = new Question("Who is the organization that oversees the development of web technologies such as HTML, CSS, and JavaScript?", "W3C", 5);
            questions.add(question);
        }

        public void questionSix(){
            question = new Question("Which protocol works in tandem with another protocol, SSL (for Secure Socket Layer), which needs to be enabled on the server for secure transactions to work?", "HTTPS", 6);
            questions.add(question);
        }

        public void questionSeven(){
            question = new Question("What do you call applications run on the user’s machine?", "Client-side", 7);
            questions.add(question);
        }

        public void questionEight(){
            question = new Question("What do you call applications and functions using the processing power of the server computer?", "Server-side", 8);
            questions.add(question);
        }

        public void questionNine(){
            question = new Question("What do you call the sites where content and data is accessed from a database, and the final pages may be customized for each user?", "Dynamic Sites", 9);
            questions.add(question);
        }

        public void questionTen(){
            question = new Question("What is the flip side of an approach to browser diversity called graceful degradation, in which you design the fully enhanced experience first, then create a series of fallbacks for non-supporting browsers?", "Progressive Enhancement", 10);
            questions.add(question);
        }

        public void questionEleven(){
            question = new Question("What is a strategy for providing appropriate layouts to devices based on the size of the viewport (browser window)?", "Responsive Web Design", 11);
            questions.add(question);
        }

        public void questionTwelve(){
            question = new Question("Web designers must build pages in a manner that creates as few barriers as possible to getting to information, regardless of the user’s ability and the device used to access the web. In other words, what must you design it for?", "Accessibility", 12);
            questions.add(question);
        }
    }

    public static void main(String[] args) {
        ModuleOne moduleOne = new ModuleOne();
        Grade grade = new Grade();
        System.out.println(moduleOne);
        moduleOne.release();
        for(Question question : moduleOne.questions){
            System.out.println(question);
            question.askUser();
            System.out.println();
        }
        System.out.println("Your grade is: " + grade.arithmetics(grade.getGrade()) + "%");
    }
}
