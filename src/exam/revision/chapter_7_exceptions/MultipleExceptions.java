package exam.revision.chapter_7_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * MultipleExceptions Object
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 14/10/2014
 * @project JavaExamProject
 */
public class MultipleExceptions {


    /*
        Single Try Block, Multiple Catch Blocks and a Finally Block

        * You can define multiple 'catch' clauses for a single 'try' statement.
        * You can only define one 'finally' clause though.
        * The 'finally' clause is used to define cleanup code, code that closes and releases resources.
     */
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fileInputStream;

        try {
            fileInputStream = new FileInputStream("D:\\chapter7_exceptions_test.txt");
            System.out.println("File Opened...");

            fileInputStream.read();
            System.out.println("Read file...");

        } catch (FileNotFoundException e) {
            System.out.println("File not found exception");

            /*
                The 'finally' block will execute even if the code in a 'try', or 'catch' block defines a return statement.

                There are however, a couple of scenarios where the 'finally' block will not be executed.

                * Application termination: The 'try' or 'catch' executes System.exit, which terminates the application.
                * Fatal errors: A crash of the JVM or the OS.
             */
            return;
        } catch (IOException e) {
            System.out.println("File closing exception");
        } finally {
            System.out.println("finally...");
        }

        MultipleExceptions multipleExceptions = new MultipleExceptions();
        System.out.println(multipleExceptions.getInt());

        System.out.println(multipleExceptions.getIntModify());

        // Rethrowing exceptions
        rethrowException();

    }

    /*
        What happens if both a catch and a finally block define return statements?

        * If both catch and finally blocks define return statements, the calling method will receive the value from the
          finally block.

     */
    int getInt() {
        try {
            String[] students = {"Benjamin", "Joe"};
            System.out.println(students[5].toString());
        } catch (Exception e) {
            System.out.println("ArrayIndexOutOfBounds exception thrown...");
            return 10;
        } finally {
            return 20;
        }
    }

    /*
        What happens if a finally block modifies the value returned from a 'catch' block?

        * If a catch block returns a primitive data type, the finally block can't modify the value being returned.
        * Even though a finally block adds/subtracts etc from a primitive data type, the modified value is not returned
        * to the method main.

        Exam Tip - Watch out for code that returns a value from the catch block and modifies it in the finally block.
        If a catch block returns a primitive data type, the finally block can't modify the value being returned by it.
        If a catch block returns an object, the finally block can modify the value being returned by it.

     */

    int getIntModify() {

        int returnedValue = 10;

        try {
            String[] students = {"Benjamin", "Joe"};
            System.out.println(students[5].toString());
        } catch (Exception e) {
            System.out.println("About to return " + returnedValue);
            return returnedValue;
        } finally {
            returnedValue += 10;
            System.out.println("Return value is now " + returnedValue);
        }

        return returnedValue;
    }

    /*
        Does the order of the exceptions caught in the catch blocks matter?

        * Order doesn't matter for unrelated classes, but it does matter for classes that share an IS-A relationship.
        * If you fail to catch the exception of the super class, before the exception of the subclass your code will fail
         to compile
        * Thrown exceptions look for an appropriate handler and work from the top to bottom, until a suitable handler is
          found.
        * Java will fail to compile execution handlers that will never execute (i.e. for classes with an IS-A relationship
         when the subclass exception is stated first before the super class).


        Can I rethrow an exception or the error I catch?

        * You can do whatever you want with an exception. Rethrow it, pass it on to a method, assign it to another variable,
          upload it to a server, send it to an SMS etc.
        * When you rethrow a checked exception, it's treated like a regular thrown checked exception.

     */

    public static void rethrowException() throws FileNotFoundException {

        FileInputStream fileInputStream;

        try {
            fileInputStream = new FileInputStream("fileNotFound.txt");
        } catch (FileNotFoundException e) {
            throw e;
        }

    }

}
