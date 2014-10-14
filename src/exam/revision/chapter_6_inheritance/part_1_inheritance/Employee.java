package exam.revision.chapter_6_inheritance.part_1_inheritance;

import java.util.Date;

/**
 * Employee Object
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 13/10/2014
 * @project JavaExamProject
 */
public class Employee {

    // protected: members with protected access are accessible to all the derived classes, regardless of the package.
    protected String firstName;
    protected String lastName;
    protected Date dateOfBirth;
    protected String emailAddress;

    /*
        The 'this' keyword

        The 'this' keyword reference always points to an object's own instance. Any object can use the this reference to
        to refer to its own instance.

        You can use the keyword this to refer to all methods and variables that are accessible to a class. Because there
        exists an object of class Employee within the class Programmer, the variable name is accessible to an object of
        Programmer. The 'this' reference may be used only when code executing within a method block needs to differentiate
        between an instance variable and its local variable or method parameters.

        Exam Tip - this refers to the instance of the class in which it's used. this can be used to access the inherited
        members of a base class (super) in the derived class (subclass)

    */

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /*
        Using 'this' keyword to access constructors

        You can also differentiate one constructor from another by using the keyword 'this'.

        In the below example, 'this' calls a constructor with firstName and lastName method parameters. this() can be used
        to call the default constructor, but it must be the first call within a constructor.

    */
    public Employee(String firstName, String lastName, String emailAddress) {
        this(firstName, lastName);
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
