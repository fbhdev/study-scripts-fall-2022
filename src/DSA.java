import java.util.Collections;

public class DSA extends Course{

    private static final Course course = new Course();
    private static ModuleOne moduleOne;
    private static ModuleTwo moduleTwo;
    private static ModuleThree moduleThree;
    private static ModuleFour moduleFour;
    private static ModuleFive moduleFive;
    private static ModuleSix moduleSix;

    public DSA(){
        moduleOne = new ModuleOne();
        moduleTwo = new ModuleTwo();
        moduleThree = new ModuleThree();
        moduleFour = new ModuleFour();
        moduleFive = new ModuleFive();
        moduleSix = new ModuleSix();
        course.setCourse("Data Structures and Algorithms");
    }

    static class ModuleOne {

        private final Module module;
        public ModuleOne(){
            module = new Module();
            module.setModule(1);
            course.allModules().add(module);
        }

        public void questions() {
            new Question("What do you call the name of a class, method or variable in Java?", "identifier", 1, module.getModule(), course.getCourse());
            new Question("True | False, Strings of the primitive type in Java?", "False", 2, module.getModule(), course.getCourse());
            new Question("What do you call the primary actors in Java?", "Objects", 3, module.getModule(), course.getCourse());
            new Question("What are blocks of code that can be called to perform actions?", "Methods", 4, module.getModule(), course.getCourse());
            new Question("Which operator returns a reference to the newly created instance; the returned reference is typically assigned to a variable for further use?", "new", 5, module.getModule(), course.getCourse());
            new Question("What are the default values for reference variables?", "null", 6, module.getModule(), course.getCourse());
            new Question("Which modifiers control the level of access that the defining class grants to other classes in the context of a larger Java program?", "Access Control Modifiers", 7, module.getModule(), course.getCourse());
            new Question("Which class modifier designates that all classes may access the defined aspect?", "Public", 8, module.getModule(), course.getCourse());
            new Question("True | False, classes that are designated as subclasses of the given class cannot be accessed with the Protected class modifier.", "False", 9, module.getModule(), course.getCourse());
            new Question("Which modifier designates that access to a defined member of a class be granted only to code within that class?", "Private", 10, module.getModule(), course.getCourse());
            new Question("Which modifier is used to store global information about a class, as in its value is associated with the class as a whole, rather than with each individual instance of that class?", "Static", 11, module.getModule(), course.getCourse());
            new Question("Which modifier means that a method's or class's signature is provided but without an implementation of the method body?", "Abstract", 12, module.getModule(), course.getCourse());
            new Question("Which modifier can be initialized as part of that declaration, but can never again be assigned a new value?", "Final", 13, module.getModule(), course.getCourse());
            new Question("What defines the name and parameters for a method?", "Signature", 14, module.getModule(), course.getCourse());
            new Question("Which keyword must be used when a method does not return a value?", "void", 15, module.getModule(), course.getCourse());
            new Question("Are all objects passed by value or reference?", "Value", 16, module.getModule(), course.getCourse());
            new Question("What does it mean when Java makes a copy in memory of the parameter’s value, or a copy of the contents of the parameter?", "Pass by Value", 16, module.getModule(), course.getCourse());
            new Question("What does it mean when Java stores a copy of the address to the parameter rather than the value itself?", "Pass by Reference", 17, module.getModule(), course.getCourse());
            new Question("What is a special kind of method that is used to initialize a newly created instance of the class so that it will be in a consistent and stable initial state?", "Constructor", 18, module.getModule(), course.getCourse());
            new Question("True | False, constructors can be static, abstract or final.", "False", 19, module.getModule(), course.getCourse());
            new Question("True | False, constructors can be Protected or Private", "True", 20, module.getModule(), course.getCourse());
            new Question("When a class has multiple constructors, what must be different for each individual constructor?", "Signature", 21, module.getModule(), course.getCourse());
            new Question("True | False, you can use the keyword \"this\" in the body of a static method.", "False", 22, module.getModule(), course.getCourse());
            new Question("Which keyword refers to the object known as thing in the caller’s context?", "This", 23, module.getModule(), course.getCourse());
            new Question("What means that once an instance is created and initialized, the value of that instance cannot be changed?", "Immutable", 24, module.getModule(), course.getCourse());
            new Question("What is the process of implicitly converting between base types and their wrapper types?", "Automatic Boxing and Unboxing", 25, module.getModule(), course.getCourse());
            new Question("What is a special class representing static constants with the final keyword?", "Enums", 26, module.getModule(), course.getCourse());
            new Question("What involves the use of literals, variables, and operators?", "Expressions", 27, module.getModule(), course.getCourse());
            new Question("What is any “constant” value that can be used in an assignment or other expression?", "Literals", 28, module.getModule(), course.getCourse());
            new Question("What is an operation that allows us to change the type of a value?", "Casting", 29, module.getModule(), course.getCourse());
            new Question("Which loop allows the boolean condition to be checked at the end of each pass of the loop rather than before each pass?", "Do-While", 30, module.getModule(), course.getCourse());
            new Question("Which statement causes the execution to skip over the remaining steps of the current iteration of the loop body, but then, unlike the break statement, the flow of control returns to the top of the loop, assuming its condition remains satisfied?", "Continue", 31, module.getModule(), course.getCourse());
        }
    }

    static class ModuleTwo {

        private final Module module;
        public ModuleTwo(){
            module = new Module();
            module.setModule(2);
            course.allModules().add(module);
        }

        public void questions() {
            new Question("What is the Object-Oriented design goal that is, capable of handling unexpected inputs that are not explicitly defined for its application?", "Robustness", 1, module.getModule(), course.getCourse());
            new Question("Because modern software applications are used for many years, what is the Object-Oriented design goal specifying that software needs to be able to evolve over time in response to changing conditions in its environment?", "Adaptability", 2, module.getModule(), course.getCourse());
            new Question("Which Object-Oriented design goal says the same code should be usable as a component of different systems in various applications?", "Reusability", 3, module.getModule(), course.getCourse());
            new Question("What do you call the notion of distilling a complicated system down to its most funda- mental parts?", "Abstraction", 4, module.getModule(), course.getCourse());
            new Question("What is a mathematical model of a data structure that specifies the type of data stored, the operations sup- ported on them, and the types of parameters of the operations?", "Abstract Data Type", 5, module.getModule(), course.getCourse());
            new Question("Which Object-Oriented principle says different components of a software system should not reveal the internal details of their respective implementations?", "Encapsulation", 6, module.getModule(), course.getCourse());
            new Question("Which Object-Oriented principle refers to an organizing principle in which different components of a software system are divided into separate functional units?", "Modularity", 7, module.getModule(), course.getCourse());
            new Question("In Object-Oriented programming, what do you call the mechanism for a modular and hierarchical organization?", "Inheritance", 8, module.getModule(), course.getCourse());
            new Question("True | False, a constructor for a subclass not making an explicit call to super or this as its first command will still have it called implicitly behind the scenes.", "True", 9, module.getModule(), course.getCourse());
            new Question("What refers to the ability of a reference variable to take different forms?", "Polymorphism", 10, module.getModule(), course.getCourse());
            new Question("What states that a variable (or parameter) with a declared type can be assigned an instance from any direct or indirect subclass of that type?", "Liskov Substitution Principle", 11, module.getModule(), course.getCourse());
            new Question("What is the name of the process deciding at runtime to call the ver- sion of the method that is most specific to the actual type of the referenced object (not the declared type)?", "Dynamic Dispatch", 12, module.getModule(), course.getCourse());
            new Question("What determines the next number by adding a fixed constant to the previous value?", "Arithmetic Progression", 13, module.getModule(), course.getCourse());
            new Question("What determines the next number by multiplying the previous value by a fixed constant?", "Geometric Progression", 14, module.getModule(), course.getCourse());
            new Question("What are collection of method declarations with no data and no bodies?", "Interfaces", 15, module.getModule(), course.getCourse());
            new Question("What is the ability of extending from more than one type?", "Multiple Inheritance", 16, module.getModule(), course.getCourse());
            new Question("True | False, multiple inheritance is allowed for both interfaces and classes.", "", 17, module.getModule(), course.getCourse());
            new Question("Which keyword prepares users about the possibility of an exceptional case, so that they might be better prepared to handle an exception that may arise?", "Throws", 18, module.getModule(), course.getCourse());
            new Question("What are typically thrown only by the Java Virtual Machine and designate the most serious situations that are unlikely to be recoverable, such as when the virtual machine is asked to execute a corrupt class file, or when the system runs out of memory?", "Errors", 19, module.getModule(), course.getCourse());
            new Question("Which conversion is automatically performed to store the result of an expression into a variable, without the need for an explicit cast?", "Widening", 20, module.getModule(), course.getCourse());
            new Question("Which conversion requires an explicit cast?", "Narrowing", 21, module.getModule(), course.getCourse());
            new Question("Which operator allows us to test whether an object variable is referring to an object that belongs to a particular type?", "instanceof", 22, module.getModule(), course.getCourse());
            new Question("?", "", 23, module.getModule(), course.getCourse());
            new Question("", "", 24, module.getModule(), course.getCourse());
            new Question("", "", 25, module.getModule(), course.getCourse());
        }
    }


    static class ModuleThree {

        private final Module module;

        public ModuleThree() {
            module = new Module();
            module.setModule(3);
            course.allModules().add(module);
        }

        public void questions() {
            new Question("What is the time complexity of the add method in a linked list?", "O(1)", 1, module.getModule(), course.getCourse());
            new Question("What is the time complexity of accessing a linked list item?", "O(n)", 2, module.getModule(), course.getCourse());
            new Question("What is the time complexity to count the number of elements in the linked list?", "O(n)", 3, module.getModule(), course.getCourse());
            new Question("What is the worst case time complexity of inserting a node in a doubly linked list?", "O(1)", 4, module.getModule(), course.getCourse());
            new Question("", "", 5, module.getModule(), course.getCourse());
            new Question("", "", 6, module.getModule(), course.getCourse());
            new Question("", "", 7, module.getModule(), course.getCourse());
            new Question("", "", 8, module.getModule(), course.getCourse());
        }
    }

    static class ModuleFour {

        private final Module module;

        public ModuleFour() {
            module = new Module();
            module.setModule(4);
            course.allModules().add(module);
        }

        public void questions() {
            new Question("", "", 1, module.getModule(), course.getCourse());
            new Question("", "", 2, module.getModule(), course.getCourse());
            new Question("", "", 3, module.getModule(), course.getCourse());
            new Question("", "", 4, module.getModule(), course.getCourse());
            new Question("", "", 5, module.getModule(), course.getCourse());
            new Question("", "", 6, module.getModule(), course.getCourse());
            new Question("", "", 7, module.getModule(), course.getCourse());
            new Question("", "", 8, module.getModule(), course.getCourse());
        }
    }

    static class ModuleFive {

        private final Module module;

        public ModuleFive() {
            module = new Module();
            module.setModule(5);
            course.allModules().add(module);
        }

        public void questions() {
            new Question("Which principle does a Queue follow?", "FIFO", 1, module.getModule(), course.getCourse());
            new Question("Which principle does a Stack follow?", "LIFO", 2, module.getModule(), course.getCourse());
            new Question("Inserting in a Queue is known as?", "Enqueue", 3, module.getModule(), course.getCourse());
            new Question("Deletion in a Queue is known as?", "Dequeue", 4, module.getModule(), course.getCourse());
            new Question("What is the time complexity of the pop() operation when the Stack is implemented using an array?", "O(n)", 5, module.getModule(), course.getCourse());
            new Question("", "", 6, module.getModule(), course.getCourse());
            new Question("", "", 7, module.getModule(), course.getCourse());
            new Question("", "", 8, module.getModule(), course.getCourse());
        }
    }

    static class ModuleSix {

        private final Module module;

        public ModuleSix() {
            module = new Module();
            module.setModule(6);
            course.allModules().add(module);
        }

        public void questions() {
            new Question("In Arraylists, what is the worst case running time for adding an item in an Array-based?", "O(n)", 1, module.getModule(), course.getCourse());
            new Question("Java’s ArrayList class provides a more robust abstraction in allowing a user to add elements to the list with no apparent limit on the overall capacity. Name the algorithmic sleight of hand known to make this happen.", "Dynamic Array", 2, module.getModule(), course.getCourse());
            new Question("In Array-based Arraylists, by which factor would you increase the capacity when existing array that has been filled?", "Twice", 3, module.getModule(), course.getCourse());
            new Question("True | False, A series of push operations on an initially empty dynamic array more efficient in terms of its total running time?", "True", 4, module.getModule(), course.getCourse());
            new Question("Name the algorithmic design pattern showing that performing a sequence of push operations on a dynamic array is quite efficient.", "Amortization", 5, module.getModule(), course.getCourse());
            new Question("What happens when a constant number of additional cells are reserved each time an array is resized?", "Arithmetic Progression", 6, module.getModule(), course.getCourse());
            new Question("In array-based sequences, what provides an excellent description of the location of an element, or the location at which an insertion or deletion should take place?", "integer indices", 7, module.getModule(), course.getCourse());
            new Question("What are lists that allows you to add, remove, insert, and sort elements within the list?", "Positional Lists", 8, module.getModule(), course.getCourse());
            new Question("What acts as a marker or token within a broader positional list?", "Position", 9, module.getModule(), course.getCourse());
            new Question("Which value is returned when the before method is invoked at the front of the list, or when first or last methods are called upon an empty list?", "null", 10, module.getModule(), course.getCourse());
            new Question("What is Positional List ideally implemented with?", "Doubly Linked List", 11, module.getModule(), course.getCourse());
            new Question("True | False, In array-based positional lists, we have to shift position objects to make room for the new position to fill in the hole crested by the removal of the old position.", "True", 12, module.getModule(), course.getCourse());
            // iterators below
            new Question("What is a software design pattern that abstracts the process of scanning through a sequence of elements, one element at a time?", "Iterators", 13, module.getModule(), course.getCourse());
            new Question("What do you call the iterator maintaining its own private copy of the sequence of elements, which is constructed at the time the iterator object is created?", "Snapshot Iterator", 14, module.getModule(), course.getCourse());
            new Question("What do you call the iterator that does not make an upfront copy–instead performing a piecewise traversal of the primary structure only when the next() method is called to request another element?", "Lazy Iterator", 15, module.getModule(), course.getCourse());
            new Question("What thread-safe support do robust Collections classes provide?", "Concurrency", 16, module.getModule(), course.getCourse());
            new Question("What do for loops call to move to the next object?", "Iterators", 17, module.getModule(), course.getCourse());
            new Question("How many methods do iterators have?", "2", 18, module.getModule(), course.getCourse());
        }
    }

    public void release(boolean shuffle){
        moduleOne.questions();
        moduleTwo.questions();
        moduleThree.questions();
        moduleFour.questions();
        moduleFive.questions();
        moduleSix.questions();
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
