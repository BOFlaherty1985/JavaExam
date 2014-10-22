package exam.revision.chapter_3_methods.part_3_create_methods;

/**
 * Create Methods
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 22/10/2014
 * @project JavaExamProject
 */
public class CreateMethods {

    /*
        * Methods

        * A method is a group of statements identified with a name.
        * Methods are used to define the behavior of an object, and can perform the following functions:
               - Access and modifies the state of an object.
               - Uses the method parameter that is passed in (to perform a task or calculation)
               - Access another class from the Java API and returns a value

        Return Type of a Method

        * A method may or may not return a value.
        * A method that doesn't not return a value, is defined using the keyword 'void'
        * A method can return a primitive value (int, boolean, char etc) or an object of any class or interface.
        * If you're returning a value from a method, you can only assign it to a variable of a compatible type.

          String myValue = processReturnStringValue(); // valid
          int myInt = processReturnStringValue() // fails to compile

        Exam Tip: You can optionally assign the value returned by a method to a variable. If you don't assign the returned
        value from a method, it's neither a compilation error nor a runtime exception.

        Rules to Remember when defining a Return Statement

        * For a method that returns a value, the return statement must be followed immediately by a value.
        * For a method that doesn't return a value (return type is void), the return statement must not be followed by a value.
        * If the compiler determines that a return statement isn't the last statement to execute in a method, the method will
          fail to compile.

        Method Parameters

        * Method parameters are the variables that appear in the definition of a method and specify the type and number
         of values that a method can accept.
        * Method Parameters are not the same as method arguments. Method parameters are the variables that appear in
          the method definition (int a). Method arguments are the actual values that are passed into the  method, for
          example:

        exampleThree(100, 2); // 100 & 2 are the method arguments.


        * A method may accept zero or multiple methods arguments.
        * If a method doesn't accept any parameters, the parentheses that follow the name of that method are empty.

        Exam Tip: There are no valid or invalid combinations of the number and type of method parameters that can be
        passed to a method and the value that it can return. They're independent of one another. What does matter though,
        is that the types of method arguments passed into, and returned from a method are valid for the method definition.

     */

    private void exampleOne() {

    }

    private String exampleTwo() {
        return "A String will be returned.";
    }

    private int exampleThree(int a, int b) {
        return (a * b);
    }

    private Object exampleFour() {
        return new Object();
    }

//    private Object exampleFour() {
//        return new Object();
//        Object obj = new Object();   // Fails to compile, return statement must be the last line of code within a method.
//    }

}
