import java.util.Collections;

/**
 * @author Francois Boulay-Handfield
 */
public class DSA extends Course{

    private static ModuleOne moduleOne;
    private static ModuleTwo moduleTwo;
    private static ModuleThree moduleThree;
    private static ModuleFour moduleFour;
    private static ModuleFive moduleFive;
    private static ModuleSix moduleSix;
    private static ModuleSeven moduleSeven;
    private static ModuleEight moduleEight;

    public DSA(){
        moduleOne = new ModuleOne();
        moduleTwo = new ModuleTwo();
        moduleThree = new ModuleThree();
        moduleFour = new ModuleFour();
        moduleFive = new ModuleFive();
        moduleSix = new ModuleSix();
        moduleSeven = new ModuleSeven();
        moduleEight = new ModuleEight();
        setCourse("Data Structures and Algorithms");
    }

    // Module 1 – Java/Object-Oriented Programming Review
    static class ModuleOne {

        private final Module module;
        private int count = 0;

        public ModuleOne(){
            module = new Module();
            module.setModule(1);
            allModules().add(module);
        }

        public void questions() {
            new Question("What do you call the name of a class, method or variable in Java?", "identifier", ++count, module.getModule(), getCourse());
            new Question("True | False, Strings of the primitive type in Java?", "False", ++count, module.getModule(), getCourse());
            new Question("What do you call the primary actors in Java?", "Objects", ++count, module.getModule(), getCourse());
            new Question("What are blocks of code that can be called to perform actions?", "Methods", ++count, module.getModule(), getCourse());
            new Question("Which operator returns a reference to the newly created instance; the returned reference is typically assigned to a variable for further use?", "new", ++count, module.getModule(), getCourse());
            new Question("What are the default values for reference variables?", "null", ++count, module.getModule(), getCourse());
            new Question("Which modifiers control the level of access that the defining class grants to other classes in the context of a larger Java program?", "Access Control Modifiers", ++count, module.getModule(), getCourse());
            new Question("Which class modifier designates that all classes may access the defined aspect?", "Public", ++count, module.getModule(), getCourse());
            new Question("True | False, classes that are designated as subclasses of the given class cannot be accessed with the Protected class modifier.", "False", ++count, module.getModule(), getCourse());
            new Question("Which modifier designates that access to a defined member of a class be granted only to code within that class?", "Private", ++count, module.getModule(), getCourse());
            new Question("Which modifier is used to store global information about a class, as in its value is associated with the class as a whole, rather than with each individual instance of that class?", "Static", ++count, module.getModule(), getCourse());
            new Question("Which modifier means that a method's or class's signature is provided but without an implementation of the method body?", "Abstract", ++count, module.getModule(), getCourse());
            new Question("Which modifier can be initialized as part of that declaration, but can never again be assigned a new value?", "Final", ++count, module.getModule(), getCourse());
            new Question("What defines the name and parameters for a method?", "Signature", ++count, module.getModule(), getCourse());
            new Question("Which keyword must be used when a method does not return a value?", "void", ++count, module.getModule(), getCourse());
            new Question("Are all objects passed by value or reference?", "Value", ++count, module.getModule(), getCourse());
            new Question("Which passing value is it when Java makes a copy in memory of the parameter’s value, or a copy of the contents of the parameter?", "Pass by Value", ++count, module.getModule(), getCourse());
            new Question("Which passing value is it when Java stores a copy of the address to the parameter rather than the value itself?", "Pass by Reference", ++count, module.getModule(), getCourse());
            new Question("What is a special kind of method that is used to initialize a newly created instance of the class so that it will be in a consistent and stable initial state?", "Constructor", ++count, module.getModule(), getCourse());
            new Question("True | False, constructors can be static, abstract or final.", "False", ++count, module.getModule(), getCourse());
            new Question("True | False, constructors can be Protected or Private", "True", ++count, module.getModule(), getCourse());
            new Question("When a class has multiple constructors, what must be different for each individual constructor?", "Signature", ++count, module.getModule(), getCourse());
            new Question("True | False, you can use the keyword \"this\" in the body of a static method.", "False", ++count, module.getModule(), getCourse());
            new Question("Which keyword refers to the object known as thing in the caller’s context?", "This", ++count, module.getModule(), getCourse());
            new Question("What means that once an instance is created and initialized, the value of that instance cannot be changed?", "Immutable", ++count, module.getModule(), getCourse());
            new Question("What is the process of implicitly converting between base types and their wrapper types?", "Automatic Boxing and Unboxing", ++count, module.getModule(), getCourse());
            new Question("What is a special class representing static constants with the final keyword?", "Enums", ++count, module.getModule(), getCourse());
            new Question("What involves the use of literals, variables, and operators?", "Expressions", ++count, module.getModule(), getCourse());
            new Question("What is any constant value that can be used in an assignment or other expression?", "Literals", ++count, module.getModule(), getCourse());
            new Question("What is an operation that allows us to change the type of a value?", "Casting", ++count, module.getModule(), getCourse());
            new Question("Which loop allows the boolean condition to be checked at the end of each pass of the loop rather than before each pass?", "Do-While", ++count, module.getModule(), getCourse());
            new Question("Which statement causes the execution to skip over the remaining steps of the current iteration of the loop body, but then, unlike the break statement, the flow of control returns to the top of the loop, assuming its condition remains satisfied?", "Continue", ++count, module.getModule(), getCourse());
            new Question("What is the Object-Oriented design goal that is, capable of handling unexpected inputs that are not explicitly defined for its application?", "Robustness", ++count, module.getModule(), getCourse());
            new Question("Because modern software applications are used for many years, what is the Object-Oriented design goal specifying that software needs to be able to evolve over time in response to changing conditions in its environment?", "Adaptability", ++count, module.getModule(), getCourse());
            new Question("Which Object-Oriented design goal says the same code should be usable as a component of different systems in various applications?", "Reusability", ++count, module.getModule(), getCourse());
            new Question("What do you call the notion of distilling a complicated system down to its most fundamental parts?", "Abstraction", ++count, module.getModule(), getCourse());
            new Question("What is a mathematical model of a data structure that specifies the type of data stored, the operations supported on them, and the types of parameters of the operations?", "Abstract Data Type", ++count, module.getModule(), getCourse());
            new Question("Which Object-Oriented principle says different components of a software system should not reveal the internal details of their respective implementations?", "Encapsulation", ++count, module.getModule(), getCourse());
            new Question("Which Object-Oriented principle refers to an organizing principle in which different components of a software system are divided into separate functional units?", "Modularity", ++count, module.getModule(), getCourse());
            new Question("In Object-Oriented programming, what do you call the mechanism for a modular and hierarchical organization?", "Inheritance", ++count, module.getModule(), getCourse());
            new Question("True | False, a constructor for a subclass not making an explicit call to super or this as its first command will still have it called implicitly behind the scenes.", "True", ++count, module.getModule(), getCourse());
            new Question("What refers to the ability of a reference variable to take different forms?", "Polymorphism", ++count, module.getModule(), getCourse());
            new Question("What states that a variable (or parameter) with a declared type can be assigned an instance from any direct or indirect subclass of that type?", "Liskov Substitution Principle", ++count, module.getModule(), getCourse());
            new Question("What is the name of the process deciding at runtime to call the version of the method that is most specific to the actual type of the referenced object (not the declared type)?", "Dynamic Dispatch", ++count, module.getModule(), getCourse());
            new Question("What determines the next number by adding a fixed constant to the previous value?", "Arithmetic Progression", ++count, module.getModule(), getCourse());
            new Question("What determines the next number by multiplying the previous value by a fixed constant?", "Geometric Progression", ++count, module.getModule(), getCourse());
            new Question("What are collection of method declarations with no data and no bodies?", "Interfaces", ++count, module.getModule(), getCourse());
            new Question("What is the ability of extending from more than one type?", "Multiple Inheritance", ++count, module.getModule(), getCourse());
            new Question("True | False, multiple inheritance is allowed for both interfaces and classes.", "False", ++count, module.getModule(), getCourse());
            new Question("Which keyword prepares users about the possibility of an exceptional case, so that they might be better prepared to handle an exception that may arise?", "Throws", ++count, module.getModule(), getCourse());
            new Question("What are typically thrown only by the Java Virtual Machine and designate the most serious situations that are unlikely to be recoverable, such as when the virtual machine is asked to execute a corrupt class file, or when the system runs out of memory?", "Errors", ++count, module.getModule(), getCourse());
            new Question("Which conversion is automatically performed to store the result of an expression into a variable, without the need for an explicit cast?", "Widening", ++count, module.getModule(), getCourse());
            new Question("Which conversion requires an explicit cast?", "Narrowing", ++count, module.getModule(), getCourse());
            new Question("Which operator allows us to test whether an object variable is referring to an object that belongs to a particular type?", "instanceof", ++count, module.getModule(), getCourse());
            new Question("Which keyword can help restrict a formal parameter type in generics?", "extends", ++count, module.getModule(), getCourse());
            new Question("Which nested class is most like a traditional class; its instances have no association with any specific instance of the outer class?", "Static Nested Class", ++count, module.getModule(), getCourse());
            new Question("Which nested class has access to other members of the enclosing class, even if they are declared private?", "Inner Class", ++count, module.getModule(), getCourse());
        }
    }

    // Module 2 – Linked Lists
    static class ModuleTwo {

        private final Module module;
        private int count = 10;

        public ModuleTwo() {
            module = new Module();
            module.setModule(2);
            allModules().add(module);
        }

        public void questions() {
            new Question("When an array is instantiated in memory, what are its default values?", "null", ++count, module.getModule(), getCourse());
            new Question("Which sorting algorithm proceeds by considering one element at a time, placing the element in the correct order relative to those before it?", "Insertion-Sort", ++count, module.getModule(), getCourse());
            new Question("In Java, are Arrays mutable or immutable objects?", "Mutable", ++count, module.getModule(), getCourse());
            new Question("What do you call a collection of nodes that collectively form a linear sequence?", "Linked List", ++count, module.getModule(), getCourse());
            new Question("Which Linked List says each node stores a reference to an object that is an element of the sequence, as well as a reference to the next node of the list?", "Singly Linked List", ++count, module.getModule(), getCourse());
            new Question("What do you call the reference to the first node of the Linked List?", "Head", ++count, module.getModule(), getCourse());
            new Question("What do you call the last node in a Linked List?", "Tail", ++count, module.getModule(), getCourse());
            new Question("What is the process of identifying the tail as the node having null as its next reference?", "Link Hopping", ++count, module.getModule(), getCourse());
            new Question("Name the algorithm in which Operating Systems allow processes to effectively share use of the CPUs.", "Round-Robin Scheduling", ++count, module.getModule(), getCourse());
            new Question("What is the structure which is essentially a singularly linked list in which the next reference of the tail node is set to refer back to the head of the list ?", "Circularly Linked List", ++count, module.getModule(), getCourse());
            new Question("What is a Linked List in which each node keeps an explicit reference to the node before it and a reference to the node after it?", "Doubly Linked List", ++count, module.getModule(), getCourse());
            new Question("What common name do you call the special nodes at both ends of the Linked List?", "Sentinels", ++count, module.getModule(), getCourse());
            new Question("Which method can be used to produce what is known as a shallow copy of an object?", "Clone", ++count, module.getModule(), getCourse());
            new Question("In copies, what means that no new memory allocation happens for the other entities, and the only reference is copied to the other entities?", "Shallow Copy", ++count, module.getModule(), getCourse());
            new Question("In copies, what means that a new memory allocation happens for the other entities, and reference is not copied to the other entities?", "Deep Copy", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity of accessing a Linked List node?", "n", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity of searching a Linked List node?", "n", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity of adding a node to a Linked List?", "1", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity of removing a node from a Linked List?", "1", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity to getting the length of a Linked List?", "n", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity of accessing a Doubly Linked List node?", "n", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity of searching a Doubly Linked List node?", "n", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity of inserting a node in a Doubly Linked List?", "1", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity of deleting a node in a Doubly Linked List?", "1", ++count, module.getModule(), getCourse());
        }
    }

    // Module 3 – Algorithm Analysis
    static class ModuleThree {

        private final Module module;
        private int count = 0;

        public ModuleThree() {
            module = new Module();
            module.setModule(3);
            allModules().add(module);
        }

        public void questions() {
            new Question("What is a systematic way of organizing and accessing data?", "Data Structure", ++count, module.getModule(), getCourse());
            new Question("What is a step-by-step procedure for performing some task in a finite amount of time?", "Algorithm", ++count, module.getModule(), getCourse());
            new Question("What corresponds to a low-level instruction with an execution time that is constant?", "Primitive Operation", ++count, module.getModule(), getCourse());
            new Question("What requires that algorithms do well on every input, thus making it the standard for success?", "Worst-case analysis", ++count, module.getModule(), getCourse());
            new Question("Which function is useful in algorithm analysis because it characterizes the number of steps needed to do a basic operation on a computer, like adding two numbers, assigning a value to a variable, or comparing two numbers?", "Constant", ++count, module.getModule(), getCourse());
            new Question("Name the algorithmic function that is the inverse of power.", "Logarithm", ++count, module.getModule(), getCourse());
            new Question("Which function arises in algorithm analysis any time we have to do a single basic operation for each of n elements?", "Linear", ++count, module.getModule(), getCourse());
            new Question("Which function grows a little more rapidly than the linear function and a lot less rapidly than the quadratic function?", "n-log-n", ++count, module.getModule(), getCourse());
            new Question("What is the function when an inner loop performs a linear number of operations and the other loop a linear number of times?", "Quadratic", ++count, module.getModule(), getCourse());
            new Question("Which function assigns to an input value n the product of n with itself 3 times?", "Cubic", ++count, module.getModule(), getCourse());
            new Question("What are algebraic expressions that consist of variables and coefficients?", "Polynomials", ++count, module.getModule(), getCourse());
            new Question("What is the numerical factor of a term containing constant and variables?", "Coefficients", ++count, module.getModule(), getCourse());
            new Question("Which notation gives us a shorthand way of expressing sums of increasing terms that have a regular structure?", "Summation", ++count, module.getModule(), getCourse());
            new Question("Which function assigns to the input argument n the value obtained by multiplying the base by itself n times?", "Factorial", ++count, module.getModule(), getCourse());
            new Question("What refers to computing the running time of any operation in mathematical units of computation?", "Asymptotic Analysis", ++count, module.getModule(), getCourse());
            new Question("Which notation is used for analyzing the best-case complexity of an algorithm?", "Big Omega", ++count, module.getModule(), getCourse());
            new Question("Which notation is used for analyzing the average-case complexity of an algorithm?", "Big Theta", ++count, module.getModule(), getCourse());
            new Question("Which notation is used for analyzing the worst-case complexity of an algorithm?", "Big-O", ++count, module.getModule(), getCourse());
            new Question("What is the Big-Theta of -> f(n) = nlog(n) + n^2 + n^3log(n)?", "n^3logn", ++count, module.getModule(), getCourse());
            new Question("What is the Big-O of -> f(n) = nlog(n) + n^2 + n^3log(n)?", "n^4", ++count, module.getModule(), getCourse());
            new Question("What is the slowest run time?", "n!", ++count, module.getModule(), getCourse());
            new Question("What is the worst case for Bubble Sort?", "n^2", ++count, module.getModule(), getCourse());
            new Question("What is the worst case for Insertion Sort?", "n^2", ++count, module.getModule(), getCourse());
        }
    }

    // Module 4 – Recursion
    static class ModuleFour {

        private final Module module;
        private int count = 0;

        public ModuleFour() {
            module = new Module();
            module.setModule(4);
            allModules().add(module);
        }

        public void questions() {
            new Question("What is any function that calls an instance of itself?", "Recursion", ++count, module.getModule(), getCourse());
            new Question("In Java, what stores the parameters and local variables specific to a given call of the method, and information about which command in the body of the method is currently executing?", "Activation Frame", ++count, module.getModule(), getCourse());
            new Question("Which algorithm follows the divide and conquer approach in which the list is divided into two halves, and the item is compared with the middle element of the list?", "Binary Search", ++count, module.getModule(), getCourse());
            new Question("Which recursive method is designed so that each invocation of the body makes at most one new recursive call?", "Linear Recursion", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity for the Binary Search algorithm?", "logn", ++count, module.getModule(), getCourse());
            new Question("What do you call a method making two recursive calls?", "Binary Recursion", ++count, module.getModule(), getCourse());
            new Question("What is the process in which a method may make more than two recursive calls?", "Multiple Recursion", ++count, module.getModule(), getCourse());
            new Question("What stops the recursion from continuing on forever?", "Base Case", ++count, module.getModule(), getCourse());
            new Question("What is a quick solution to the Element Uniqueness Problem in an Array?", "Sort", ++count, module.getModule(), getCourse());
            new Question("What can quickly swamp computing resources, not only due to rapid use of the CPU, but because each successive call creates a frame requiring additional memory?", "Infinite Recursion", ++count, module.getModule(), getCourse());
            new Question("What is a type of buffer overflow error that occurs when a computer program tries to use more memory space in the call stack than has been allocated to that stack?", "Stack Overflow", ++count, module.getModule(), getCourse());
            new Question("What is defined as a recursive function in which the recursive call is the last statement that is executed by the function?", "Tail Recursion", ++count, module.getModule(), getCourse());
            new Question("What does Tail Recursion reduce?", "Stack Frames", ++count, module.getModule(), getCourse());
            new Question("True | False, In languages like Java, recursion is typically less expensive than iteration.", "False", ++count, module.getModule(), getCourse());
        }
    }


    // Module 5 – Stacks and Queues
    static class ModuleFive {

        private final Module module;
        private int count = 0;

        public ModuleFive() {
            module = new Module();
            module.setModule(5);
            allModules().add(module);
        }

        public void questions() {
            new Question("Which principle does a Queue follow?", "FIFO", ++count, module.getModule(), getCourse());
            new Question("Which principle does a Stack follow?", "LIFO", ++count, module.getModule(), getCourse());
            new Question("Inserting in a Queue is known as?", "Enqueue", ++count, module.getModule(), getCourse());
            new Question("Deletion in a Queue is known as?", "Dequeue", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity of the pop() operation when the Stack is implemented using an array?", "n", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity of accessing a Stack item?", "n", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity of searching a Stack?", "n", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity of pushing an item to a Stack?", "1", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity of popping a Stack item?", "1", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity of accessing a Queue item?", "n", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity of searching a Queue item?", "n", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity of enqueuing an item?", "1", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity of dequeuing an item?", "1", ++count, module.getModule(), getCourse());
            new Question("What do you call a collection of objects that are inserted and removed according to the last-in, first-out (LIFO) principle?", "Stack", ++count, module.getModule(), getCourse());
            new Question("Which Stack implementation has the drawback of a fixed-capacity?", "Array", ++count, module.getModule(), getCourse());
            new Question("Which design pattern applies to any context where we effectively want to modify an existing class so that its methods match those of a related, but different, class or interface?", "Adapter", ++count, module.getModule(), getCourse());
            new Question("What do you call the collections of objects that are inserted and removed according to the first-in, first-out (FIFO) principle?", "Queue", ++count, module.getModule(), getCourse());
            new Question("What do you call a doubled-ended Queue?", "Deque", ++count, module.getModule(), getCourse());
            new Question("Which of the Linked Lists is more appropriate for Deques?", "Doubly Linked Lists", ++count, module.getModule(), getCourse());
        }
    }

    // Chapter 6 – List and Iterators
    static class ModuleSix {

        private final Module module;
        private int count = 0;

        public ModuleSix() {
            module = new Module();
            module.setModule(6);
            allModules().add(module);
        }

        public void questions() {
            new Question("In Arraylists, what is the time complexity for adding an item?", "n", ++count, module.getModule(), getCourse());
            new Question("Java’s ArrayList class provides a more robust abstraction in allowing a user to add elements to the list with no apparent limit on the overall capacity. Name the algorithmic sleight of hand known to make this happen.", "Dynamic Array", ++count, module.getModule(), getCourse());
            new Question("In Array-based Arraylists, by which factor would you increase the capacity when existing array that has been filled?", "Twice", ++count, module.getModule(), getCourse());
            new Question("True | False, A series of push operations on an empty dynamic array is cost effective.", "True", ++count, module.getModule(), getCourse());
            new Question("Name the algorithmic design pattern showing that performing a sequence of push operations on a dynamic array is quite efficient.", "Amortization", ++count, module.getModule(), getCourse());
            new Question("What happens when a constant number of additional cells are reserved each time an array is resized?", "Arithmetic Progression", ++count, module.getModule(), getCourse());
            new Question("In array-based sequences, what provides an excellent description of the location of an element, or the location at which an insertion or deletion should take place?", "integer indices", ++count, module.getModule(), getCourse());
            new Question("What are lists that allows you to add, remove, insert, and sort elements within the list?", "Positional Lists", ++count, module.getModule(), getCourse());
            new Question("What acts as a marker or token within a broader positional list?", "Position", ++count, module.getModule(), getCourse());
            new Question("Which value is returned when the before method is invoked at the front of the list, or when first or last methods are called upon an empty list?", "null", ++count, module.getModule(), getCourse());
            new Question("What is Positional List ideally implemented with?", "Doubly Linked List", ++count, module.getModule(), getCourse());
            new Question("True | False, In array-based positional lists, we have to shift position objects to make room for the new position to fill in the hole crested by the removal of the old position.", "True", ++count, module.getModule(), getCourse());
            new Question("What is a software design pattern that abstracts the process of scanning through a sequence of elements, one element at a time?", "Iterators", ++count, module.getModule(), getCourse());
            new Question("What do you call the iterator maintaining its own private copy of the sequence of elements, which is constructed at the time the iterator object is created?", "Snapshot Iterator", ++count, module.getModule(), getCourse());
            new Question("What do you call the iterator that does not make an upfront copy–instead performing a piecewise traversal of the primary structure only when the next() method is called to request another element?", "Lazy Iterator", ++count, module.getModule(), getCourse());
            new Question("What thread-safe support do robust Collections classes provide?", "Concurrency", ++count, module.getModule(), getCourse());
            new Question("What do for loops call to move to the next object?", "Iterators", ++count, module.getModule(), getCourse());
            new Question("How many methods do iterators have?", "2", ++count, module.getModule(), getCourse());
            new Question("In an ArrayList of Integers, calling .remove() will delete the object or index?", "Index", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity of searching an element in an array?", "n", ++count, module.getModule(), getCourse());
            new Question("Assuming we have a sorted Array, what is the run time of a Binary Search?", "logn", ++count, module.getModule(), getCourse());
            new Question("True | False, accessing an element and searching have both O(n) in an Array?", "False", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity for adding an item to an Array?", "n", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity for removing an item from an Array?", "n", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity for accessing an item in an Array?", "1", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity for searching an item in an Array?", "n", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity of accessing an item in an Arraylist?", "1", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity of removing an item in an Arraylist?", "n", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity of getting the index of an item in an Arraylist?", "n", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity of checking if the Arraylist contains an item?", "n", ++count, module.getModule(), getCourse());
        }
    }


    // General Trees, Binary Trees, Tree Traversals
    static class ModuleSeven {

        private final Module module;
        private int count = 0;

        public ModuleSeven() {
            module = new Module();
            module.setModule(7);
            allModules().add(module);
        }

        public void questions() {
            new Question("What's the abstract data type storing elements hierarchically?", "Trees", ++count, module.getModule(), getCourse());
            new Question("Which element does not have a parent element?", "Root", ++count, module.getModule(), getCourse());
            new Question("What's the smallest number of children an element can have?", "0", ++count, module.getModule(), getCourse());
            new Question("What do you call two nodes that are children of the same parent?", "Siblings", ++count, module.getModule(), getCourse());
            new Question("What do you a node having no children?", "External", ++count, module.getModule(), getCourse());
            new Question("What do you call a node with one or more children?", "Internal", ++count, module.getModule(), getCourse());
            new Question("What is any other node on the path from the node to the root?", "Ancestors", ++count, module.getModule(), getCourse());
            new Question("What do you call a node having the inverse relationship of ancestor?", "Descendants", ++count, module.getModule(), getCourse());
            new Question("What connects two nodes to show that there is a relationship between them?", "Edges", ++count, module.getModule(), getCourse());
            new Question("What is a sequence of nodes such that any two consecutive nodes in the sequence form an edge?", "Paths", ++count, module.getModule(), getCourse());
            new Question("What do you call the meaningful linear order among the children of each node?", "Ordered", ++count, module.getModule(), getCourse());
            new Question("What do you call the length of the path from the root to the node?", "Depth", ++count, module.getModule(), getCourse());
            new Question("What do you call the number of edges on the longest path from the node to a leaf?", "Height", ++count, module.getModule(), getCourse());
            new Question("What do you also call an external node?", "Leaf", ++count, module.getModule(), getCourse());
            new Question("What is a tree data structure in which each parent node can have at most two children?", "Binary Trees", ++count, module.getModule(), getCourse());
            new Question("What do you call a Binary Tree with 0 or 2 children?", "Proper", ++count, module.getModule(), getCourse());
            new Question("What is a proper tree structure used in analysis and strategy?", "Decision Trees", ++count, module.getModule(), getCourse());
            new Question("What is a node based binary tree that further has right and left subtrees?", "Binary Search Trees", ++count, module.getModule(), getCourse());
            new Question("Which of the Binary Tree and Binary Search Tree is unordered hence slower in process of insertion, deletion and searching?", "Binary Tree", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity of a Binary Tree", "n", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity of a Binary Search Tree?", "logn", ++count, module.getModule(), getCourse());
            new Question("What is utilized in the implementations of AVL Trees, Red Black Trees, and so on?", "Binary Search Trees", ++count, module.getModule(), getCourse());
            new Question("What refers to the process of visiting each node in a tree data structure exactly once?", "Traversal", ++count, module.getModule(), getCourse());
            new Question("True | False, similarly to stacks, queues and arrays, trees have only one way to traverse the data.", "False", ++count, module.getModule(), getCourse());
            new Question("What says the root node is first visited, then left sub-tree and after that right sub-tree is visited?", "Preorder Traversal", ++count, module.getModule(), getCourse());
            new Question("Which policy does the Preorder Traversal technique follow?", "Root Left Right", ++count, module.getModule(), getCourse());
            new Question("Which policy does the Postorder Traversal Technique follow?", "Left Right Root", ++count, module.getModule(), getCourse());
            new Question("What is the opposite of Preorder Traversal?", "Postorder Traversal", ++count, module.getModule(), getCourse());
            new Question("What is a traversing algorithm where you should start traversing from a selected node (source or starting node) and traverse the graph layer-wise thus exploring the neighbour node?", "Breadth First Traversal", ++count, module.getModule(), getCourse());
            new Question("Which traversal technique follows the Left Root Right policy?", "Inorder Traversal", ++count, module.getModule(), getCourse());
            new Question("What is the term used to unify the tree-traversal algorithms into a single framework?", "Euler Tour Traversal", ++count, module.getModule(), getCourse());
        }
    }


    // Module 8: Priority Queues, Adaptable Priority Queues, Heaps, Sorting with Priority Queues
    static class ModuleEight {

        private final Module module;
        private int count = 0;

        public ModuleEight() {
            module = new Module();
            module.setModule(8);
            allModules().add(module);
        }

        public void questions() {
            new Question("What is a collection of prioritized elements that allows arbitrary element insertion, and allows the removal of the element that has first priority?", "Priority Queue", ++count, module.getModule(), getCourse());
            new Question("What does the user associate to an element in a Priority Queue?", "Key", ++count, module.getModule(), getCourse());
            new Question("What do you call the key-value pair for a Priority Queue?", "Entry", ++count, module.getModule(), getCourse());
            new Question("True | False, Priority Queues can have multiple entries with equivalent keys.", "True", ++count, module.getModule(), getCourse());
            new Question("What is a partitioning design pattern and describes a group of objects that is treated the same way as a single instance of the same type of object?", "Composite Pattern", ++count, module.getModule(), getCourse());
            new Question("Which Priority Queue entry has the highest priority?", "Dequeue", ++count, module.getModule(), getCourse());
            new Question("What is an object that is external to the class of the keys it compares?", "Comparator", ++count, module.getModule(), getCourse());
            new Question("Which ADT provides an efficient implementation of priority queues?", "Binary Heap", ++count, module.getModule(), getCourse());
            new Question("What is the process of creating a data structure from a binary tree represented using an array?", "Heapify", ++count, module.getModule(), getCourse());
            new Question("What do you call a binary tree where nodes are filled in from left to right?", "Complete", ++count, module.getModule(), getCourse());
            new Question("Where should a new node be placed upon insertion in a complete Binary Tree?", "Rightmost Position", ++count, module.getModule(), getCourse());
            new Question("Where should a new node be placed upon insetion in a complete Binary Tree when the bottom row is full?", "Leftmost Position", ++count, module.getModule(), getCourse());
            new Question("What is the upward swapping process called?", "Up-Heap Bubbling", ++count, module.getModule(), getCourse());
            new Question("What is the downward swapping process called?", "Down-Heap Bubbling", ++count, module.getModule(), getCourse());
            new Question("Which ADT avoids complexities of a linked list tree structure?", "Array-based heap", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity of adding an element in a linked-based Heap?", "nlogn", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity of removing an element in a linked-based Heap?", "nlogn", ++count, module.getModule(), getCourse());
            new Question("How much more memory does a linked-based Heap take over the array-based implementation?", "n", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity of adding an element in an array-based Heap?", "nlogn", ++count, module.getModule(), getCourse());
            new Question("What is the time complexity of removing an element in an array-based Heap?", "nlogn", ++count, module.getModule(), getCourse());
            new Question("In array-based Heaps, what is the index of the root?", "0", ++count, module.getModule(), getCourse());
            new Question("What is the index of the left subchild of Node k?", "2k+1", ++count, module.getModule(), getCourse());
            new Question("What is the index of the right subchild of Node k?", "2k+2", ++count, module.getModule(), getCourse());
            new Question("What is the index of the parent of node k?", "floor((k-1) / 2)", ++count, module.getModule(), getCourse());
        }
    }

    public void release(boolean shuffle){
//        moduleOne.questions();
//        moduleTwo.questions();
//        moduleThree.questions();
//        moduleFour.questions();
//        moduleFive.questions();
//        moduleSix.questions();
        moduleSeven.questions();
        moduleEight.questions();
        if (shuffle) Collections.shuffle(allQuestions());
    }
}