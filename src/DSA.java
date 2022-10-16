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

    // Module 1 – Java/Object-Oriented Programming Review
    static class ModuleOne {

        private final Module module;
        private int count = 1;

        public ModuleOne(){
            module = new Module();
            module.setModule(1);
            course.allModules().add(module);
        }

        public void questions() {
            new Question("What do you call the name of a class, method or variable in Java?", "identifier", count++, module.getModule(), course.getCourse());
            new Question("True | False, Strings of the primitive type in Java?", "False", count++, module.getModule(), course.getCourse());
            new Question("What do you call the primary actors in Java?", "Objects", count++, module.getModule(), course.getCourse());
            new Question("What are blocks of code that can be called to perform actions?", "Methods", count++, module.getModule(), course.getCourse());
            new Question("Which operator returns a reference to the newly created instance; the returned reference is typically assigned to a variable for further use?", "new", count++, module.getModule(), course.getCourse());
            new Question("What are the default values for reference variables?", "null", count++, module.getModule(), course.getCourse());
            new Question("Which modifiers control the level of access that the defining class grants to other classes in the context of a larger Java program?", "Access Control Modifiers", count++, module.getModule(), course.getCourse());
            new Question("Which class modifier designates that all classes may access the defined aspect?", "Public", count++, module.getModule(), course.getCourse());
            new Question("True | False, classes that are designated as subclasses of the given class cannot be accessed with the Protected class modifier.", "False", count++, module.getModule(), course.getCourse());
            new Question("Which modifier designates that access to a defined member of a class be granted only to code within that class?", "Private", count++, module.getModule(), course.getCourse());
            new Question("Which modifier is used to store global information about a class, as in its value is associated with the class as a whole, rather than with each individual instance of that class?", "Static", count++, module.getModule(), course.getCourse());
            new Question("Which modifier means that a method's or class's signature is provided but without an implementation of the method body?", "Abstract", count++, module.getModule(), course.getCourse());
            new Question("Which modifier can be initialized as part of that declaration, but can never again be assigned a new value?", "Final", count++, module.getModule(), course.getCourse());
            new Question("What defines the name and parameters for a method?", "Signature", count++, module.getModule(), course.getCourse());
            new Question("Which keyword must be used when a method does not return a value?", "void", count++, module.getModule(), course.getCourse());
            new Question("Are all objects passed by value or reference?", "Value", count++, module.getModule(), course.getCourse());
            new Question("What does it mean when Java makes a copy in memory of the parameter’s value, or a copy of the contents of the parameter?", "Pass by Value", count++, module.getModule(), course.getCourse());
            new Question("What does it mean when Java stores a copy of the address to the parameter rather than the value itself?", "Pass by Reference", count++, module.getModule(), course.getCourse());
            new Question("What is a special kind of method that is used to initialize a newly created instance of the class so that it will be in a consistent and stable initial state?", "Constructor", count++, module.getModule(), course.getCourse());
            new Question("True | False, constructors can be static, abstract or final.", "False", count++, module.getModule(), course.getCourse());
            new Question("True | False, constructors can be Protected or Private", "True", count++, module.getModule(), course.getCourse());
            new Question("When a class has multiple constructors, what must be different for each individual constructor?", "Signature", count++, module.getModule(), course.getCourse());
            new Question("True | False, you can use the keyword \"this\" in the body of a static method.", "False", count++, module.getModule(), course.getCourse());
            new Question("Which keyword refers to the object known as thing in the caller’s context?", "This", count++, module.getModule(), course.getCourse());
            new Question("What means that once an instance is created and initialized, the value of that instance cannot be changed?", "Immutable", count++, module.getModule(), course.getCourse());
            new Question("What is the process of implicitly converting between base types and their wrapper types?", "Automatic Boxing and Unboxing", count++, module.getModule(), course.getCourse());
            new Question("What is a special class representing static constants with the final keyword?", "Enums", count++, module.getModule(), course.getCourse());
            new Question("What involves the use of literals, variables, and operators?", "Expressions", count++, module.getModule(), course.getCourse());
            new Question("What is any “constant” value that can be used in an assignment or other expression?", "Literals", count++, module.getModule(), course.getCourse());
            new Question("What is an operation that allows us to change the type of a value?", "Casting", count++, module.getModule(), course.getCourse());
            new Question("Which loop allows the boolean condition to be checked at the end of each pass of the loop rather than before each pass?", "Do-While", count++, module.getModule(), course.getCourse());
            new Question("Which statement causes the execution to skip over the remaining steps of the current iteration of the loop body, but then, unlike the break statement, the flow of control returns to the top of the loop, assuming its condition remains satisfied?", "Continue", count++, module.getModule(), course.getCourse());
            new Question("What is the Object-Oriented design goal that is, capable of handling unexpected inputs that are not explicitly defined for its application?", "Robustness", count++, module.getModule(), course.getCourse());
            new Question("Because modern software applications are used for many years, what is the Object-Oriented design goal specifying that software needs to be able to evolve over time in response to changing conditions in its environment?", "Adaptability", count++, module.getModule(), course.getCourse());
            new Question("Which Object-Oriented design goal says the same code should be usable as a component of different systems in various applications?", "Reusability", count++, module.getModule(), course.getCourse());
            new Question("What do you call the notion of distilling a complicated system down to its most funda- mental parts?", "Abstraction", count++, module.getModule(), course.getCourse());
            new Question("What is a mathematical model of a data structure that specifies the type of data stored, the operations sup- ported on them, and the types of parameters of the operations?", "Abstract Data Type", count++, module.getModule(), course.getCourse());
            new Question("Which Object-Oriented principle says different components of a software system should not reveal the internal details of their respective implementations?", "Encapsulation", count++, module.getModule(), course.getCourse());
            new Question("Which Object-Oriented principle refers to an organizing principle in which different components of a software system are divided into separate functional units?", "Modularity", count++, module.getModule(), course.getCourse());
            new Question("In Object-Oriented programming, what do you call the mechanism for a modular and hierarchical organization?", "Inheritance", count++, module.getModule(), course.getCourse());
            new Question("True | False, a constructor for a subclass not making an explicit call to super or this as its first command will still have it called implicitly behind the scenes.", "True", count++, module.getModule(), course.getCourse());
            new Question("What refers to the ability of a reference variable to take different forms?", "Polymorphism", count++, module.getModule(), course.getCourse());
            new Question("What states that a variable (or parameter) with a declared type can be assigned an instance from any direct or indirect subclass of that type?", "Liskov Substitution Principle", count++, module.getModule(), course.getCourse());
            new Question("What is the name of the process deciding at runtime to call the ver- sion of the method that is most specific to the actual type of the referenced object (not the declared type)?", "Dynamic Dispatch", count++, module.getModule(), course.getCourse());
            new Question("What determines the next number by adding a fixed constant to the previous value?", "Arithmetic Progression", count++, module.getModule(), course.getCourse());
            new Question("What determines the next number by multiplying the previous value by a fixed constant?", "Geometric Progression", count++, module.getModule(), course.getCourse());
            new Question("What are collection of method declarations with no data and no bodies?", "Interfaces", count++, module.getModule(), course.getCourse());
            new Question("What is the ability of extending from more than one type?", "Multiple Inheritance", count++, module.getModule(), course.getCourse());
            new Question("True | False, multiple inheritance is allowed for both interfaces and classes.", "", count++, module.getModule(), course.getCourse());
            new Question("Which keyword prepares users about the possibility of an exceptional case, so that they might be better prepared to handle an exception that may arise?", "Throws", count++, module.getModule(), course.getCourse());
            new Question("What are typically thrown only by the Java Virtual Machine and designate the most serious situations that are unlikely to be recoverable, such as when the virtual machine is asked to execute a corrupt class file, or when the system runs out of memory?", "Errors", count++, module.getModule(), course.getCourse());
            new Question("Which conversion is automatically performed to store the result of an expression into a variable, without the need for an explicit cast?", "Widening", count++, module.getModule(), course.getCourse());
            new Question("Which conversion requires an explicit cast?", "Narrowing", count++, module.getModule(), course.getCourse());
            new Question("Which operator allows us to test whether an object variable is referring to an object that belongs to a particular type?", "instanceof", count++, module.getModule(), course.getCourse());
            new Question("Which keyword can help restrict a formal parameter type in generics?", "extends", count++, module.getModule(), course.getCourse());
            new Question("Which nested class is most like a traditional class; its instances have no association with any specific instance of the outer class?", "Static Nested Class", count++, module.getModule(), course.getCourse());
            new Question("Which nested class has access to other members of the enclosing class, even if they are declared private?", "Inner Class", count++, module.getModule(), course.getCourse());
        }
    }
    // Module 2 – Linked Lists
    static class ModuleTwo {

        private final Module module;
        private int count = 1;

        public ModuleTwo() {
            module = new Module();
            module.setModule(2);
            course.allModules().add(module);
        }

        public void questions() {
            new Question("When an array is instantiated in memory, what are its default values?", "null", count++, module.getModule(), course.getCourse());
            new Question("Which algorithm proceeds by considering one element at a time, placing the element in the correct order relative to those before it?", "Insertion-Sort", count++, module.getModule(), course.getCourse());
            new Question("In Java, are Arrays mutable or immutable objects?", "Mutable", count++, module.getModule(), course.getCourse());
            new Question("What do you call a collection of nodes that collectively form a linear sequence?", "Linked List", count++, module.getModule(), course.getCourse());
            new Question("Which Linked List says each node stores a reference to an object that is an element of the sequence, as well as a reference to the next node of the list?", "Singly Linked List", count++, module.getModule(), course.getCourse());
            new Question("What do you call the reference to the first node of the Linked List?", "Head", count++, module.getModule(), course.getCourse());
            new Question("What do you call the last node in a Linked List?", "Tail", count++, module.getModule(), course.getCourse());
            new Question("What is the process of identifying the tail as the node having null as its next reference?", "Link Hopping", count++, module.getModule(), course.getCourse());
            new Question("Name the algorithm in which Operating Systems allow processes to effectively share use of the CPUs.", "Round-Robin Scheduling", count++, module.getModule(), course.getCourse());
            new Question("What is the structure which is essentially a singularly linked list in which the next reference of the tail node is set to refer back to the head of the list ?", "Circularly Linked List", count++, module.getModule(), course.getCourse());
            new Question("What is a Linked List in which each node keeps an explicit reference to the node before it and a reference to the node after it?", "Doubly Linked List", count++, module.getModule(), course.getCourse());
            new Question("What common name do you call the special nodes at both ends of the Linked List?", "Sentinels", count++, module.getModule(), course.getCourse());
            new Question("Which method can be used to produce what is known as a shallow copy of an object?", "Clone", count++, module.getModule(), course.getCourse());
            new Question("In copies, what means that no new memory allocation happens for the other entities, and the only reference is copied to the other entities?", "Shallow Copy", count++, module.getModule(), course.getCourse());
            new Question("In copies, what means that a new memory allocation happens for the other entities, and reference is not copied to the other entities?", "Deep Copy", count++, module.getModule(), course.getCourse());
            new Question("What is the time complexity of accessing a Linked List node?", "O(n)", count++, module.getModule(), course.getCourse());
            new Question("What is the time complexity of searching a Linked List node?", "O(n)", count++, module.getModule(), course.getCourse());
            new Question("What is the time complexity of adding a node to aLinked List?", "O(1)", count++, module.getModule(), course.getCourse());
            new Question("What is the time complexity of removing a node from a Linked List?", "O(1)", count++, module.getModule(), course.getCourse());
            new Question("What is the time complexity to getting the length of a Linked List?", "O(n)", count++, module.getModule(), course.getCourse());
            new Question("What is the time complexity of accessing a Doubly Linked List node?", "O(n)", count++, module.getModule(), course.getCourse());
            new Question("What is the time complexity of searching a Doubly Linked List node?", "O(n)", count++, module.getModule(), course.getCourse());
            new Question("What is the time complexity of inserting a node in a Doubly Linked List?", "O(1)", count++, module.getModule(), course.getCourse());
            new Question("What is the time complexity of deleting a node in a Doubly Linked List?", "O(1)", count++, module.getModule(), course.getCourse());
        }
    }

    // Module 3 – Algorithm Analysis
    static class ModuleThree {

        private final Module module;
        private int count = 1;

        public ModuleThree() {
            module = new Module();
            module.setModule(3);
            course.allModules().add(module);
        }

        public void questions() {
            new Question("What is a systematic way of organizing and accessing data?", "Data Structure", count++, module.getModule(), course.getCourse());
            new Question("What is a step-by-step procedure for performing some task in a finite amount of time?", "Algorithm", count++, module.getModule(), course.getCourse());
            new Question("What corresponds to a low-level instruction with an execution time that is constant?", "Primitive Operation", count++, module.getModule(), course.getCourse());
            new Question("What requires that algorithms do well on every input, thus making it the standard for success?", "Worst-case analysis", count++, module.getModule(), course.getCourse());
            new Question("Which function is useful in algorithm analysis because it characterizes the number of steps needed to do a basic operation on a computer, like adding two numbers, assigning a value to a variable, or comparing two numbers?", "Constant", count++, module.getModule(), course.getCourse());
            new Question("Name the algorithmic function that is the inverse of power.", "Logarithm", count++, module.getModule(), course.getCourse());
            new Question("Which function arises in algorithm analysis any time we have to do a single basic operation for each of n elements?", "Linear", count++, module.getModule(), course.getCourse());
            new Question("Which function grows a little more rapidly than the linear function and a lot less rapidly than the quadratic function?", "n-log-n", count++, module.getModule(), course.getCourse());
            new Question("What is the function when an inner loop performs a linear number of operations and the other loop a linear number of times?", "Quadratic", count++, module.getModule(), course.getCourse());
            new Question("Which function assigns to an input value n the product of n with itself 3 times?", "Cubic", count++, module.getModule(), course.getCourse());
            new Question("What are algebraic expressions that consist of variables and coefficients?", "Polynomials", count++, module.getModule(), course.getCourse());
            new Question("What is the numerical factor of a term containing constant and variables?", "Coefficients", count++, module.getModule(), course.getCourse());
            new Question("Which notation gives us a shorthand way of expressing sums of increasing terms that have a regular structure?", "Summation", count++, module.getModule(), course.getCourse());
            new Question("Which function assigns to the input argument n the value obtained by multiplying the base by itself n times?", "Exponential", count++, module.getModule(), course.getCourse());
            new Question("What refers to computing the running time of any operation in mathematical units of computation?", "Asymptotic Analysis", count++, module.getModule(), course.getCourse());
            new Question("Which notation is used for analyzing the best-case complexity of an algorithm?", "Omega", count++, module.getModule(), course.getCourse());
            new Question("Which notation is used for analyzing the average-case complexity of an algorithm?", "Theta", count++, module.getModule(), course.getCourse());
            new Question("Which notation is used for analyzing the worst-case complexity of an algorithm?", "Big-O", count++, module.getModule(), course.getCourse());
            new Question("What is the Big-Theta of -> f(n) = nlog(n) + n^2 + n^3log(n)?", "O(n^3log(n))", count++, module.getModule(), course.getCourse());
            new Question("What is the Big-O of -> f(n) = nlog(n) + n^2 + n^3log(n)?", "O(n^4)", count++, module.getModule(), course.getCourse());
            new Question("What is the slowest run time?", "O(n!)", count++, module.getModule(), course.getCourse());
            new Question("What is the worst case for Bubble Sort?", "O(n^2)", count++, module.getModule(), course.getCourse());
            new Question("What is the worst case for Insertion Sort?", "O(n^2)", count++, module.getModule(), course.getCourse());
        }
    }

    // Module 4 – Recursion
    static class ModuleFour {

        private final Module module;
        private int count = 1;

        public ModuleFour() {
            module = new Module();
            module.setModule(4);
            course.allModules().add(module);
        }

        public void questions() {
            new Question("What is any function that calls an instance of itself?", "Recursion", count++, module.getModule(), course.getCourse());
            new Question("In Java, what stores the parameters and local variables specific to a given call of the method, and information about which command in the body of the method is currently executing?", "Activation Frame", count++, module.getModule(), course.getCourse());
            new Question("Which algorithm follows the divide and conquer approach in which the list is divided into two halves, and the item is compared with the middle element of the list?", "Binary Search", count++, module.getModule(), course.getCourse());
            new Question("Which recursive method is designed so that each invocation of the body makes at most one new recursive call?", "Linear Recursion", count++, module.getModule(), course.getCourse());
            new Question("What is the time complexity for the Binary Search algorithm?", "O(log(n)", count++, module.getModule(), course.getCourse());
            new Question("What do you call a method making two recursive calls?", "Binary Recursion", count++, module.getModule(), course.getCourse());
            new Question("What is the process in which a method may make more than two recursive calls?", "Multiple Recursion", count++, module.getModule(), course.getCourse());
            new Question("What stops the recursion from continuing on forever?", "Base Case", count++, module.getModule(), course.getCourse());
            new Question("What is a quick solution to the Element Uniqueness Problem in an Array?", "Sort", count++, module.getModule(), course.getCourse());
            new Question("What can quickly swamp computing resources, not only due to rapid use of the CPU, but because each successive call creates a frame requiring additional memory?", "Infinite Recursion", count++, module.getModule(), course.getCourse());
            new Question("What is a type of buffer overflow error that occurs when a computer program tries to use more memory space in the call stack than has been allocated to that stack?", "Stack Overflow", count++, module.getModule(), course.getCourse());
            new Question("What is defined as a recursive function in which the recursive call is the last statement that is executed by the function?", "Tail Recursion", count++, module.getModule(), course.getCourse());
            new Question("What does Tail Recursion reduce?", "Stack Frames", count++, module.getModule(), course.getCourse());
            new Question("True | False, In languages like Java, recursion is typically less expensive than iteration.", "False", count++, module.getModule(), course.getCourse());
        }
    }


    // Module 5 – Stacks and Queues
    static class ModuleFive {

        private final Module module;
        private int count = 1;

        public ModuleFive() {
            module = new Module();
            module.setModule(5);
            course.allModules().add(module);
        }

        public void questions() {
            new Question("Which principle does a Queue follow?", "FIFO", count++, module.getModule(), course.getCourse());
            new Question("Which principle does a Stack follow?", "LIFO", count++, module.getModule(), course.getCourse());
            new Question("Inserting in a Queue is known as?", "Enqueue", count++, module.getModule(), course.getCourse());
            new Question("Deletion in a Queue is known as?", "Dequeue", count++, module.getModule(), course.getCourse());
            new Question("What is the time complexity of the pop() operation when the Stack is implemented using an array?", "O(n)", count++, module.getModule(), course.getCourse());
            new Question("What is the time complexity of accessing a Stack item?", "O(n)", count++, module.getModule(), course.getCourse());
            new Question("What is the time complexity of searching a Stack?", "O(n)", count++, module.getModule(), course.getCourse());
            new Question("What is the time complexity of pushing an item to a Stack?", "O(1)", count++, module.getModule(), course.getCourse());
            new Question("What is the time complexity of popping a Stack item?", "O(1)", count++, module.getModule(), course.getCourse());
            new Question("What is the time complexity of accessing a Queue item?", "O(n)", count++, module.getModule(), course.getCourse());
            new Question("What is the time complexity of searching a Queue item?", "O(n)", count++, module.getModule(), course.getCourse());
            new Question("What is the time complexity of enqueuing an item?", "O(1)", count++, module.getModule(), course.getCourse());
            new Question("What is the time complexity of dequeuing an item?", "O(1)", count++, module.getModule(), course.getCourse());
            new Question("What do you call a collection of objects that are inserted and removed according to the last-in, first-out (LIFO) principle?", "Stack", count++, module.getModule(), course.getCourse());
            new Question("Which Stack implementation has the drawback of a fixed-capacity?", "Array", count++, module.getModule(), course.getCourse());
            new Question("Which design pattern applies to any context where we effectively want to modify an existing class so that its methods match those of a related, but different, class or interface?", "Adapter", count++, module.getModule(), course.getCourse());
            new Question("What do you call the collections of objects that are inserted and removed according to the first-in, first-out (FIFO) principle?", "Queue", count++, module.getModule(), course.getCourse());
            new Question("What do you call a doubled-ended Queue?", "Deque", count++, module.getModule(), course.getCourse());
            new Question("Which of the Linked Lists is more appropriate for Deques?", "Doubly Linked Lists", count++, module.getModule(), course.getCourse());
        }
    }

    // Chapter 6 – List and Iterators
    static class ModuleSix {

        private final Module module;
        private int count = 1;

        public ModuleSix() {
            module = new Module();
            module.setModule(6);
            course.allModules().add(module);
        }

        public void questions() {
            new Question("In Arraylists, what is the time complexity for adding an item?", "O(n)", count++, module.getModule(), course.getCourse());
            new Question("Java’s ArrayList class provides a more robust abstraction in allowing a user to add elements to the list with no apparent limit on the overall capacity. Name the algorithmic sleight of hand known to make this happen.", "Dynamic Array", count++, module.getModule(), course.getCourse());
            new Question("In Array-based Arraylists, by which factor would you increase the capacity when existing array that has been filled?", "Twice", count++, module.getModule(), course.getCourse());
            new Question("True | False, A series of push operations on an initially empty dynamic array more efficient in terms of its total running time?", "True", count++, module.getModule(), course.getCourse());
            new Question("Name the algorithmic design pattern showing that performing a sequence of push operations on a dynamic array is quite efficient.", "Amortization", count++, module.getModule(), course.getCourse());
            new Question("What happens when a constant number of additional cells are reserved each time an array is resized?", "Arithmetic Progression", count++, module.getModule(), course.getCourse());
            new Question("In array-based sequences, what provides an excellent description of the location of an element, or the location at which an insertion or deletion should take place?", "integer indices", count++, module.getModule(), course.getCourse());
            new Question("What are lists that allows you to add, remove, insert, and sort elements within the list?", "Positional Lists", count++, module.getModule(), course.getCourse());
            new Question("What acts as a marker or token within a broader positional list?", "Position", count++, module.getModule(), course.getCourse());
            new Question("Which value is returned when the before method is invoked at the front of the list, or when first or last methods are called upon an empty list?", "null", count++, module.getModule(), course.getCourse());
            new Question("What is Positional List ideally implemented with?", "Doubly Linked List", count++, module.getModule(), course.getCourse());
            new Question("True | False, In array-based positional lists, we have to shift position objects to make room for the new position to fill in the hole crested by the removal of the old position.", "True", count++, module.getModule(), course.getCourse());
            new Question("What is a software design pattern that abstracts the process of scanning through a sequence of elements, one element at a time?", "Iterators", count++, module.getModule(), course.getCourse());
            new Question("What do you call the iterator maintaining its own private copy of the sequence of elements, which is constructed at the time the iterator object is created?", "Snapshot Iterator", count++, module.getModule(), course.getCourse());
            new Question("What do you call the iterator that does not make an upfront copy–instead performing a piecewise traversal of the primary structure only when the next() method is called to request another element?", "Lazy Iterator", count++, module.getModule(), course.getCourse());
            new Question("What thread-safe support do robust Collections classes provide?", "Concurrency", count++, module.getModule(), course.getCourse());
            new Question("What do for loops call to move to the next object?", "Iterators", count++, module.getModule(), course.getCourse());
            new Question("How many methods do iterators have?", "2", count++, module.getModule(), course.getCourse());
            new Question("In an ArrayList of Integers, calling .remove() will delete the object or index?", "Index", count++, module.getModule(), course.getCourse());
            new Question("What is the time complexity of searching an element in an array?", "O(n)", count++, module.getModule(), course.getCourse());
            new Question("Assuming we have a sorted Array, what is the run time of a Binary Search?", "O(logn)", count++, module.getModule(), course.getCourse());
            new Question("True | False, accessing an element and searching have both O(n) in an Array?", "False", count++, module.getModule(), course.getCourse());
            new Question("What is the time complexity for adding an item to an Array?", "O(n)", count++, module.getModule(), course.getCourse());
            new Question("What is the time complexity for removing an item from an Array?", "O(n)", count++, module.getModule(), course.getCourse());
            new Question("What is the time complexity for accessing an item in an Array?", "O(1)", count++, module.getModule(), course.getCourse());
            new Question("What is the time complexity for searching an item in an Array?", "O(n)", count++, module.getModule(), course.getCourse());
            new Question("What is the time complexity of accessing an item in an Arraylist?", "O(1)", count++, module.getModule(), course.getCourse());
            new Question("What is the time complexity of removing an item in an Arraylist?", "O(n)", count++, module.getModule(), course.getCourse());
            new Question("What is the time complexity of getting the index of an item in an Arraylist?", "O(n)", count++, module.getModule(), course.getCourse());
            new Question("What is the time complexity of checking if the Arraylist contains an item?", "O(n)", count++, module.getModule(), course.getCourse());
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