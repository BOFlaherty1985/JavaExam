package exam.revision.chapter_1_basics.nonaccessmodifier;

/**
 * Abstract Nonaccess Modifier
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 21/10/2014
 * @project JavaExamProject
 */
public abstract class AbstractModifier {

    /*
        Non Access Modifiers

        * Nonaccess modifiers change the default properties of a Java class and its members.
        * You can characterise your classes, interfaces, methods and variables with the following nonaccess modifiers:
            - abstract
            - static
            - final
            - synchronized
            - native
            - strictfp
            - transient
            - volatile

        * Three of these nonaccess modifiers are covered in the exam, abstract, final and static.

             Abstract Classes

             * When added to the definition of a class, interface or method, the abstract modifier changes its default
               behavior.
             * When the abstract keyword is prefixed to the definition of a concrete class, it changes it to an abstract
               class, even if the class doesn't define any abstract methods.
             * An abstract class can not be instantiated (you can not create an instance of the class/object)


             Exam Tip: An abstract class may or may not define an abstract method; you can define an abstract class
             without any abstract methods.

             Abstract Interfaces

             * An interface is an abstract entity as default. The Java compiler automatically adds the keyword abstract
               to the definition of an interface. Thus, adding the keyword abstract to the definition of an interface is
               redundant.

             Abstract Method

             * An abstract method doesn't have a body. Usually, an abstract method is implemented by a derived class.
             * You do not need an abstract method in an abstract class, but a class must be defined as abstract if you
               wish to use abstract methods.

              Exam Tip: A method with an empty body isn't an abstract method.

            Abstract Variables

            * None of the different types of variables (instance, static, local and method parameters) can be defined as
              abstract.

              Exam Tip: Do not be triced by code that tries to apply the nonaccess modifier abstract to a variable. Such
              code will not compile.


            // invalid
            abstract int this_is_not_valid = 2; // code will not compile

     */

    abstract void methodNameHere();

}
