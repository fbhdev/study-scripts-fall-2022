import java.util.ArrayList;

public class WebDev{
    
    private static ModuleOne moduleOne;
    private static ModuleTwo moduleTwo;
    private static ArrayList<Module> modules = new ArrayList<>();

    public WebDev() {
        moduleOne = new ModuleOne();
        moduleTwo = new ModuleTwo();
        release();
    }

    static class ModuleOne{

        private Module module;
        private Question question;

        public ModuleOne(){
            module = new Module("Web Development", 1);
            modules.add(module);
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
            module.getQuestions().add(question);
        }

        public void questionTwo(){
            question = new Question("Who organizes the content logically and for ease of findability?", "Information Architect", 2);
            module.getQuestions().add(question);
        }

        public void questionThree(){
            question = new Question("What is based on a solid understanding of users and their needs based on observations and interviews?", "UX Design", 3);
            module.getQuestions().add(question);
        }

        public void questionFour(){
            question = new Question("What shows the structure of a web page using only outlines for each content type and widget?", "Wireframe", 4);
            module.getQuestions().add(question);
        }

        public void questionFive(){
            question = new Question("Who is the organization that oversees the development of web technologies such as HTML, CSS, and JavaScript?", "W3C", 5);
            module.getQuestions().add(question);
        }

        public void questionSix(){
            question = new Question("Which protocol works in tandem with another protocol, SSL (for Secure Socket Layer), which needs to be enabled on the server for secure transactions to work?", "HTTPS", 6);
            module.getQuestions().add(question);
        }

        public void questionSeven(){
            question = new Question("What do you call applications running on the user’s machine?", "Client-side", 7);
            module.getQuestions().add(question);
        }

        public void questionEight(){
            question = new Question("What do you call applications and functions using the processing power of the server computer?", "Server-side", 8);
            module.getQuestions().add(question);
        }

        public void questionNine(){
            question = new Question("What do you call the sites where content and data is accessed from a database, and the final pages may be customized for each user?", "Dynamic Sites", 9);
            module.getQuestions().add(question);
        }

        public void questionTen(){
            question = new Question("What is the flip side of an approach to browser diversity called graceful degradation, in which you design the fully enhanced experience first, then create a series of fallbacks for non-supporting browsers?", "Progressive Enhancement", 10);
            module.getQuestions().add(question);
        }

        public void questionEleven(){
            question = new Question("What is a strategy for providing appropriate layouts to devices based on the size of the viewport (browser window)?", "Responsive Web Design", 11);
            module.getQuestions().add(question);
        }

        public void questionTwelve(){
            question = new Question("Web designers must build pages in a manner that creates as few barriers as possible to getting to information, regardless of the user’s ability and the device used to access the web. In other words, what must you design it for?", "Accessibility", 12);
            module.getQuestions().add(question);
        }
    }

    static class ModuleTwo {

        private Module module;
        private Question question;

        public ModuleTwo() {
            module = new Module("Web Development", 2);
            modules.add(module);
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
            questionThirteen();
        }

        public void questionOne(){
            question = new Question("What refers to marking up documents in ways that provide information about the content itself rather than information about the visual styling of the content?", "Semantic Markup", 1);
            module.getQuestions().add(question);
        }

        public void questionTwo(){
            question = new Question("Which display value always starts on a new line, and the browsers automatically add some space (a margin) before and after the element?", "Block", 2);
            module.getQuestions().add(question);
        }

        public void questionThree(){
            question = new Question("Which display value only takes up as much width as necessary?", "Inline", 3);
            module.getQuestions().add(question);
        }

        public void questionFour(){
            question = new Question("What are instructions that clarify or modify an element?", "Attributes", 4);
            module.getQuestions().add(question);
        }

        public void questionFive(){
            question = new Question("Which tag would you use when you have a long quotation, a testimonial, or a section of copy from another source?", "Blockquote", 5);
            module.getQuestions().add(question);
        }

        public void questionSix(){
            question = new Question("In some types of information, such as code examples or certain poems, the whitespace is important for conveying meaning. Which tag would you use to preserve whitespace?", "pre", 6);
            module.getQuestions().add(question);
        }

        public void questionSeven(){
            question = new Question("Which tag is used for introductory material that typically appears at the beginning of a web page or at the top of a section or article?", "header", 7);
            module.getQuestions().add(question);
        }

        public void questionEight(){
            question = new Question("Which element is used to indicate the type of information that typically comes at the end of a page or an article, such as its author, copyright information, related documents, or navigation?", "footer", 8);
            module.getQuestions().add(question);
        }

        public void questionNine(){
            question = new Question("For example, books are divided into chapters, and newspapers have sections for local news, sports, comics, and so on. Which element typically include a heading (inside the parent element) plus content that has a meaningful reason to be grouped together?", "section", 9);
            module.getQuestions().add(question);
        }

        public void questionTen(){
            question = new Question("Which element is useful for magazine or newspaper articles, blog posts, comments, or other items that could be extracted for external use?", "article", 10);
            module.getQuestions().add(question);
        }

        public void questionEleven(){
            question = new Question("Which element identifies content that is separate from, but tangentially related to, the surrounding content? In print, its equivalent is a sidebar.", "aside", 11);
            module.getQuestions().add(question);
        }

        public void questionTwelve(){
            question = new Question("What is used to assign a unique identifier to an element in the document?", "id", 12);
            module.getQuestions().add(question);
        }

        public void questionThirteen(){
            question = new Question("What symbol denotes document fragments?", "#", 13);
            module.getQuestions().add(question);
        }
    }

    public static void release(){
        moduleOne.release();
        moduleTwo.release();
    }

    public static void main(String[] args) {
        Grade grade = new Grade();
        new WebDev();
        for(Module module : modules){
            System.out.println(module);
            for(Question question : module.getQuestions()){
                System.out.println(question);
                question.askUser();
                System.out.println();
            }
        }
        System.out.println("Scored " + grade.getGrade() + "/" + grade.getTotal());
        System.out.println("Your grade is: " + grade.arithmetics(grade.getGrade()) + "%");
        System.out.println();
    }
}
