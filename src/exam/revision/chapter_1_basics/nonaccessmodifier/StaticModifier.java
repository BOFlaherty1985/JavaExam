package exam.revision.chapter_1_basics.nonaccessmodifier;

/**
 * Static nonaccess Modifier
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 21/10/2014
 * @project JavaExamProject
 */
public class StaticModifier {

    static int staticValue = 50;

    // constant values
    final int MAX_VALUE = 1000;
    static final int MIN_VALUE = 0;

    /*
        Static Modifier

        * The nonaccess modifier static, when applied to the definitions of variables, methods, classes or interfaces,
          changes their default behavior.

          Static Variables

          * Belong to the class.
          * They are common to all instances of a class and aren't unique to any instance of a class, static attributes
            exist independently of any instances of a class and may be accessed even when no instances of the class have
            been created.
          * A static variable can be thought of like a common bank vault that's shared by the employees of an organisation.
            Each of the employees access the same bank vault, so any change made by one employee is visible to all other
            employees.

          Exam Tip: A static variable can be accessed using the name of the object reference variable or the name of a class.
     */

    public static void main(String[] args) {

        staticValue = 10;

        System.out.println("staticValue equals " + staticValue);

        int value_one = 10;
        System.out.println(value_one);

        myStaticMethod();


        StaticChild child = new StaticChild();
        child.childBehavior();

        System.out.println(staticValue);

    }

    /*
        * The static and final nonaccess modifiers can be used to define constants (variables whose value can't changed).
        * Thought you can define a constant as a non-static member, it's common practice to define constants as static
          members, as doing so allows the constant values to be used across objects and classes.

        Static Methods

        * Static methods aren't associated with objects and can't use any of the instance variables of a class.
        * You can also use static methods to define utility methods, which are methods that usually methods that manipulate
          the method parameters to computer and return an appropriate value.
        * Static methods may not always define method parameters.
        * The non-private static variables and methods are inherited by derived classes. The static members aren't involved
          in runtime polymorphism.
        * You can't override the static members in derived class, but you can redefine them.

        Note
        Even thought you can use an object reference variable to access static members, it's not advisable. This is because
        static members belong to a class and not to an individual object. The proper way to access static variables is to use
        the class name ClassName.XXXXX

     */

     static void myStaticMethod() {
        // System.out.println(MAX_VALUE); // non static members can not be accessed from within a static method.
         System.out.println(MIN_VALUE); // can be accessed from a static method as MIN_VALUE is declared as static final.
     }

     // static derived (subclass) example
     static class StaticChild extends StaticModifier {

         int nonStaticValue = 2500;
         static int staticValue = 1500;

         void childBehavior() {

             // All of the static variables are accessible as they're not declared as private
             System.out.println(staticValue);
             System.out.println(MAX_VALUE);
             System.out.println(MIN_VALUE);

             int value_one = 100;

             // However, we can not override the values of the static members but we can redefine them.
             staticValue = value_one;
             System.out.println(staticValue);

             super.staticValue = 10;

             System.out.println(StaticModifier.MIN_VALUE); // correct way to access static variables

             // a non static method can access static variables
             System.out.println(staticValue);

         }

         static void childStaticMethod() {
             // a static method can not access any non-static variables or methods;
             // System.out.println(nonStaticValue);
         }

     }

     /*
        What can a Static Method Access?

        * Neither static methods nor static variables can access the non-static variables and methods of a class.
        * However, non-static variables and methods can access static definitions, this is because static members of a class
          exist even if no instances of the class exist.

        Exam Tip: Static methods and variables can't access the instance members (non-static) of a class.

      */

}
