import java.util.Collections;

public class WebDev extends Course {
    
    private static ModuleOne moduleOne;
    private static ModuleTwo moduleTwo;
    private static ModuleThree moduleThree;
//    private static ModuleFour moduleFour;
    private static final Course course = new Course();

    public WebDev() {
        moduleOne = new ModuleOne();
        moduleTwo = new ModuleTwo();
        moduleThree = new ModuleThree();
//        moduleFour = new ModuleFour();
        course.setCourse("Web Development");
    }

    static class ModuleOne{

        private final Module module;

        public ModuleOne(){
            module = new Module();
            module.setModule(1);
            course.allModules().add(module);
        }
        public void questions(){
            new Question("Who makes sure that every bit of text on a site, from long explanatory text down to the labels on buttons, supports the brand identity and marketing goals of the organization?", "Content Strategist", 1, module.getModule(), course.getCourse());
            new Question("Who organizes the content logically and for ease of findability?", "Information Architect", 2, module.getModule(), course.getCourse());
            new Question("What is based on a solid understanding of users and their needs based on observations and interviews?", "UX Design", 3, module.getModule(), course.getCourse());
            new Question("What shows the structure of a web page using only outlines for each content type and widget?", "Wireframe", 4, module.getModule(), course.getCourse());
            new Question("Who is the organization that oversees the development of web technologies such as HTML, CSS, and JavaScript?", "W3C", 5, module.getModule(), course.getCourse());
            new Question("Which protocol works in tandem with another protocol, SSL (for Secure Socket Layer), which needs to be enabled on the server for secure transactions to work?", "HTTPS", 6, module.getModule(), course.getCourse());
            new Question("What do you call applications running on the user’s machine?", "Client-side", 7, module.getModule(), course.getCourse());
            new Question("What do you call applications and functions using the processing power of the server computer?", "Server-side", 8, module.getModule(), course.getCourse());
            new Question("What do you call the sites where content and data is accessed from a database, and the final pages may be customized for each user?", "Dynamic Sites", 9, module.getModule(), course.getCourse());
            new Question("What is the flip side of an approach to browser diversity called graceful degradation, in which you design the fully enhanced experience first, then create a series of fallbacks for non-supporting browsers?", "Progressive Enhancement", 10, module.getModule(), course.getCourse());
            new Question("What is a strategy for providing appropriate layouts to devices based on the size of the viewport (browser window)?", "Responsive Web Design", 11, module.getModule(), course.getCourse());
            new Question("Web designers must build pages in a manner that creates as few barriers as possible to getting to information, regardless of the user’s ability and the device used to access the web. In other words, what must you design it for?", "Accessibility", 12, module.getModule(), course.getCourse());
        }
    }

    static class ModuleTwo {

        private final Module module;

        public ModuleTwo() {
            module = new Module();
            module.setModule(2);
            course.allModules().add(module);
        }

        public void questions(){
            new Question("What refers to marking up documents in ways that provide information about the content itself rather than information about the visual styling of the content?", "Semantic Markup", 1, module.getModule(), course.getCourse());
            new Question("Which display value always starts on a new line, and the browsers automatically add some space (a margin) before and after the element?", "Block", 2, module.getModule(), course.getCourse());
            new Question("Which display value only takes up as much width as necessary?", "Inline", 3, module.getModule(), course.getCourse());
            new Question("What are instructions that clarify or modify an element?", "Attributes", 4, module.getModule(), course.getCourse());
            new Question("Which tag would you use when you have a long quotation, a testimonial, or a section of copy from another source?", "Blockquote", 5, module.getModule(), course.getCourse());
            new Question("In some types of information, such as code examples or certain poems, the whitespace is important for conveying meaning. Which tag would you use to preserve whitespace?", "pre", 6, module.getModule(), course.getCourse());
            new Question("Which tag is used for introductory material that typically appears at the beginning of a web page or at the top of a section or article?", "header", 7, module.getModule(), course.getCourse());
            new Question("Which element is used to indicate the type of information that typically comes at the end of a page or an article, such as its author, copyright information, related documents, or navigation?", "footer", 8, module.getModule(), course.getCourse());
            new Question("For example, books are divided into chapters, and newspapers have sections for local news, sports, comics, and so on. Which element typically include a heading (inside the parent element) plus content that has a meaningful reason to be grouped together?", "section", 9, module.getModule(), course.getCourse());
            new Question("Which element is useful for magazine or newspaper articles, blog posts, comments, or other items that could be extracted for external use?", "article", 10, module.getModule(), course.getCourse());
            new Question("Which element identifies content that is separate from, but tangentially related to, the surrounding content? In print, its equivalent is a sidebar.", "aside", 11, module.getModule(), course.getCourse());
            new Question("What is used to assign a unique identifier to an element in the document?", "id", 12, module.getModule(), course.getCourse());
            new Question("What symbol denotes document fragments?", "#", 13, module.getModule(), course.getCourse());
        }
    }

    static class ModuleThree {

        private final Module module;

        public ModuleThree() {
            module = new Module();
            module.setModule(3);
            course.allModules().add(module);
        }

        public void questions(){
            new Question("What images (format) contain paths that are defined mathematically?", "svg", 1, module.getModule(), course.getCourse());
            new Question("What attribute should serve as a substitute for the image content—conveying the same information and function?", "alt", 2, module.getModule(), course.getCourse());
            new Question("What is the stretching of a cell to cover several rows or columns?", "cell spanning", 3, module.getModule(), course.getCourse());
            new Question("Which element is a container for all the content of the form, including some number of form controls, such as text-entry fields and buttons?", "Form", 4, module.getModule(), course.getCourse());
            new Question("Which attribute provides the location (URL) of the application or script that will be used to process the form?", "Action", 5, module.getModule(), course.getCourse());
            new Question("Which attribute specifies how the information should be sent to the server?", "Method", 6, module.getModule(), course.getCourse());
            new Question("True or False | All form controls (except submit and reset buttons) must include a name attribute.", "true", 7, module.getModule(), course.getCourse());
        }
    }


/*    static class ModuleFour {

        private final Module module;

        public ModuleFour() {
            module = new Module();
            module.setModule(4);
            course.allModules().add(module);
        }

        public void questions(){
            new Question("What is a set of rules that govern how a web page should be displayed?", "CSS", 1, module.getModule(), course.getCourse());
        }
    }*/

    public void release(boolean shuffle){
        moduleOne.questions();
        moduleTwo.questions();
        moduleThree.questions();
//        moduleFour.questions();
        if (shuffle) Collections.shuffle(course.allQuestions());
    }

    public void run(int length) {
        if (length == 0) return;
        Records.setNumQuestions(length);
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
        course.allQuestions().clear();
        Records.save("Web Dev");
    }
}
