package exam.revision.chapter_6_inheritance.part_2_polymorphism;

import java.util.Date;

/**
 * Run chapter 6 code - Polymorphism
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 13/10/2014
 * @project JavaExamProject
 */
public class run_chapter6_polymorphism {

    public static void main(String[] args) {

        /*
        Polymorphism

        The literal meaning of the word "polymorphism" is "many forms". Reacting to the same action in owns own
        unique way is a form of polymorphism is Java.

        Polymorphism comes into the picture when a class inherits another class and both the base and derived classes
        define methods with the same method signature (method name and parameters).

        The usefulness of polymorphism lies in the ability of an object to behave in its own specific manner when the
        same action is passed to it.

        Polymorphic methods are also called 'overridden' methods (@Override). These methods have the same name and
        number of method parameters, this is a contract specified to define overridden methods. Failing to user the same
        method name, same argument list, or same return type will not mark the method as an overridden method.

        */

        Employee emp_one = new Programmer("Benjamin", "OFlaherty", new Date(), "ben@test.com");
        Employee emp_two = new Manager("Joe", "Bloggs", new Date(), "joe@Bloggs.com");

        // expected to return the same String from the Employee.class
        emp_one.reachOffice();
        emp_two.reachOffice();

        // expected to return object specific result based on calling the abstract methods implemented method(s) in each
        // object.
        emp_one.startProjectWork();
        emp_two.startProjectWork();

        // overridden non-abstract methods in the subclasses using @Override
        emp_one.endProjectWork();
        emp_two.endProjectWork();

        // Data Binding
        System.out.println(emp_one.firstName);
        System.out.println(emp_one.lastName);
        System.out.println(emp_one.dateOfBirth);
        System.out.println(emp_one.emailAddress);

        System.out.println(emp_two.firstName);
        System.out.println(emp_two.lastName);
        System.out.println(emp_two.dateOfBirth);
        System.out.println(emp_two.emailAddress);
    }

}
