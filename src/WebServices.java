import java.util.ArrayList;
import java.util.Collections;

public class WebServices extends Course {

    private static ModuleOne moduleOne;
    private static ModuleTwo moduleTwo;
    private static ModuleThree moduleThree;
//    private static ModuleFour moduleFour;
    private static final Course course = new Course();
    private final ArrayList<Question> questions = new ArrayList<>();

    public WebServices() {
        moduleOne = new ModuleOne();
        moduleTwo = new ModuleTwo();
        moduleThree = new ModuleThree();
//        moduleFour = new ModuleFour();
        course.setCourse("Web Services");
    }

    static class ModuleOne{

        private final Module module;

        public ModuleOne(){
            module = new Module();
            module.setModule(1);
            course.allModules().add(module);
        }

        public void questions(){
            new Question("What is a software system identified by a URI whose public interfaces and bindings are defined and described using XML?", "Web Service", 1, module.getModule(), course.getCourse());
            new Question("What is a style of software design where services are provided to the other components by application components, through a communication protocol over a network?", "Service-Oriented Architecture", 2, module.getModule(), course.getCourse());
            new Question("What are modern interpretation of service-oriented architectures used to build distributed software systems?", "Microservices", 3, module.getModule(), course.getCourse());
            new Question("In a microservice architecture, what are processes that communicate with each other over the network in order to fulfill a goal?", "Services", 4, module.getModule(), course.getCourse());
            new Question("What is the service interface / component that is typically hosted on a web server and makes the service available on the internet?", "Service Provider", 5, module.getModule(), course.getCourse());
            new Question("What do you call the consumer of the service?", "Client", 6, module.getModule(), course.getCourse());
            new Question("What do you call the physical implementation of the service?", "Service Implementation", 7, module.getModule(), course.getCourse());
            new Question("What is referred to a piece of code that converts parameters passed between client and server during a service call?", "Stub", 8, module.getModule(), course.getCourse());
            new Question("What is the layer responsible for transporting messages between the client and the server. HTTP/HTTPS?", "Service Transport", 9, module.getModule(), course.getCourse());
            new Question("What is a central point where service developers publish new services or find existing ones?", "Service Registry", 10, module.getModule(), course.getCourse());
            new Question("What is the process of finding and locating a particular service?", "Service Discovery", 11, module.getModule(), course.getCourse());
            new Question("Name the operation consisting of firstly describing the web service itself then registering the web service.", "Publishing", 12, module.getModule(), course.getCourse());
            new Question("Name the operation firstly discovering the services in the registry and then selecting the desired web service(s) from the search results", "Finding", 13, module.getModule(), course.getCourse());
            new Question("Name the the final operation in the Web services architecture.", "Invocation", 14, module.getModule(), course.getCourse());
        }
    }

    static class ModuleTwo {

        private final Module module;

        public ModuleTwo(){
            module = new Module();
            module.setModule(2);
            course.allModules().add(module);
        }

        public void questions(){
            new Question("What language is used to display data and focuses on how data looks?", "HTML", 1, module.getModule(), course.getCourse());
            new Question("What provides a framework to define markup languages?", "XML", 2, module.getModule(), course.getCourse());
            new Question("What is used for distinct, but related, purposes in XML?", "CDATA", 3, module.getModule(), course.getCourse());
            new Question("What are used for providing uniquely named elements and attributes in an XML document. They are defined in a W3C recommendation?", "Namespaces", 4, module.getModule(), course.getCourse());
            new Question("What is a description of a type of XML document, typically expressed in terms of constraints on the structure and content of documents of that type, above and beyond the basic syntactical constraints imposed by XML itself?", "XML Schema", 5, module.getModule(), course.getCourse());
            new Question("What uses path expressions to select nodes or node-sets in an XML document?", "xpath", 6, module.getModule(), course.getCourse());
            new Question("What can respond to any type of request, but are commonly used to extend the applications hosted by web servers?", "Servlets", 7, module.getModule(), course.getCourse());
            new Question("What is a part of a URL that assigns values to specified parameters?", "Query String", 8, module.getModule(), course.getCourse());
        }
    }
    static class ModuleThree{

        private final Module module;

        public ModuleThree(){
            module = new Module();
            module.setModule(3);
            course.allModules().add(module);
        }

        public void questions(){
            new Question("What is a software architectural style that defines a set of constraints to be used for creating Web services?", "REST", 1, module.getModule(), course.getCourse());
            new Question("What refers to the ability of software to easily integrate with other systems in terms of sharing functionality and data?", "interoperability", 2, module.getModule(), course.getCourse());
            new Question("Name the term meaning how calls can be made independently of one another, and each call contains all of the data necessary to complete itself successfully.", "stateless", 3, module.getModule(), course.getCourse());
            new Question("Which verb provides a read only access to a resource?", "GET", 4, module.getModule(), course.getCourse());
            new Question("Which verb is used to create a new resource?", "POST", 5, module.getModule(), course.getCourse());
            new Question("Which verb is used to remove a resource?", "DELETE", 6, module.getModule(), course.getCourse());
            new Question("Which verb is used to update an existing resource or create a new resource?", "PUT", 7, module.getModule(), course.getCourse());
            new Question("What refers to storing the server response in the client itself, so that a client need not make a server request for the same resource again and again?", "Caching", 8, module.getModule(), course.getCourse());
            new Question("What may be received at the same time which may cause conflicts? ", "Concurrency", 9, module.getModule(), course.getCourse());
        }
    }

    /*static class ModuleFour{

        private final Module module;

        public ModuleFour(){
            module = new Module();
            module.setModule(4);
            course.allModules().add(module);
        }

        public void questions(){
            new Question("What is intended to simplify the reuse of web services, based on the existing HTTP architecture?", "WADL", 1, module.getModule(), course.getCourse());
            new Question("True | False\nThe WADL file does not provide the service information regardless of the implementation platform.", "false", 2, module.getModule(), course.getCourse());
            new Question("", "", 2, module.getModule(), course.getCourse());
            new Question("", "", 1, module.getModule(), course.getCourse());
            new Question("", "", 1, module.getModule(), course.getCourse());
            new Question("", "", 1, module.getModule(), course.getCourse());
            new Question("", "", 1, module.getModule(), course.getCourse());
            new Question("", "", 1, module.getModule(), course.getCourse());
            new Question("", "", 1, module.getModule(), course.getCourse());
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