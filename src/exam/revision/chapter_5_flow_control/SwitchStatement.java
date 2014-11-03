package exam.revision.chapter_5_flow_control;

/**
 * Switch Statement
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 03/11/2014
 * @project JavaExamProject
 */
public class SwitchStatement {

    public static void main(String[] args) {

        /*
            The Switch Statement

            * You can use a switch statement to compare the value of a variable with multiple values.
            * For each value within the switch statement, you can determine a set of statements to execute.

         */

        int marks = 10;

        switch (marks) {
            case 5:
                System.out.println("Marks is equal to 5");
                break;
            case 10:
                System.out.println("Marks is equal to 10");
                break;
            case 15:
                System.out.println("Marks is equal to 15");
                break;
            case 20:
                System.out.println("Marks is equal to 20");
                break;
            default:
                System.out.println("Default value if Marks is not equal to a value in the Switch statement");
        }

        /*
            * A switch statement can define multiple case labels within its switch block, but only a single default label.
            * The default label executes when no matching value is found within the case statement.
            * A break statement is used to exit a switch statement, after the code completes its execution for a matching case.

            Comparing a switch statement with multiple if/else constructs

            * A switch statement can improve the readability of your code by replacing a set of (rather complicated-looking)
              related if-else-if-else statements with a switch and multiple case statements.

            Exam Tip
            The if-else-if-else statement evaluates all of the conditions until it finds a match. A switch construct
            compares the argument passed to it with its labels (cases).


            Arguments passed to a switch statement

            * You can't use the switch statement to compare all types of values, such as all types of objects and primitives.
            * There are limitations of the types of arguments that a switch statement can accept.
            * A switch statement accepts types char, byte, short, int and String (from Java 7).
            * It also accepts arguments and expressions of types enum, Character, Byte, Integer and Short.
            * A switch statement doesn't accept arguments of type long, float or double, or any objects beside String.
            * You can also evaluate expressions within a switch statement.

            Exam Tip
            Watch out for questions in the exam that try to pass a primitive decimal type such as float or double to a
            switch statement. Code that tries to do so will no compile.

         */

        switch(marks * 2) {
            case 10:
                System.out.println("Expression Result Equals 10");
            case 20:
                System.out.println("Expression Result Equals 20");
            case 30:
                System.out.println("Expression Result Equals 30");
            default:
                System.out.println("Default message");
        }

    }

}
