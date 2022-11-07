import java.util.Collections;

public class WebDev extends Course {
    
    private final ModuleOne moduleOne;
    private final ModuleTwo moduleTwo;
    private final ModuleThree moduleThree;
    private final ModuleFour moduleFour;
    private final ModuleFive moduleFive;
    private final ModuleSix moduleSix;
    private final ModuleSeven moduleSeven;
    private final ModuleEight moduleEight;
    private final ModuleNine moduleNine;
    private final ModuleTen moduleTen;
    private final ModuleEleven moduleEleven;
    private final ModuleTwelve moduleTwelve;
    private final ModuleThirteen moduleThirteen;

    public WebDev() {
        moduleOne = new ModuleOne();
        moduleTwo = new ModuleTwo();
        moduleThree = new ModuleThree();
        moduleFour = new ModuleFour();
        moduleFive = new ModuleFive();
        moduleSix = new ModuleSix();
        moduleSeven = new ModuleSeven();
        moduleEight = new ModuleEight();
        moduleNine = new ModuleNine();
        moduleTen = new ModuleTen();
        moduleEleven = new ModuleEleven();
        moduleTwelve = new ModuleTwelve();
        moduleThirteen = new ModuleThirteen();
        setCourse("Web Development");
    }

    // Module 1: Course Description & Introduction to Web Development
    private static class ModuleOne{

        private final Module module;
        private int count = 0;

        public ModuleOne(){
            module = new Module();
            module.setModule(1);
            allModules().add(module);
        }
        public void questions(){
            new Question("Who makes sure that every bit of text on a site, from long explanatory text down to the labels on buttons, supports the brand identity and marketing goals of the organization?", "Content Strategist", ++count, module.getModule(), getCourse());
            new Question("Who organizes the content logically and for ease of findability?", "Information Architect", ++count, module.getModule(), getCourse());
            new Question("What shows the structure of a web page using only outlines for each content type and widget?", "Wireframe", ++count, module.getModule(), getCourse());
            new Question("What involves the design of the entire process of acquiring and integrating the product, including aspects of branding, design, usability and function?", "UX Design", ++count, module.getModule(), getCourse());
            new Question("Who is the organization that oversees the development of web technologies such as HTML, CSS, and JavaScript?", "W3C", ++count, module.getModule(), getCourse());
            new Question("Which protocol works in tandem with another protocol, SSL (for Secure Socket Layer), which needs to be enabled on the server for secure transactions to work?", "HTTPS", ++count, module.getModule(), getCourse());
            new Question("What do you call applications running on the user’s machine?", "Client-side", ++count, module.getModule(), getCourse());
            new Question("What do you call applications and functions using the processing power of the server computer?", "Server-side", ++count, module.getModule(), getCourse());
            new Question("What do you call the sites where content and data is accessed from a database, and the final pages may be customized for each user?", "Dynamic Sites", ++count, module.getModule(), getCourse());
            new Question("What is the flip side of an approach to browser diversity called graceful degradation, in which you design the fully enhanced experience first, then create a series of fallbacks for non-supporting browsers?", "Progressive Enhancement", ++count, module.getModule(), getCourse());
            new Question("What is a strategy for providing appropriate layouts to devices based on the size of the viewport (browser window)?", "Responsive Web Design", ++count, module.getModule(), getCourse());
            new Question("Web designers must build pages in a manner that creates as few barriers as possible to getting to information, regardless of the user’s ability and the device used to access the web. In other words, what must you design it for?", "Accessibility", ++count, module.getModule(), getCourse());
        }
    }

    // Module 2: HTML - Introduction to Hyper-Text Markup Language Introduction to Web Standards, Basic html design
    private static class ModuleTwo {

        private final Module module;
        private int count = 0;

        public ModuleTwo() {
            module = new Module();
            module.setModule(2);
            allModules().add(module);
        }

        public void questions(){
            new Question("What refers to marking up documents in ways that provide information about the content itself rather than information about the visual styling of the content?", "Semantic Markup", ++count, module.getModule(), getCourse());
            new Question("Which display value always starts on a new line, and the browsers automatically add some space (a margin) before and after the element?", "Block", ++count, module.getModule(), getCourse());
            new Question("Which display value only takes up as much width as necessary?", "Inline", ++count, module.getModule(), getCourse());
            new Question("What are instructions that clarify or modify an element?", "Attributes", ++count, module.getModule(), getCourse());
            new Question("Which tag would you use when you have a long quotation, a testimonial, or a section of copy from another source?", "Blockquote", ++count, module.getModule(), getCourse());
            new Question("In some types of information, such as code examples or certain poems, the whitespace is important for conveying meaning. Which tag would you use to preserve whitespace?", "pre", ++count, module.getModule(), getCourse());
            new Question("Which tag is used for introductory material that typically appears at the beginning of a web page or at the top of a section or article?", "header", ++count, module.getModule(), getCourse());
            new Question("Which element is used to indicate the type of information that typically comes at the end of a page or an article, such as its author, copyright information, related documents, or navigation?", "footer", ++count, module.getModule(), getCourse());
            new Question("For example, books are divided into chapters, and newspapers have sections for local news, sports, comics, and so on. Which element typically include a heading (inside the parent element) plus content that has a meaningful reason to be grouped together?", "section", ++count, module.getModule(), getCourse());
            new Question("Which element is useful for magazine or newspaper articles, blog posts, comments, or other items that could be extracted for external use?", "article", ++count, module.getModule(), getCourse());
            new Question("Which element identifies content that is separate from, but tangentially related to, the surrounding content? In print, its equivalent is a sidebar.", "aside", ++count, module.getModule(), getCourse());
            new Question("What is used to assign a unique identifier to an element in the document?", "id", ++count, module.getModule(), getCourse());
            new Question("What symbol denotes document fragments?", "#", ++count, module.getModule(), getCourse());
        }
    }

    // Module 3: Introduction to Cascading Style Sheets CSS rules, style declarations
    private static class ModuleThree {

        private final Module module;
        private int count = 0;

        public ModuleThree() {
            module = new Module();
            module.setModule(3);
            allModules().add(module);
        }

        public void questions(){
            new Question("What describes how an element or group of elements should be displayed in CSS?", "Style Rules", ++count, module.getModule(), getCourse());
            new Question("What identifies the element or elements to be affected in CSS?", "Selector", ++count, module.getModule(), getCourse());
            new Question("What provides the rendering instructions in CSS?", "Declaration", ++count, module.getModule(), getCourse());
            new Question("What is the type of style sheets advocating for separate, text-only document that contains the style rules?", "External", ++count, module.getModule(), getCourse());
            new Question("What is the type of style sheets that is placed in a document via the style element, and its rules apply only to that document?", "Embedded", ++count, module.getModule(), getCourse());
            new Question("What do you call all elements contained within a given element?", "Descendants", ++count, module.getModule(), getCourse());
            new Question("What happens when several sources of style information vie for control of the elements on a page?", "Cascade", ++count, module.getModule(), getCourse());
//            new Question("", "", ++count, module.getModule(), getCourse());
//            new Question("", "", ++count, module.getModule(), getCourse());
//            new Question("", "", ++count, module.getModule(), getCourse());
//            new Question("", "", ++count, module.getModule(), getCourse());
//            new Question("", "", ++count, module.getModule(), getCourse());
//            new Question("", "", ++count, module.getModule(), getCourse());
//            new Question("", "", ++count, module.getModule(), getCourse());
//            new Question("", "", ++count, module.getModule(), getCourse());
//            new Question("", "", ++count, module.getModule(), getCourse());
//            new Question("", "", ++count, module.getModule(), getCourse());
//            new Question("", "", ++count, module.getModule(), getCourse());
//            new Question("", "", ++count, module.getModule(), getCourse());
//            new Question("", "", ++count, module.getModule(), getCourse());
//            new Question("", "", ++count, module.getModule(), getCourse());
//            new Question("", "", ++count, module.getModule(), getCourse());
//            new Question("", "", ++count, module.getModule(), getCourse());
//            new Question("", "", ++count, module.getModule(), getCourse());
        }
    }

    // Module 4: Structuring the UI by Using Semantic Markup Elements Structure web page content using HTML semantic elements
    private static class ModuleFour {

        private final Module module;
        private int count = 0;

        public ModuleFour() {
            module = new Module();
            module.setModule(4);
            allModules().add(module);
        }

        public void questions(){
            new Question("What is a set of rules that govern how a web page should be displayed?", "CSS", ++count, module.getModule(), getCourse());
        }
    }

    // Module 5: Styling HTML5 Layout Elements with CSS Understand the normal flow of elements, fixed and flexible page layout
    private static class ModuleFive {

        private final Module module;
        private int count = 0;

        public ModuleFive(){
            module = new Module();
            module.setModule(5);
            allModules().add(module);
        }

        public void questions(){
            // TODO
        }
    }
    // Module 6: Working with CSS Pseudo-Classes and Pseudo-Elements learn about the pseudo-class and pseudo- element selectors.
    private static class ModuleSix {

        private final Module module;
        private int count = 0;

        public ModuleSix(){
            module = new Module();
            module.setModule(5);
            allModules().add(module);
        }

        public void questions(){
            // TODO
        }
    }

    // Module 7: Collecting Information from Visitors to Your Site Using Forms Learn about the variety of form controls that are available for collection information.
    private static class ModuleSeven {

        private final Module module;
        private int count = 0;

        public ModuleSeven(){
            module = new Module();
            module.setModule(7);
            allModules().add(module);
        }

        public void questions() {
            new Question("What images (format) contain paths that are defined mathematically?", "svg", ++count, module.getModule(), getCourse());
            new Question("What attribute should serve as a substitute for the image content—conveying the same information and function?", "alt", ++count, module.getModule(), getCourse());
            new Question("What is the stretching of a cell to cover several rows or columns?", "cell spanning", ++count, module.getModule(), getCourse());
            new Question("Which element is a container for all the content of the form, including some number of form controls, such as text-entry fields and buttons?", "Form", ++count, module.getModule(), getCourse());
            new Question("Which attribute provides the location (URL) of the application or script that will be used to process the form?", "Action", ++count, module.getModule(), getCourse());
            new Question("Which attribute specifies how the information should be sent to the server?", "Method", ++count, module.getModule(), getCourse());
            new Question("True or False | All form controls (except submit and reset buttons) must include a name attribute.", "true", ++count, module.getModule(), getCourse());
        }
    }

    // Module 8: Introduction to Scripting Language Explore the JavaScript Language, DOM and BOM objects. (Chapter 21)
    private static class ModuleEight {

        private final Module module;
        private int count = 0;

        public ModuleEight(){
            module = new Module();
            module.setModule(8);
            allModules().add(module);
        }

        public void questions(){
            // TODO
            new Question("Which scripting language doesn’t need to be run through any form of compiler that interprets our human-readable code into something the browser can understand?", "JavaScript", ++count, module.getModule(), getCourse());
            new Question("True | False, JavaScript is based on Java.", "False", ++count, module.getModule(), getCourse());
            new Question("What means is that we don’t necessarily have to tell JavaScript what a variable is?", "Loosely Typed", ++count, module.getModule(), getCourse());
            new Question("What is a set of web development techniques that uses various web technologies on the client-side to create asynchronous web applications?", "Ajax", ++count, module.getModule(), getCourse());
            new Question("Which HTML tag should you add to embed a script file? ", "Script", ++count, module.getModule(), getCourse());
            new Question("Where is the preferred placement for the script tag because the browser will be done parsing the document and its DOM structure?", "Body", ++count, module.getModule(), getCourse());
            new Question("In some cases, where is the ideal placement for your script to do something before the body completely loads?", "Head", ++count, module.getModule(), getCourse());
            new Question("What do you call a command telling a browser what to do?", "Statement", ++count, module.getModule(), getCourse());
            new Question("What tells JavaScript that it’s the end of the command, just as a period ends a sentence?", ";", ++count, module.getModule(), getCourse());
        }
    }

    // Module 9: Working with Functions, Data Types, and Operators Write and call functions to perform actions and calculate values.
    private static class ModuleNine {

        private final Module module;
        private int count = 0;

        public ModuleNine(){
            module = new Module();
            module.setModule(9);
            allModules().add(module);
        }

        public void questions(){
            new Question("What provides older browsers with modern features and normalize functionality?", "Polyfills", ++count, module.getModule(), getCourse());
            new Question("What gives us a way to access and manipulate the contents of a document?", "DOM", ++count, module.getModule(), getCourse());
            new Question("True | False, the DOM cannot be used for XML.", "False", ++count, module.getModule(), getCourse());
            new Question("What do you call each element within the page?", "Nodes", ++count, module.getModule(), getCourse());
            new Question("Which object in the DOM identifies the page itself, and more often than not will serve as the starting point for our DOM crawling?", "Document", ++count, module.getModule(), getCourse());
            new Question("Which method retrieves any element or elements you specify as an argument?", "getElementsByTagName()", ++count, module.getModule(), getCourse());
            new Question("Which method returns a single element based on that element’s ID?", "getElementById()", ++count, module.getModule(), getCourse());
            new Question("Which method allows you to access nodes in the document based on the value of a class attribute?", "getElementsByClassName()", ++count, module.getModule(), getCourse());
            new Question("Which method allows you to access nodes of the DOM based on a CSS- style selector?", "querySelectorAll()", ++count, module.getModule(), getCourse());
            new Question("True | False, you can also query the tag's attribute in JavaScript.", "True", ++count, module.getModule(), getCourse());
            new Question("How do get the value of an attribute attached to an element node?", "getAttribute()", ++count, module.getModule(), getCourse());
            new Question("Which attribute would we use if we wanted to change the element's attributes?", "setAttribute()", ++count, module.getModule(), getCourse());
            new Question("What is the 2nd value that you must assign to setAttribute()?", "New Value", ++count, module.getModule(), getCourse());
            new Question("What gives us a simple method for accessing and changing the text and markup inside an element?", "innerHTML", ++count, module.getModule(), getCourse());
            new Question("What allows you to add, modify, or remove a CSS style from an element?", "style", ++count, module.getModule(), getCourse());
            new Question("True | False, in JavaScript and the DOM, CSS properties that are hyphenated become Camel Case.", "True", ++count, module.getModule(), getCourse());
            new Question("Which method do you call when creating a new element in the DOM?", "createElement()", ++count, module.getModule(), getCourse());
            new Question("Which method do you call when you wanted to enter text?", "createTextNode()", ++count, module.getModule(), getCourse());
            new Question("How do you make a newly created element or text part of the document in JavaScript?", "appendChild()", ++count, module.getModule(), getCourse());
            new Question("Which method inserts an element before another element?", "insertBefore()", ++count, module.getModule(), getCourse());
            new Question("Which method replaces one node with another?", "replaceChild()", ++count, module.getModule(), getCourse());
            new Question("Which method do you call to remove a node or an entire branch from the document tree?", "removeChild()", ++count, module.getModule(), getCourse());
            new Question("True or False | appendChild(), replace Child() and removeChild() do not need to be called on the parent element.", "False", ++count, module.getModule(), getCourse());
            new Question("What is a collection of prewritten functions and methods that you can use in your scripts to accomplish common tasks or simplify complex ones?", "Libraries", ++count, module.getModule(), getCourse());
            new Question("What stands for stands for Asynchronous JavaScript And XML?", "AJAX", ++count, module.getModule(), getCourse());
            new Question("Which of the libraries has found its way into over two-thirds of all websites?", "JQuery", ++count, module.getModule(), getCourse());
            new Question("Which is the JQuery statement known for checking the document and waits until it’s ready to be manipulated?", "Ready Event", ++count, module.getModule(), getCourse());
        }
    }

    private static class ModuleTen {

        private final Module module;
        private int count = 0;

        public ModuleTen(){
            module = new Module();
            module.setModule(10);
            allModules().add(module);
        }

        public void questions(){
            // TODO
        }
    }

    private static class ModuleEleven {

        private final Module module;
        private int count = 0;

        public ModuleEleven(){
            module = new Module();
            module.setModule(11);
            allModules().add(module);
        }

        public void questions(){
            // TODO
        }
    }

    private static class ModuleTwelve {

        private final Module module;
        private int count = 0;

        public ModuleTwelve(){
            module = new Module();
            module.setModule(12);
            allModules().add(module);
        }

        public void questions(){
            // TODO
        }
    }

    private static class ModuleThirteen {

        private final Module module;
        private int count = 0;

        public ModuleThirteen(){
            module = new Module();
            module.setModule(13);
            allModules().add(module);
        }

        public void questions(){
            // TODO
        }
    }

    public void release(boolean shuffle){
        moduleOne.questions();
        moduleTwo.questions();
        moduleThree.questions();
//        moduleFour.questions();
        moduleSeven.questions();
        if (shuffle) Collections.shuffle(allQuestions());
    }
}
