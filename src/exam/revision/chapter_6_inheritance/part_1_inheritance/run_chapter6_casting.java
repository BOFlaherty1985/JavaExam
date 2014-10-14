package exam.revision.chapter_6_inheritance.part_1_inheritance;

/**
 * Run chapter 6 code - Casting
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 13/10/2014
 * @project JavaExamProject
 */
public class run_chapter6_casting {

    public static void main(String[] args) {

        /**
        * Casting
        *
        * - Casting is the process of forcefully making a variable behave as a variable of another type.
        * - If a class shares an IS-A inheritance relationship with another class or interface, their variables can
        * be cast to each others type.
        *
        */

        /**
        * The compiler knows that the type of the variable interviewer_one is Interviewer and that the interface
        * Interviewer doesn't define any variable with the name sizeOfTeam (int). Therefore the variable is not accessible
        *
        */

        Interviewer interviewer_one = new Manager("Joe", "Bloggs");
        // interviewer_one.sizeOfTeam

        // Casting is another method of telling Java, "look, I know that the actual object being referred to is a
        // Manager,  even though I'm using the reference variable of type Interviewer.
         ((Manager)interviewer_one).sizeOfTeam = 2;

    }

}