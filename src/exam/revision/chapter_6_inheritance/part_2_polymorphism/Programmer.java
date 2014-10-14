package exam.revision.chapter_6_inheritance.part_2_polymorphism;

import java.util.Date;

/**
 * Programmer Object
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 13/10/2014
 * @project JavaExamProject
 */
public class Programmer extends Employee {


    protected Programmer(String firstName, String lastName, Date dateOfBirth, String emailAddress) {
        super(firstName, lastName, dateOfBirth, emailAddress);
    }

    @Override
    public void startProjectWork() {
        defineClasses();
        unitTestCode();
    }

    private void defineClasses() {
        System.out.println("define classes");
    }

    private void unitTestCode() {
        System.out.println("unit test code");
    }

    @Override
    public void endProjectWork() {
        System.out.println("Programmer - end project work");
    }

}
