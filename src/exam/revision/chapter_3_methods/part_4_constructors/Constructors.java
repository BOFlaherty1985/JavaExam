package exam.revision.chapter_3_methods.part_4_constructors;

/**
 * Defining Constructors
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 23/10/2014
 * @project JavaExamProject
 */
public class Constructors {

    public static void main(String[] args) {

        Employee employee_one = new Employee();
        Employee employee_two = new Employee("Benjamin OFlaherty", 29);

        // Explicit call to constructor that has been defined with a return type (treated as a normal method)
        employee_one.Employee("Explicit_Call");

    }

    /*

        * Constructors are special methods that create and return an object of the class in which they're defined, and
          they do not specify a return type, not even void.
        * A constructor can accomplish the following tasks:
            - Call the base class's constructor; this can be an implicit or explicit call
            - Initialize all of the instance variables of a class with their default values.
        * Constructors come in two types, user defined and default constructors.


         User define Constructors

         * The author of a class has full control over the definition of the class.
         * The author may or may not define a constructor.
         * A constructor is a type of method, so you can also pass method parameters into it.
         * A constructor is called when you create an object of the class.
         * A constructor doesn't have an implicit return type, if a constructor is define with a return type (void, int etc)
           Java will simply treat it as any other method, and it will not be called implicitly when you create the object.

         Exam Tip: You can define a constructor using all four access modifiers, public, protected, private and default

         Exam Tip: A constructor must not define any return type. Instead it creates and returns an object of the class
         in which it has been defined. If you declare a return type, Java will treat the constructor as a regular method.


          Initializer Blocks Verses Constructors

          * An initializer block is defined within a class, not as part of a method.
          * It executes for every object that's created for a class.
          * If you define both an initializer and a constructor for a class, both will execute, but the initializer block
            will execute prior to the constructor.
          * Initializer blocks are used to initialize variables for anonymous classes, an anonymous class is a type of
            inner class.
          * An initializer block can create local variables, assign values to instance and static variables and call methods
           or define loops, conditional statements and try-catch-finally blocks.


           Default Constructor

           * In the absence of a user-define constructor, Java inserts a default constructor.
           * This constructor doesn't accept any method arguments.
           * The default constructor calls the constructor of the super (parent) class and assigns default values to all
             of the instance variables.
           * If a user has defined a constructor, Java will not add a default constructor.


            Overloading Constructors

            * Overloaded constructors follow the same rules as discussed in for overloading methods.
            * Overloaded constructors must be defined using different argument lists.
            * Overloaded constructors can't be defined by just a change in the access modifier.
            * Overloaded constructors may be defined using different access modifiers.
            * A constructor can call another overloaded constructor by using the 'this' keyword.
            * A constructor can't invoke a constructor using the class name.
            * If present, the call to another constructor must be the first statement in a constructor.

     */


}
