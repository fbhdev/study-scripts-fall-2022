import java.util.Collections;

public class WebServices extends Course {

    private final ModuleOne moduleOne;
    private final ModuleTwo moduleTwo;
    private final ModuleThree moduleThree;
    private final ModuleFour moduleFour;
    private final ModuleFive moduleFive;
    private final ModuleSix moduleSix;
    private final ModuleSeven moduleSeven;

    public WebServices() {
        moduleOne = new ModuleOne();
        moduleTwo = new ModuleTwo();
        moduleThree = new ModuleThree();
        moduleFour = new ModuleFour();
        moduleFive = new ModuleFive();
        moduleSix = new ModuleSix();
        moduleSeven = new ModuleSeven();
        setCourse("Web Services");
    }


    // Module 1: Introduction to Web Services
    private static class ModuleOne{

        private final Module module;
        private int count = 0;

        public ModuleOne(){
            module = new Module();
            module.setModule(1);
            allModules().add(module);
        }

        public void questions(){
            new Question("What is a program that is invoked by a URL and returns a response to the web client, via HTTP?", "Web Service", ++count, module.getModule(), getCourse());
            new Question("What is a style of software design where services are provided to the other components by application components over a network?", "SOA", ++count, module.getModule(), getCourse());
            new Question("What are modern interpretation of service-oriented architectures used to build distributed software systems?", "Microservices", ++count, module.getModule(), getCourse());
            new Question("What is a discrete unit of functionality that can be accessed remotely and acted upon and updated independently?", "Service", ++count, module.getModule(), getCourse());
            new Question("What do you call the owner of the Web Service?", "Service Provider", ++count, module.getModule(), getCourse());
            new Question("What do you call the consumer of the service?", "Client", ++count, module.getModule(), getCourse());
            new Question("What do you call the physical implementation of the service?", "Service Implementation", ++count, module.getModule(), getCourse());
            new Question("What is referred to a piece of code that converts parameters passed between client and server during a service call?", "Stub", ++count, module.getModule(), getCourse());
            new Question("What is the layer responsible for transporting messages between the client and the server?", "Service Transport", ++count, module.getModule(), getCourse());
            new Question("Where does the service provider publish or find the service and its description?", "Service Registry", ++count, module.getModule(), getCourse());
            new Question("What is the process of finding and locating a particular service?", "Service Discovery", ++count, module.getModule(), getCourse());
            new Question("Name the operation consisting of firstly describing the web service itself then registering the web service.", "Publishing", ++count, module.getModule(), getCourse());
            new Question("Name the operation firstly discovering the services in the registry and then selecting the desired web service(s) from the search results", "Finding", ++count, module.getModule(), getCourse());
            new Question("Name the the final operation in the Web services architecture.", "Invocation", ++count, module.getModule(), getCourse());
            new Question("In service-oriented architecture, what do services use to describe both the functional characteristics of the service, like passing and parsing messages?", "Metadata", ++count, module.getModule(), getCourse());
            new Question("How do you call components that are weakly associated with each other, thus changes in one component least affect existence or performance of the other component?", "Loosely Coupled", ++count, module.getModule(), getCourse());
            new Question("What is a disadvantage of loosely coupled components?", "Consistency", ++count, module.getModule(), getCourse());
            new Question("True | False, can web services be consumed both synchronously and asynchronously?", "True", ++count, module.getModule(), getCourse());
            new Question("What contains the details of the interface and implementation of the service?", "Service Definition", ++count, module.getModule(), getCourse());
            new Question("What is referred to the process of the execution of the service and returning the result to the client?", "Service Processing", ++count, module.getModule(), getCourse());
            new Question("Name the protocol acting as conversation between the client and the server and the TCP/IP network model.", "HTTP", ++count, module.getModule(), getCourse());
            new Question("What is an enterprise application sees both requests and sessions from two angles?", "Web Server", ++count, module.getModule(), getCourse());
            new Question("What are used to pass additional information between the client and the server?", "Headers", ++count, module.getModule(), getCourse());
            new Question("What is a set of rules that define how a web service is accessed?", "Service Contract", ++count, module.getModule(), getCourse());
            new Question("Whose job is it to connect two pieces of software without limiting their own functionalities?", "API", ++count, module.getModule(), getCourse());
            new Question("What is the application that is looking for and invoking or initiating an interaction with a service?", "Service Requestor", ++count, module.getModule(), getCourse());
            new Question("What includes the design, deployment, and runtime requirements for each of the roles: service registry, service provider, and service discovery agency?", "Development Lifecycle", ++count, module.getModule(), getCourse());
            new Question("Which phase of the development lifecycle includes development and testing of the web service implementation?", "Build", ++count, module.getModule(), getCourse());
            new Question("Which phase includes the publication of the service interface and service implementation definition to a requestor or registry and installation?", "Deploy", ++count, module.getModule(), getCourse());
            new Question("Where do you typically deploy your web service?", "Web Server", ++count, module.getModule(), getCourse());
            new Question("Which phase is it when your web service is fully deployed, operational, and network accessible from the service provider?", "Run", ++count, module.getModule(), getCourse());
            new Question("Which phase of the lifecycle covers ongoing management and administration of the web service?", "Manage", ++count, module.getModule(), getCourse());
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


    // Module 2: Java Web and Servlets
    private static class ModuleTwo {

        private final Module module;
        private int count = 0;

        public ModuleTwo(){
            module = new Module();
            module.setModule(2);
            allModules().add(module);
        }

        public void questions(){
            new Question("What language is used to display data and focuses on how data looks?", "HTML", ++count, module.getModule(), getCourse());
            new Question("What provides a framework to define markup languages?", "XML", ++count, module.getModule(), getCourse());
            new Question("What indicates that a certain portion of the document is general character data, rather than non-character data or character data with a more specific, limited structure?", "CDATA", ++count, module.getModule(), getCourse());
            new Question("What is declared using the reserved XML attribute xmlns or xmlns:prefix and are used to provide a method to avoid element name conflicts?", "Namespaces", ++count, module.getModule(), getCourse());
            new Question("What is a description of a type of XML document, typically expressed in terms of constraints on the structure and content of documents of that type, above and beyond the basic syntactical constraints imposed by XML itself?", "XML Schema", ++count, module.getModule(), getCourse());
            new Question("What uses path expressions to select nodes or node-sets in an XML document?", "xpath", ++count, module.getModule(), getCourse());
            new Question("What can respond to any type of request, but are commonly used to extend the applications hosted by web servers?", "Servlets", ++count, module.getModule(), getCourse());
            new Question("What is the part of a URL that assigns values to specified parameters?", "Query String", ++count, module.getModule(), getCourse());
            new Question("True | False, XML is not case sensitive.", "False", ++count, module.getModule(), getCourse());
            new Question("True | False, XML preserves whitespace while HTML does not.", "True", ++count, module.getModule(), getCourse());
            new Question("What is a type of computer software that provides services to software applications beyond those available from the operating system. It can be described as \"software glue\"?", "Middleware", ++count, module.getModule(), getCourse());
            new Question("Name what can arbitrarily instantiate many instances of a servlet, although the number is typically small (e.g., 1 through 4).", "Web Server", ++count, module.getModule(), getCourse());
            new Question("Which Java class includes the methods by which the servlet developer must implement?", "HttpServlet", ++count, module.getModule(), getCourse());
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


    // Module 3: RESTful Web Services
    private static class ModuleThree{

        private final Module module;
        private int count = 0;

        public ModuleThree(){
            module = new Module();
            module.setModule(3);
            allModules().add(module);
        }

        public void questions(){
            new Question("What is an architectural style that standardizes stateless HTTP communication in client-server relationships?", "REST", ++count, module.getModule(), getCourse());
            new Question("What refers to the ability of software to easily integrate with other systems in terms of sharing functionality and data?", "interoperability", ++count, module.getModule(), getCourse());
            new Question("Which RESTful constraint says the client and the server stay separate and independent?", "Client-Server Architecture", ++count, module.getModule(), getCourse());
            new Question("What is the RESTful constraint saying that an API has to handle calls independently of each other.", "Statelessness", ++count, module.getModule(), getCourse());
            new Question("What simplifies and decouples the architecture, which enables each part to evolve independently?", "Uniform Interface", ++count, module.getModule(), getCourse());
            new Question("What do you call the design principle for separating a computer program into distinct sections?", "Separation of Concerns", ++count, module.getModule(), getCourse());
            new Question("Which RESTful constraint says that the API's layers must not affect the request or the response?", "Layered System", ++count, module.getModule(), getCourse());
            new Question("Which RESTful constraint says the client has the option to locally store certain pieces of data for a predetermined period of time?", "Cacheability", ++count, module.getModule(), getCourse());
            new Question("Name the optional RESTful constraint that can help the client implement their own features on the go?", "Code on Demand", ++count, module.getModule(), getCourse());
            new Question("Which verb reads the information from a record in the database?", "GET", ++count, module.getModule(), getCourse());
            new Question("Which verb creates a record in the database?", "POST", ++count, module.getModule(), getCourse());
            new Question("Which verb changes a record's information in the database?", "PUT", ++count, module.getModule(), getCourse());
            new Question("Which verb removes a record from the database?", "DELETE", ++count, module.getModule(), getCourse());
            new Question("What refers to the number of requests that the system can process simultaneously?", "Concurrency", ++count, module.getModule(), getCourse());
            new Question("What do you also call REST components? ", "Resources", ++count, module.getModule(), getCourse());
            new Question("What is a disadvantage of REST's statelessness?", "Additional Information", ++count, module.getModule(), getCourse());
            new Question("True | False, responses can define themselves as cacheable to prevent clients from getting stale or inappropriate data in response to further requests.", "True", ++count, module.getModule(), getCourse());
            new Question("True | False, a server cannot call multiple other servers to generate a response to the client.", "False", ++count, module.getModule(), getCourse());
            new Question("Which protocol uses a MIME-like envelope format to encode representations?", "HTTP", ++count, module.getModule(), getCourse());
            new Question("Which non-access modifier should you avoid using out of concurrency issues in REST?", "Static", ++count, module.getModule(), getCourse());
            new Question("What are ordinary objects increasing readability and re-usability of a Java program that are widely accepted because of their easy maintenance?", "POJO", ++count, module.getModule(), getCourse());
            new Question("In computer software, what is the part of the program that encodes the real-world business rules?", "Business Logic", ++count, module.getModule(), getCourse());
            new Question("What is a specification, a set of interfaces and annotations offered by Java EE?", "JAX-RS", ++count, module.getModule(), getCourse());
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


    // Module 4: REST, The Client Side
    private static class ModuleFour{

        private final Module module;
        private int count = 0;

        public ModuleFour(){
            module = new Module();
            module.setModule(4);
            allModules().add(module);
        }

        public void questions(){
            new Question("What is intended to simplify the reuse of web services, based on the existing HTTP architecture?", "WADL", ++count, module.getModule(), getCourse());
            new Question("True | False, The WADL file does not provide the service information regardless of the implementation platform.", "false", ++count, module.getModule(), getCourse());
            new Question("True | False, WADL is XML based.", "True", ++count, module.getModule(), getCourse());
            new Question("What is like a switchboard between the client and the server that also confirms that the client has authorization to send HTTP requests to the server?", "Uniform Interface", ++count, module.getModule(), getCourse());
            new Question("How are the details about the request sent to the server?", "Request Headers", ++count, module.getModule(), getCourse());
            new Question("What uses the following syntax -> type/subtype, and are used to specify the content types in the Accept field", "media types", ++count, module.getModule(), getCourse());
            new Question("What do you call the specification for the format of non-text e-mail attachments that allows the attachment to be sent over the Internet?", "MIME", ++count, module.getModule(), getCourse());
            new Question("Which important Response header tells the client what media type (e.g., application/json, application/javascript, etc.) a response is sent in as it helps the client know how to process the response body correctly?", "content-type", ++count, module.getModule(), getCourse());
            new Question("What alerts the client to information about the success of the operation?", "Status Codes", ++count, module.getModule(), getCourse());
            new Question("Which status code means a successful HTTP request?", "200", ++count, module.getModule(), getCourse());
            new Question("Which status code is the standard response for an HTTP request that resulted an item being successfully created?", "201", ++count, module.getModule(), getCourse());
            new Question("Which status code is the standard response for a successful HTTP request that saw nothing returned in the response body?", "204", ++count, module.getModule(), getCourse());
            new Question("Which status code says the request cannot be processed because of bad request syntax, excessive size or another client error?", "400", ++count, module.getModule(), getCourse());
            new Question("Which status code says the client does not have permission to access this resource?", "403", ++count, module.getModule(), getCourse());
            new Question("Which status code says the resource could not be found at this time, with possible deletion or not being created yet?", "404", ++count, module.getModule(), getCourse());
            new Question("When no more specific information is available, which status code is the generic answer for an unexpected failure?", "500", ++count, module.getModule(), getCourse());
            new Question("What is the point where the API and the rest of the internet meet and communicate?", "Endpoint", ++count, module.getModule(), getCourse());
            new Question("What are unique identifiers that are typically long, unique strings of numbers and letters assisting endpoint security?", "Keys", ++count, module.getModule(), getCourse());
            new Question("What sits between the client service and the backend, effectively decoupling the client interface from your backend implementation?", "Gateway", ++count, module.getModule(), getCourse());
            new Question("What is intended to simplify the reuse of web services by intending to model the resources provided by a service and the relationships between them?", "WADL", ++count, module.getModule(), getCourse());
            new Question("True | False, WADL is the REST equivalent to SOAP's WSDL.", "True", ++count, module.getModule(), getCourse());
            new Question("True | False, the WADL file does not provide the service information regardless of the implementation platform.", "False", ++count, module.getModule(), getCourse());
            new Question("Name the subclass supporting https-specific features.", "HttpsURLConnection", ++count, module.getModule(), getCourse());
            new Question("Which package provides basic functionality for accessing resources via HTTP, but does NOT provide the full flexibility or functionality needed by many applications?", "java.net", ++count, module.getModule(), getCourse());
            new Question("Which class fills the void of java.net not providing the full flexibility of https needed by most applications?", "HttpClient", ++count, module.getModule(), getCourse());
            new Question("True | False, headers are case sensitive.", "True", ++count, module.getModule(), getCourse());
            new Question("Which type of headers contains the location of the source that has been requested by the client?", "Response Headers", ++count, module.getModule(), getCourse());
            new Question("What is the type of headers applied on both Request and Response types?", "General Headers", ++count, module.getModule(), getCourse());
            new Question("Which Response header defines the authentication method that should be used to gain access to a resource behind a proxy serve?", "Proxy-Authenticate", ++count, module.getModule(), getCourse());
            new Question("Which Request header contains the credentials to authenticate a user agent to a proxy server?", "Proxy-Authorization", ++count, module.getModule(), getCourse());
            new Question("Which header contains the time in seconds the object was in a proxy cache?", "Age", ++count, module.getModule(), getCourse());
            new Question("Which header field holds directives (instructions) — in both requests and responses — that control caching in browsers and shared caches (e.g. Proxies, CDNs)?", "cache-control", ++count, module.getModule(), getCourse());
            new Question("Which header clears browsing data (cookies, storage, cache) associated with the requesting website?", "Clear-Site-Data", ++count, module.getModule(), getCourse());
            new Question("Which Response header contains the date/time after which the response is considered expired?", "expires", ++count, module.getModule(), getCourse());
            new Question("Which header may the server send as an initial response if it needs some form of authentication before responding with the actual resource being requested?", "WWW-Authenticate", ++count, module.getModule(), getCourse());
            new Question("Which Request header tells the server which character sets are acceptable by the client?", "Accept-Charset", ++count, module.getModule(), getCourse());
            new Question("Which Request header indicates the natural language and locale that the client prefers?", "Accept-Language", ++count, module.getModule(), getCourse());
            new Question("What is the mandatory Request header specifying the Internet host and port number of the resource being requested, as obtained from the original URI given by the user or referring resource?", "host", ++count, module.getModule(), getCourse());
            new Question("What Request header is used to inform the server by the client what content-type to send back?", "Accept", ++count, module.getModule(), getCourse());
            new Question("Which Response header indicates the security contexts without exposing the path information?", "Origin", ++count, module.getModule(), getCourse());
            new Question("What is the Request header using a characteristic string that lets servers and network peers identify the application, operating system, vendor?", "user-agent", ++count, module.getModule(), getCourse());
            new Question("How would you denote a file containing HTML as a media type?", "text/html", ++count, module.getModule(), getCourse());
            new Question("How would you denote a JSON file as a media type?", "application/json", ++count, module.getModule(), getCourse());
            new Question("How would you denote a PDF file as a media type?", "application/pdf", ++count, module.getModule(), getCourse());
            new Question("How would you denote a PNG file as media type?", "image/png", ++count, module.getModule(), getCourse());
            new Question("How would you denote a CSS file as a media type?", "text/css", ++count, module.getModule(), getCourse());
            new Question("How would you denote a CSV file as a media type?", "text/csv", ++count, module.getModule(), getCourse());
            new Question("How would you denote a JavaScript file as a media type?", "application/javascript", ++count, module.getModule(), getCourse());
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


    // Module 5: Understanding XML and JSON Data Types
    private static class ModuleFive{

        private final Module module;
        private int count = 0;

        public ModuleFive(){
            module = new Module();
            module.setModule(5);
            allModules().add(module);
        }

        public void questions(){
            new Question("What is an open standard file and data interchange format, that uses human-readable text to store and transmit data objects consisting of attribute–value pairs and array data types?", "JSON", ++count, module.getModule(), getCourse());
            new Question("True | False, JSON can include the world null.", "True", ++count, module.getModule(), getCourse());
            new Question("True | False, JSON allows data validation against schemas as well as data transformation vis XSLT.", "False", ++count, module.getModule(), getCourse());
            new Question("What is a high-performance JSON processor for Java?", "Jackson", ++count, module.getModule(), getCourse());
            new Question("What is the process of converting a set of object instances that contain references to each other into a linear stream of bytes, which can then be sent through a socket, stored to a file, or simply manipulated as a stream of data?", "Serialization", ++count, module.getModule(), getCourse());
            new Question("What means that the managed data in these systems are not structured in a strict format, as defined by a schema?", "Schemaless", ++count, module.getModule(), getCourse());
            new Question("What supports automatic marshalling and unmarshalling of POJO objects in XML?", "JAX-RS", ++count, module.getModule(), getCourse());
            new Question("What uses serialization and is the process of encoding an object to be sent across the network?", "Marshalling", ++count, module.getModule(), getCourse());
            new Question("Which class may be used to control the response that is being sent to the client?", "Response Builder", ++count, module.getModule(), getCourse());
            new Question("What is the practice of calling different methods in a single line instead of calling other methods with the same object reference separately? It is also known as named parameter idiom.", "Method Chaining", ++count, module.getModule(), getCourse());
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


    // Module 6: SOAP Web Services
    private static class ModuleSix {

        private final Module module;
        private int count = 0;

        public ModuleSix(){
            module = new Module();
            module.setModule(6);
            allModules().add(module);
        }

        public void questions() {
            new Question("Despite consuming significant bandwidth and resources, what is the protocol making it easier to operate across firewalls and proxies without modification?", "SOAP", ++count, module.getModule(), getCourse());
            new Question("What is an XML-based interface description language used alongside SOAP?", "WSDL", ++count, module.getModule(), getCourse());
            new Question("What is the Java API for SOAP web services?", "JAX-WS", ++count, module.getModule(), getCourse());
            new Question("What inherits security measures from the underlying service transport?", "REST", ++count, module.getModule(), getCourse());
            new Question("True | False, SOAP permits more than only the XML data format.", "False", ++count, module.getModule(), getCourse());
            new Question("True | False, SOAP is an architectural style and not a protocol.", "False", ++count, module.getModule(), getCourse());
            new Question("True | False, SOAP defines it own security.", "True", ++count, module.getModule(), getCourse());
            new Question("What do you call the unit of communication in SOAP?", "message", ++count, module.getModule(), getCourse());
            new Question("What indicates how exactly the SOAP message body is structured?", "Style", ++count, module.getModule(), getCourse());
            new Question("Which WSDL style indicates that the SOAP message body contains a XML document which can be validated against pre-defined XML schema document?", "Document Style", ++count, module.getModule(), getCourse());
            new Question("In WSDL, what is Document Style also known as?", "Message-Oriented Style", ++count, module.getModule(), getCourse());
            new Question("Which WSDL style indicates that the SOAP message body contains an XML representation of a method call and uses the names of the method and its parameters to generate XML structures that represents a method’s call stack?", "RPC Style", ++count, module.getModule(), getCourse());
            new Question("True | False, SOAP's WSDL cannot be used to described REST web services.", "False", ++count, module.getModule(), getCourse());
            new Question("True | False, RPC style is more efficient than Document style.", "False", ++count, module.getModule(), getCourse());
            new Question("As part of the GlassFish project, what bundles the Reference Implementation and WSIT, the component providing enhanced support for Microsoft's .NET Framework?", "Metro", ++count, module.getModule(), getCourse());
            new Question("What is a set of specifications defining a registry service for Web services and for other electronic and non-electronic services?", "UDDI", ++count, module.getModule(), getCourse());
            new Question("True | False, SOAP is both platform and language independent.", "True", ++count, module.getModule(), getCourse());
            new Question("True | False, SOAP can use REST.", "False", ++count, module.getModule(), getCourse());
        }
    }

    // Module 7: Understanding SOAP Messages
    private static class ModuleSeven {

        private final Module module;
        private int count = 0;

        public ModuleSeven() {
            module = new Module();
            module.setModule(7);
            allModules().add(module);
        }

        public void questions() {
            new Question("What is an error in a SOAP communication resulting from various sources of problems?", "SOAP fault", ++count, module.getModule(), getCourse());
            new Question("True | False, no special message is generated when a SOAP fault occurs.", "False", ++count, module.getModule(), getCourse());
            new Question("What do you call a message that includes a fault element?", "Fault Message", ++count, module.getModule(), getCourse());
            new Question("What do you call the data generated by the special message triggered by a SOAP fault?", "SOAP element", ++count, module.getModule(), getCourse());
            new Question("What is an API for building Web Services and Clients that used Remote Procedure Calls and XML?", "JAX-RPC", ++count, module.getModule(), getCourse());
            new Question("True | False, JAX-RPC is no longer supported.", "True", ++count, module.getModule(), getCourse());
            new Question("What is the object-oriented equivalent of remote procedure calls?", "RMI", ++count, module.getModule(), getCourse());
            new Question("What attempts to reclaim memory which as allocated by a program that is no longer referenced?", "Garbage Collection", ++count, module.getModule(), getCourse());
            new Question("Name the error when a piece of memory is freed while there are still pointers to it.", "Dangling Pointers", ++count, module.getModule(), getCourse());
            new Question("What occurs when the program tries freeing a region of memory that has already been freed, and perhaps already been allocated again?", "Double Free Bugs", ++count, module.getModule(), getCourse());
            new Question("What reduces the performance of the computer by reducing the amount of available memory?", "Memory Leak", ++count, module.getModule(), getCourse());
            new Question("True | False, memory leaks are not common in programming.", "False", ++count, module.getModule(), getCourse());
            new Question("What is the most common type of Garbage Collection?", "Tracing", ++count, module.getModule(), getCourse());
            new Question("What is the programming technique of storing the number of references, pointers, or handles to a resource such as an object or a block of memory?", "Reference Counting", ++count, module.getModule(), getCourse());
            new Question("What is a compile-time technique helping reduce the garbage collection to be done, that can convert heap allocations to stack allocations?", "Escape Analysis", ++count, module.getModule(), getCourse());
            new Question("Name the garbage collection where a remote client can hold references to an object.", "Distributed Garbage Collection", ++count, module.getModule(), getCourse());
            new Question("True | False, Distributed Garbage Collection has to cooperate with local garbage collections in each process in order to keep global count or to globally trace accessibility of data.", "True", ++count, module.getModule(), getCourse());
            new Question("True | False, Distributed Garbage Collection is cost-effective and fast in freeing memory.", "False", ++count, module.getModule(), getCourse());
            new Question("What can Distributed Garbage Collection rely on to remain cheap and fast while freeing memory?", "Time Lease", ++count, module.getModule(), getCourse());
            new Question("What allows processing tools to immediately determine whether a given XML document is a SOAP message?", "Envelope", ++count, module.getModule(), getCourse());
            new Question("Which optional XML element is used to pass additional processing or control information?", "Header", ++count, module.getModule(), getCourse());
            new Question("Which required element should have main information the sender wants to transmit to the receiver?", "Body", ++count, module.getModule(), getCourse());
            new Question("What is a common SOAP issue faced when implementing security in distributed systems?", "Crossing Trust Domains", ++count, module.getModule(), getCourse());
            new Question("Which SOAP attribute specifies whether it is mandatory or optional that a message receiver understands and processes the content of a SOAP header block?", "mustUnderstand", ++count, module.getModule(), getCourse());
            new Question("Which SOAP attribute carries an URI value that names the recipient of a header block?", "role", ++count, module.getModule(), getCourse());
            new Question("Which SOAP attribute indicates the encoding rules used to serialize parts of SOAP message and can only have values ‘1’ or ‘0’ (or, ‘true’ or ‘false’)?", "encodingStyle", ++count, module.getModule(), getCourse());
            new Question("Which SOAP attributes are intended to be usable via qualified attribute names on any complex type referencing them?", "Global", ++count, module.getModule(), getCourse());
        }
    }

    // Module 8: SOAP Attachments
    private static class ModuleEight {

        private final Module module;
        private int count = 0;

        public ModuleEight() {
            module = new Module();
            module.setModule(8);
            allModules().add(module);
        }

        public void questions(){
            new Question("What is a method fo efficiently sending binary data to and from Web Services?", "MTOM", ++count, module.getModule(), getCourse());
            new Question("What is a mechanism defined for the serialization and deserialization XML Information Sets?", "XOP", ++count, module.getModule(), getCourse());
            new Question("What do you also call XML information sets?", "infosets", ++count, module.getModule(), getCourse());
            new Question("Which Java class represents a persistent set of properties and can be saved to and loaded from a stream?", "Properties", ++count, module.getModule(), getCourse());
            new Question("Which parent class is Properties belonging to?", "Hashtable", ++count, module.getModule(), getCourse());
            new Question("True | False, multiple threads can share a single Properties object without the need of external synchronization.", "True", ++count, module.getModule(), getCourse());
            new Question("What is a standard Java API to produce and consume messages conforming SOAP specifications?", "SAAJ", ++count, module.getModule(), getCourse());
        }
    }

    // Module 9: Microservices
    private static class ModuleNine {

        private final Module module;
        private int count = 0;

        public ModuleNine() {
            module = new Module();
            module.setModule(9);
            allModules().add(module);
        }

        public void questions(){
            new Question("What involves fitting together resources and systems from diverse organizations?", "Distributed Software Systems", ++count, module.getModule(), getCourse());
            new Question("What are enumerated as services, organized into logical domains, and somehow managed ", "", ++count, module.getModule(), getCourse());
            new Question("What do you call functions that could range from processing an order, authenticating users into a web app, or updating a customer's mailing address?", "Business Functions", ++count, module.getModule(), getCourse());
            new Question("Which Web Service flavor supports only simple request/ response operations?", "Type 1", ++count, module.getModule(), getCourse());
            new Question("Which Web Service flavor implements some form of coordination between inbound and outbound operations?", "Type 2", ++count, module.getModule(), getCourse());
            new Question("What do you call call the Type 2 flavor?", "Complex", ++count, module.getModule(), getCourse());
            new Question("What provides deployment and a run-time support environment that makes a web service highly distributed?", "Service Container", ++count, module.getModule(), getCourse());
            new Question("Where does the Service Provider publish the Web Service?", "Service Registry", ++count, module.getModule(), getCourse());
            new Question("Where does the Service Client find the Web Service?", "Service Registry", ++count, module.getModule(), getCourse());
            new Question("What is the first operation when publishing a Web Service?", "Describing", ++count, module.getModule(), getCourse());
            new Question("What is the second operation when publishing a Web Service?", "Registration", ++count, module.getModule(), getCourse());
            new Question("What is the first operation when finding a Web Service?", "Discovering", ++count, module.getModule(), getCourse());
            new Question("What is the second operation when finding a Web Service?", "Selecting", ++count, module.getModule(), getCourse());
            new Question("What is the final operation in the Web Services architecture?", "Invocation", ++count, module.getModule(), getCourse());
            new Question("Which operation is it when the Service Requestor invokes or initiates an interaction at run-time?", "Binding", ++count, module.getModule(), getCourse());
            new Question("Where do you locate and contract the Binding Details", "Service Description", ++count, module.getModule(), getCourse());
            new Question("What is the Physical Manifestation of the abstract service endpoint that's providing the implementation of the service interface?", "Service Container", ++count, module.getModule(), getCourse());
            new Question("What acts as an application Service Provider and as a Service Requestor?", "Service Aggregator", ++count, module.getModule(), getCourse());
            new Question("What are trusted parties that force Service Providers to adhere to information practices that comply with privacy law regulations, or in the abgense of such laws, industry best practices?", "Service Brokers", ++count, module.getModule(), getCourse());
            new Question("In microservice architecture, what are processes that communicate with each other over the network in order to fulfill a goal?", "Services", ++count, module.getModule(), getCourse());
            new Question("What is a variant of the service-oriented architecture (SOA) architectural style that structures an application as a collection of loosely coupled services.", "Microservices", ++count, module.getModule(), getCourse());
            new Question("True | False, each microservice should be independently deployable.", "True", ++count, module.getModule(), getCourse());
            new Question("True | False, microservices don't need to be loosely coupled with one another.", "False", ++count, module.getModule(), getCourse());
            new Question("True | False, each service unit of the entire application should be the smallest and capable of delivering one specific business goal.", "True", ++count, module.getModule(), getCourse());
            new Question("What are a set of subroutine definitions, communication protocols, and tools for building software", "APIs", ++count, module.getModule(), getCourse());
        }
    }

    public void release(boolean shuffle){
        moduleOne.questions();
        moduleTwo.questions();
        moduleThree.questions();
        moduleFour.questions();
        moduleFive.questions();
        moduleSix.questions();
        moduleSeven.questions();
        if (shuffle) Collections.shuffle(allQuestions());
    }
}
