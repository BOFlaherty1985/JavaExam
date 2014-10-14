package exam.revision.chapter_7_exceptions;

/**
 * ArrayAccess Exception Object
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 14/10/2014
 * @project JavaExamProject
 */
public class ArrayAccess {

    public static void main(String[] args) {

        // invalid array index (maximum value is [3])
        String[] students = {"Benjamin", "Joe", "Matthew"};

        try {
            System.out.println(students[5].toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error thrown");
            e.printStackTrace();
        }

        System.out.println("code has continued to run");

        /*
            Why handle exceptions separately?

            For actual conditions you may have to verify whether you've completed the previous step before you can
            progress with the next step.

            If exception handlers are defined separately, any confusion with the steps that you need to accomplish to
            complete an action (or set of actions) has been clarified. Additionally, the code doesn't compromise the
            completion of a step before moving on to the next step, courtesy of teh appropriate exception handlers.

            If an exception is thrown, a catch statement can process the exception (printStackTrace() / log) and continue
            to process the remainder of the code, the application will not fall over (unless you tell it to).


            Do exceptions offer any other benefits?

            Apart from separating concerns between defining the regular program logic and the exception handling code,
            exceptions also can help pinpoint the offending code (code that throws an exception), together with the
            method in which it is defined, by providing a stack trace of the exception or error.


            What happens when an exception is thrown?

            * An exception is a Java object.
            * All types of exceptions subclass java.lang.Throwable.
            * When a piece of code hits an obstacle in the form of an exceptional condition, it creates an object of
              class java.lang.Throwable (at runtime an object of the most appropriate subtype will be created) and is then
              assigned a type.
            * This newly created object is then handed to the JVM, the JVM blows a siren in the form of this exception
              and looks for an appropriate code block that can "handle" this exception.

         */

    }

}
