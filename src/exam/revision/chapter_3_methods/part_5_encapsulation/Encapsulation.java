package exam.revision.chapter_3_methods.part_5_encapsulation;

/**
 * Encapsulation (information hiding)
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 23/10/2014
 * @project JavaExamProject
 */
public class Encapsulation {

    /*

        * A well-encapsulation object doesn't expose its internal parts to the outside world.
        * It defines a set of methods that enable the users of the class to interact with it.
        * The private members of a class, it's variables and methods, are used to hide information about a class.
        * A class may need a number of variables and methods to store an object's state and define it's behavior.

     */

     public static void main(String[] args) {

         Person person = new Person();

         // Example of Encapsulation

         // if the access modifier for firstName is set to private in Person, a user can not modify the value.
         // person.firstName = "Benjamin";

         // if the access modifier is set to default, a user can manipulate the value. (exposed to outside world)
         person.lastName = "OFlaherty";

     }

    /*
        Exam Tip

        The terms of encapsulation and information hiding are used interchangeably. By exposing object functionally only
        through methods, you can prevent your private variables from being assigned any values that don't fit your
        requirements. One of the best ways to create a well-encapsulated class is to define its instance variables as
        private variables and allow access to these variables using public methods (getters/setters).


        Well-encapsulated classes don't expose their instance variables outside of their class.

     */


}
