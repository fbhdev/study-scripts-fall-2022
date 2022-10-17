import java.util.ArrayList;
import java.util.Collections;

public class WebServices extends Course {

    private static ModuleOne moduleOne;
    private static ModuleTwo moduleTwo;
    private static ModuleThree moduleThree;
//    private static ModuleFour moduleFour;
    private static ModuleFive moduleFive;
    private static final Course course = new Course();
    private final ArrayList<Question> questions = new ArrayList<>();

    public WebServices() {
        moduleOne = new ModuleOne();
        moduleTwo = new ModuleTwo();
        moduleThree = new ModuleThree();
//        moduleFour = new ModuleFour();
        moduleFive = new ModuleFive();
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
            new Question("What is a program that is invoked by a URL and returns a response to the web client, via a transport protocol (i.e. HTTP)?", "Web Service", 1, module.getModule(), course.getCourse());
            new Question("What is a style of software design where services are provided to the other components by application components, through a communication protocol over a network?", "Service-Oriented Architecture", 2, module.getModule(), course.getCourse());
            new Question("What are modern interpretation of service-oriented architectures used to build distributed software systems?", "Microservices", 3, module.getModule(), course.getCourse());
            new Question("What is a discrete unit of functionality that can be accessed remotely and acted upon and updated independently, such as retrieving a credit card statement online?", "Service", 4, module.getModule(), course.getCourse());
            new Question("What is the service interface / component that is typically hosted on a web server and makes the service available on the internet?", "Service Provider", 5, module.getModule(), course.getCourse());
            new Question("What do you call the consumer of the service?", "Client", 6, module.getModule(), course.getCourse());
            new Question("What do you call the physical implementation of the service?", "Service Implementation", 7, module.getModule(), course.getCourse());
            new Question("What is referred to a piece of code that converts parameters passed between client and server during a service call?", "Stub", 8, module.getModule(), course.getCourse());
            new Question("What is the layer responsible for transporting messages between the client and the server. HTTP/HTTPS?", "Service Transport", 9, module.getModule(), course.getCourse());
            new Question("Where does the service provider publish or find the service and its description?", "Service Registry", 10, module.getModule(), course.getCourse());
            new Question("What is the process of finding and locating a particular service?", "Service Discovery", 11, module.getModule(), course.getCourse());
            new Question("Name the operation consisting of firstly describing the web service itself then registering the web service.", "Publishing", 12, module.getModule(), course.getCourse());
            new Question("Name the operation firstly discovering the services in the registry and then selecting the desired web service(s) from the search results", "Finding", 13, module.getModule(), course.getCourse());
            new Question("Name the the final operation in the Web services architecture.", "Invocation", 14, module.getModule(), course.getCourse());
            new Question("In service-oriented architecture, what do services use to describe both the functional characteristics of the service, like passing and parsing messages?", "Metadata", 15, module.getModule(), course.getCourse());
            new Question("How do you call components that are weakly associated (have breakable relationships) with each other, thus changes in one component least affect existence or performance of the other component?", "Loosely Coupled", 16, module.getModule(), course.getCourse());
            new Question("What is a disadvantage of loosely coupled components?", "Consistency", 17, module.getModule(), course.getCourse());
            new Question("True | False, can web services be consumed both synchronously and asynchronously?", "True", 18, module.getModule(), course.getCourse());
            new Question("What describes the public interface to a specific web service?", "Service Definition", 19, module.getModule(), course.getCourse());
            new Question("What is referred to the process of the execution of the service and returning the result to the client?", "Service Processing", 20, module.getModule(), course.getCourse());
            new Question("Name the protocol acting as conversation between the client and the server and the TCP/IP network model.", "HTTP", 21, module.getModule(), course.getCourse());
            new Question("What is an enterprise application sees both requests and sessions from two angles?", "Web Server", 22, module.getModule(), course.getCourse());
            new Question("What provides additional information to the server and the client, respectively?", "Headers", 23, module.getModule(), course.getCourse());
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
            new Question("What indicates that a certain portion of the document is general character data, rather than non-character data or character data with a more specific, limited structure?", "CDATA", 3, module.getModule(), course.getCourse());
            new Question("What is declared using the reserved XML attribute xmlns or xmlns:prefix and are used to provide a method to avoid element name conflicts?", "Namespaces", 4, module.getModule(), course.getCourse());
            new Question("What is a description of a type of XML document, typically expressed in terms of constraints on the structure and content of documents of that type, above and beyond the basic syntactical constraints imposed by XML itself?", "XML Schema", 5, module.getModule(), course.getCourse());
            new Question("What uses path expressions to select nodes or node-sets in an XML document?", "xpath", 6, module.getModule(), course.getCourse());
            new Question("What can respond to any type of request, but are commonly used to extend the applications hosted by web servers?", "Servlets", 7, module.getModule(), course.getCourse());
            new Question("What is the part of a URL that assigns values to specified parameters?", "Query String", 8, module.getModule(), course.getCourse());
            new Question("True | False, XML is not case sensitive.", "False", 9, module.getModule(), course.getCourse());
            new Question("True | False, XML preserves whitespace while HTML does not.", "True", 10, module.getModule(), course.getCourse());
            new Question("What is a type of computer software that provides services to software applications beyond those available from the operating system. It can be described as \"software glue\"?", "Middleware", 11, module.getModule(), course.getCourse());
            new Question("Name what can arbitrarily instantiate many instances of a servlet, although the number is typically small (e.g., 1 through 4).", "Web Server", 12, module.getModule(), course.getCourse());
            new Question("Which Java class includes the methods by which the servlet developer must implement?", "HttpServlet", 13, module.getModule(), course.getCourse());
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
            new Question("Name the term meaning how calls can be made independently of one another while each call contains all of the data necessary to complete itself successfully.", "stateless", 3, module.getModule(), course.getCourse());
            new Question("Which verb provides a read only access to a resource?", "GET", 4, module.getModule(), course.getCourse());
            new Question("Which verb is used to create a new resource?", "POST", 5, module.getModule(), course.getCourse());
            new Question("Which verb is used to remove a resource?", "DELETE", 6, module.getModule(), course.getCourse());
            new Question("Which verb is used to update an existing resource or create a new resource?", "PUT", 7, module.getModule(), course.getCourse());
            new Question("What refers to storing the server response in the client itself, so that a client need not make a server request for the same resource again and again?", "Caching", 8, module.getModule(), course.getCourse());
            new Question("What refers to the number of requests that the system can process simultaneously which can cause conflicts? ", "Concurrency", 9, module.getModule(), course.getCourse());
            new Question("What do you also call REST components? ", "Resources", 10, module.getModule(), course.getCourse());
            new Question("What is a disadvantage of REST's statelessness?", "Additional Information", 11, module.getModule(), course.getCourse());
            new Question("What do you call the design principle for separating a computer program into distinct sections?", "Separation of Concerns", 12, module.getModule(), course.getCourse());
            new Question("True | False, responses define themselves as cacheable or not to prevent clients from getting stale or inappropriate data in response to further requests.", "True", 13, module.getModule(), course.getCourse());
            new Question("True | False, a server cannot call multiple other servers to generate a response to the client.", "False", 14, module.getModule(), course.getCourse());
            new Question("What simplifies and decouples the architecture, which enables each part to evolve independently?", "Uniform Interface", 15, module.getModule(), course.getCourse());
            new Question("Which protocol uses a MIME-like envelope format to encode representations?", "HTTP", 16, module.getModule(), course.getCourse());
            new Question("Which non-access modifier should you avoid using out of concurrency issues in REST?", "Static", 17, module.getModule(), course.getCourse());
            new Question("What are ordinary objects increasing readability and re-usability of a Java program that are widely accepted because of their easy maintenance?", "POJO", 18, module.getModule(), course.getCourse());
            new Question("In computer software, what is the part of the program that encodes the real-world business rules that determine how data can be created, stored, and changed. It is contrasted with the remainder of the software that might be concerned with lower-level details of managing a database or displaying the user interface, system infrastructure, or generally connecting various parts of the program.", "Business Logic", 19, module.getModule(), course.getCourse());
            new Question("What is a specification, a set of interfaces and annotations offered by Java EE?", "JAX-RS", 20, module.getModule(), course.getCourse());
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
            new Question("True | False, WADL is XML based?", "True", 3, module.getModule(), course.getCourse());
            new Question("", "", 1, module.getModule(), course.getCourse());
            new Question("", "", 1, module.getModule(), course.getCourse());
            new Question("", "", 1, module.getModule(), course.getCourse());
            new Question("", "", 1, module.getModule(), course.getCourse());
            new Question("", "", 1, module.getModule(), course.getCourse());
            new Question("", "", 1, module.getModule(), course.getCourse());
        }
    }*/

    static class ModuleFive{

        private final Module module;

        public ModuleFive(){
            module = new Module();
            module.setModule(5);
            course.allModules().add(module);
        }

        public void questions(){
            new Question("What is an open standard file and data interchange format, that uses human-readable text to store and transmit data objects consisting of attribute–value pairs and array data types?", "JSON", 1, module.getModule(), course.getCourse());
            new Question("True | False, JSON can include the world null.", "True", 2, module.getModule(), course.getCourse());
            new Question("True | False, JSON allows data validation against schemas as well as data transformation vis XSLT.", "False", 3, module.getModule(), course.getCourse());
            new Question("What is a high-performance JSON processor for Java?", "Jackson", 4, module.getModule(), course.getCourse());
            new Question("What is the process of converting a set of object instances that contain references to each other into a linear stream of bytes, which can then be sent through a socket, stored to a file, or simply manipulated as a stream of data?", "Serialization", 5, module.getModule(), course.getCourse());
            new Question("What means that the managed data in these systems are not structured in a strict format, as defined by a schema?", "Schemaless", 6, module.getModule(), course.getCourse());
            new Question("What supports automatic marshalling and unmarshalling of POJO objects in XML?", "JAX-RS", 7, module.getModule(), course.getCourse());
            new Question("What uses serialization and is the process of encoding an object to be sent across the network?", "Marshalling", 8, module.getModule(), course.getCourse());
            new Question("Which class may be used to control the response that is being sent to the client?", "Response Builder", 9, module.getModule(), course.getCourse());
            new Question("What is the practice of calling different methods in a single line instead of calling other methods with the same object reference separately? It is also known as named parameter idiom.", "Method Chaining", 10, module.getModule(), course.getCourse());
        }
    }

    public void release(boolean shuffle){
        moduleOne.questions();
        moduleTwo.questions();
        moduleThree.questions();
//        moduleFour.questions();
        moduleFive.questions();
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
        course.allQuestions().clear();
    }
}
