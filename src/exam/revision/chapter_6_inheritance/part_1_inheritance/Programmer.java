package exam.revision.chapter_6_inheritance.part_1_inheritance;

import java.util.Arrays;

/**
 * Programmer Object
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 13/10/2014
 * @project JavaExamProject
 */
public class Programmer extends Employee implements Trainable {

    private String[] programmingLanguages;
    private String qualification;

    /*
        The 'super' keyword

        Super is also an object reference, but 'super' refers to the parent of base class of a class.

        The variable reference 'super' can be used to access a variable or method from the base class if there's a clash
        between these names. This situation normally occurs when a derived class defines variables and methods with the
        same name as the parent class (super class).

        Exam tip: If present, a call to a superclass's constructor must be the first statement in a subclass (derived
        class's constructor. Otherwise, a call to super(); (no-arg constructor) is inserted automatically by the compiler.

    */

    public Programmer(String firstName, String lastName) {
        super(firstName, lastName);
        super.emailAddress = "b_oflaherty@hotmail.com";
    }

    public String[] getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String[] programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    public void writeCode() {
        System.out.println("Start Programming...");
    }

    @Override
    public void attendTraining() {
        System.out.println("Programmer - Attending Training...");
    }


    /*
        The keywords super and this are implicit object references. Static methods belong to a class, not to objects of
        a class, you can't use this and super in static methods, code that tries to do so won't compile.
    */
    static void setQualification(String qualification) {
        //this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "programmingLanguages=" + Arrays.toString(programmingLanguages) +
                '}';
    }

}
