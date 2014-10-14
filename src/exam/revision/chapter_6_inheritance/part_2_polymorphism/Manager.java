package exam.revision.chapter_6_inheritance.part_2_polymorphism;

import java.util.Date;

/**
 * Manager Object
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 13/10/2014
 * @project JavaExamProject
 */
public class Manager extends Employee {

    protected Manager(String firstName, String lastName, Date dateOfBirth, String emailAddress) {
        super(firstName, lastName, dateOfBirth, emailAddress);
    }

    /*

    Rules to remember when defining overridden methods

    * they are defined by classes and interfaces that share inheritance relationships.
    * The name of the overridden method must be the same in both the base class (super) and derived class (subclass).
    * The argument list passed to the overridden method must be the same in both the super class and subclass.
    * The return type of an overriding method in the derived class (sub) cam be the same, or a subclass of the return type
     of the overridden method in the super class.
    * When the overriding method returns a subclass of the return type of the overridden method, it is known as a
    covariant return type.
    * An overridden method defined in the super class can be an abstract method or a non-abstract method.
    * Access modifiers for an overriding method can be the same or less restrictive than the method being overridden,
      but they can not be more restrictive.

    Exam Tip - To implement polymorphism with classes, you can define abstract or non-abstract methods in the super class
    and override them in the subclass.

     */

    @Override
    public void startProjectWork() {
        meetingWithCustomer();
        defineProjectSchedule();
        assignRespToTeam();
    }

    private void meetingWithCustomer() {
        System.out.println("meet a customer");
    }

    private void defineProjectSchedule() {
        System.out.println("Schedule project work");
    }

    private void assignRespToTeam() {
        System.out.println("team work starts");
    }

    @Override
    public void endProjectWork() {
        System.out.println("Manager - end project work");
    }

}
