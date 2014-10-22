package exam.revision.chapter_3_methods.part_2_object_lifecycle;

/**
 * An Objects Lifecycle
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 22/10/2014
 * @project JavaExamProject
 */
public class ObjectLifeCycle {

    public static void main(String[] args) {

        // Object accessible example
        Exam myExam = new Exam(); // creates a new object and is referred to using the variable name 'myExam'
        myExam.setExamName("Exam Name Goes Here"); // set the name of the exam
        myExam = null; // sets the variable to null, variable myExam is no longer accessible (eligible for GC at this point)

        myExam = new Exam(); // creates a new object of class Exam and assigns it to the reference variable 'myExam'
        myExam.setExamName("New Name Goes Here"); // calls method setName(), on the second Exam object  (no longer eligible for
        // GC)

        Exam gc_exam_one; // eligible for garbage collection
        Exam gc_exam_two = new Exam(); // NOT eligible
        gc_exam_two = null; // eligible for garbage collection

        System.out.println(myExam.toString());
    }

    /*
        Object Life Cycle

        * Java doesn't allow you to allocate memory yourself when you create or destroy objects.
        * Java provides a method called finalize, which is accessible to all of the classes.
        * The method finalize is defined in the class java.lang.Object, whcih is the base class for all Java objects.
        * All Java classes can override the method finalize, which executes just before an object is garbage collected.
        * In theory, you can use this method to free up resources being used by an object. Although it is not recommended.
        * An objects lifecycle starts when it is created and lasts until it goes out of its scope or is no longer referenced
         to by a variable.


         An Object is Born

         * An object comes into the picture when you use the keyword operator 'new'
         * You can initialize a reference variable with this object.
         * An object is only created when a reference variable has been initialized.

            Person person; // object has not been created
            Person person = new Person(); // object has been created

         * The majority of objects are created using the 'new' keyword, however a String can also be initialised using the
           = (equals) operator.

            String value = "Testing" // creates a new String object called 'value'

           Exam Tip: Watch out for a count of the total objects created in any given code, the ones that can be accessed
           using a variable and the ones that can't be accessed using any variable. The exam may question you on the count
           of objects created.


         Object is accessible

           * Once an object has been created, it can be accessed using its reference variable.
           * It remains accessible until it goes out of score or its reference variable is explicitly set to null.
           * Also, if you reassign another object to an initialized reference variable, the previous object becomes
             inaccessible.
           * You can access and use an object within other classes and methods.


        Object is inaccessible
           * An object can be inaccessible if it goes out of scope.
           * Objects adhere to the same rules as variables in relation to scope, if a Object is created and referenced
             within an if-else, switch or loop (flow control) is not accessible outside of these constructs.

           Exam Tip: An object is marked as eligible to be garbage collected when it can no longer be accessed, which can
           happen when the object goes out of scope. It can also happen when an object's reference variable is assigned an
           explicit 'null' value or reinitialized.

           * The garbage collector is a low-priority thread that marks the objects eligible for garbage collection in
             the JVM and then clears the memory of these objects. You can determine only which objects are eligible to
             be garbage collected. You can never determine when a particular object will be garbage collected. A user can't
             control or determine the execution of a garbage collector. It's controlled by the JVM.

     */


}
