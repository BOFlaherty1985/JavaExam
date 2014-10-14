package exam.revision.chapter_6_inheritance.part_2_polymorphism;

import java.util.Date;

/**
 * Employee Object
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 13/10/2014
 * @project JavaExamProject
 */
public abstract class Employee {

    protected String firstName;
    protected String lastName;
    protected Date dateOfBirth;
    protected String emailAddress;

    protected Employee(String firstName, String lastName, Date dateOfBirth, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.emailAddress = emailAddress;
    }

    public void reachOffice() {
        System.out.println("reached office - London, United Kingdom");
    }

    public abstract void startProjectWork();

    /*
        Do Polymorphic methods always have to be abstract?

        No, polymorphic methods don't always have to be defined as abstract.

        You can define the class Employee as a concrete class and the method startProjectWork as non-abstract method and
        still get the same result.

        Can Polymorphism work with overloaded methods?

        No, Polymorphism works only with overridden methods. Overridden methods have teh same number and type of method
        arguments, whereas overloaded methods define a method argument list with either a different number or type of
        method parameters.

        Overloaded methods only share the same name, the JRE treats them like different methods. In the case of overridden
        methods, teh JRE decides at runtime which method should be called based on the exact type of the object on which it's
        called.

     */

    public void endProjectWork() {
        System.out.println("End project work");
    }

}
