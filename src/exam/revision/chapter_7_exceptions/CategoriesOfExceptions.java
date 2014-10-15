package exam.revision.chapter_7_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Categories of Exceptions
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 15/10/2014
 * @project JavaExamProject
 */
public class CategoriesOfExceptions {


    public static void main(String[] args) throws FileNotFoundException {

        /*
            Identifying exception categories

            * Exceptions can be divided into three main categories:
                 - Checked exceptions
                 - Runtime exceptions
                 - Errors

            * Checked exceptions require most of your attention when it comes to coding and using methods.
            * You should not normally try to catch runtime exceptions, and there are few options you can use for errors,
              as they're thrown by the JVM.
            * All three categories are related to one another as they're subclasses of java.lang.Exception.


            Checked Exceptions

            * Checked exceptions take up most of our attention.
            * A checked exception is an unacceptable condition foreseen by the author of a method but outside the
              immediate control of the code.
            * For example, FileNotFoundException is a checked exception. This exception is thrown if the file that the
              code is trying to access can't be found.
            * A checked exception is a subclass of java.lang.Exception, but it's not a subclass of java.lang.RunTimeException.

            * If a method uses another method that may throw a checked exception, one of two of the following things should
              be true

                - The method should be enclosed within a try-catch block, or
                - The method should specify this exception to be thrown in its method signature.

            * A checked exception is an unacceptable condition that a programmer foresees at the time of writing a method.
              By declaring these exceptions as checked exceptions, the author of the method makes its users aware of the
              exceptional conditions that can arise from its use.

            * Checked Exceptions
                - Exception
                - IOException
                - FileNotFoundException
                - ParseException
                - ClassNotFoundException
                - CloneNotSupportedException
                - InstantiationException
                - InterruptedException
                - NoSuchMethodException
                - NoSuchFieldException

         */

        // Unchecked Exceptions
        try {
            String[] usernames = {"BOFlaherty", "JBloggs"};
            System.out.println(usernames[3].toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            /*
                Should we catch RunTimeExceptions, it depends. An argument is that if unchecked exceptions are programmer
                foreseen errors, should we catch the exception, or simply fix root of the problem. How can we prevent an
                ArrayIndexOutOfBoundsException from being thrown?
             */
            e.printStackTrace();
        }

        // throws an checked exception via the method signature (They have no catch or finally clauses)
        FileInputStream fileInputStream = new FileInputStream("testing.text");

        /*
            Runtime Exceptions (aka - an unchecked Exceptions)

            * A runtime exception is a representation of a programming error. These occur from inappropriate use of
              another piece of code. For example, NullPointerException is a runtime exception that occurs when a piece of
              code tries to execute some code on a variable that hasn't been assigned an object and points to null.
            * A runtime exception is a subclass of java.lang.RunTimeException.
            * A runtime exception may not be a part of the method signature, even if a method may throw it.

            Unchecked Exceptions
                - ArrayIndexOutOfBoundsException
                - ClassCastException
                - IllegalArgumentException
                - IllegalStateException
                - NullPointerException
                - NumberFormatException
                - AssertionError
                - ExceptionInInitializerError
                - StackOverflowError
                - NoClassDefFoundError

        */
    }


}
