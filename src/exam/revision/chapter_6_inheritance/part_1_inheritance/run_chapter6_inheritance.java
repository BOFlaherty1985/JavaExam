package exam.revision.chapter_6_inheritance.part_1_inheritance;

import java.util.Date;

/**
 * Run chapter 6 code - Inheritance
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 13/10/2014
 * @project JavaExamProject
 */
public class run_chapter6_inheritance {

    public static void main(String[] args) {

        /**
         * - Definitions
         *
         * Base class: A class inherited by another class.
         * Super class: A base class is also known as a superclass
         * Parent class: A base class is also known as a parent class
         * Derived class: A class that inherits from another class. The classes Programmer and Manager are derived
         * classes in the below example
         * Subclass: A derived class is also known as a subclass
         * Extended class: A derived class is also known as an extended class
         *
         *
         * Which base class members are inherited by a derived class?
         *  - default: members with default access can be accessed in a derived class only if base and derived classes
         *  reside in the same package.
         *  - protected: members with protected access are accessible to all the derived classes, regardless of the package.
         *  - public: members with public access re visible to all other classes
         *
         *
         * Which base class members aren't inherited by a derived class?
         *  - private members of the base class
         *  - Base class members with default access, if the classes are in separate packages
         *  - Constructors of the base class
         */

        // build a new computer programmer object
        Programmer employee_one = new Programmer("Benjamin", "O'Flaherty");
        employee_one.setDateOfBirth(new Date());
        employee_one.setEmailAddress("test@test.com");

        // methods within the Programmer class (which extends Employee)
        employee_one.writeCode();

        // setup programming languages
        String[] programmingLanguages = new String[2];
        programmingLanguages[0] = "Java";
        programmingLanguages[1] = "Groovy";

        employee_one.setProgrammingLanguages(programmingLanguages);
        System.out.println(employee_one.toString());

        String firstName = new Programmer("Testing", "User").getFirstName();
        System.out.println("firstName: " + firstName);
        String lastName = new Programmer("Testing", "User").getLastName();
        System.out.println("lastName: " + lastName);

        /**
         * Abstract classes
         *
         * - You can never create objects of an abstract class
         * - A base class can be defined as an abstract class, even if it doesn't define any abstract methods
         * - A derived class should implement all of the abstract methods of its base class.
         * - You can use variables of an abstract base class to refer to objects of its derived class.
         * - An abstract class can extend a concrete class and vice versa.
         * - An abstract class can implement a number of interfaces.
         * - An abstract class can extend another abstract class.
         *
         */

        // method called from the Interviewer interface
        employee_one.attendTraining();

        Interviewer interviewer = new Manager("Joe", "Bloggs");
        interviewer.attendTraining();
        interviewer.reviewCandidate("Benjamin O'Flaherty");

    }

}