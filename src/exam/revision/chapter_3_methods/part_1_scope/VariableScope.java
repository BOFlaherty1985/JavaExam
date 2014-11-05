package exam.revision.chapter_3_methods.part_1_scope;

/**
 * Variable Scope
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 22/10/2014
 * @project JavaExamProject
 */
public class VariableScope {

    public static void main(String[] args) {

        int example_one = myLocalVariableExample(5, 10);
        System.out.println(example_one);

        instanceVariableExample();
        classVariableExample();

    }

    /*
        * The scope of a variable specifies its lifespan.
        * The available scopes of a variable are as follows:
            - Local variables (method-local variables)
            - Method parameters (method arguments)
            - Instance variables (attributes, fields and nonstatic variables)
            - Class variables (global, static variables)


        Local Variables

        * Local variables are defined within a method.
        * You would typically use a local variable to store the intermediate results of a calculation.
        * Local variables the shortest scope.
        * Local variables are only accessible within the method or flow statement in which they're defined.
        * The scope of a local variable depends on the location of its declaration within a method. A local variable
          defined within a loop, if-else or switch statements is limited to these constructs only.
        * Local variables defined outside of these constructs are available to the entire method.

        Exam Tip
        * You're likely to be asked a question that seems to be about rather complex logic, such as inheritance or
          exception handling, but in fact it'll be testing your knowledge on the scope of a local variable.

     */

        private static int myLocalVariableExample(int a, int b) {

            // local variable defined within the method to store the value of total
            int total = 0;

            total += a += b;

            if(total > 0) {
                String value_greater_zero = "Value is greater than 0";
                System.out.println(value_greater_zero);
            }

            // code will not compile as you can only access the variable value_greater_zero, from within the If statement
            // System.out.println(value_greater_zero);

            return total;
        }

     /*

        Method Parameters

        * The variables that accept values in a method are called method parameters.
        * They're accessible only in the method that defines them.
        * The scope of a method parameters may be as long as that of a local variable, or longer, but it can never be
          shorter.

        private static int myLocalVariableExample(int a, int b) { // a & b are both method parameters (variables)


        Instance Variables

        * An instance is simply another name for an object.
        * Instances variables are available for the life of an object.
        * An instance variable is declared within a class, outside of all of the methods.
        * The scope of an instance variable is longer than that of a local variable or method parameter.
        * An instance variable is accessible across the entire object and can modified by calling methods on the object.

      */

       private static void instanceVariableExample() {

           Person person = new Person();
           person.setFirstName("Benjamin");
           person.setLastName("O'Flaherty");

           System.out.print(person.toString());
       }


      /*

        Class Variables

        * A class variable is defined using the keyword static.
        * A class variable belongs to a class, not to individual objects of the class.
        * A class variable is shared across all objects, objects don't have a separate copy of a class variable.
        * You do not even need to create an instance of the object to access a class variable. It is accessible by using
          the name of the class, followed by the variable name.
        * Class variables are limited in scope to the package. Unless, the class variable is defined as 'public'

       */

       private static void classVariableExample() {
           System.out.println("class variable: " + Person.CLASS_NAME);
       }


       /*
         Variable Scope Comparison

         * Local variables are defined within a method and are normally used to store the intermediate results of a
           calculation
         * Method parameters are used to pass values to a method. These values can be manipulated and may also be stored
           as state of an object by assigning them to instance variables
         * Instance variables are used to store the state of an object. These are the values that need to be accessed by
           multiple methods.
         * Class variables are used to store values that should be shared by all the objects of a class.

        */

}
