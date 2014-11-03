package exam.revision.chapter_5_flow_control;

/**
 * If / Else Loop
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 03/11/2014
 * @project JavaExamProject
 */
public class IfElseLoop {

    /*
        The If and If-else constructs

        * An if construct enables you to execute a set of statements in your code based on the result of a condition.
        * This condition must always evaluate to a boolean or a Boolean value.
        * You can specify a set of statements to execute when this condition evaluates to true or false.
        * Multiple flavors of the if statement are available to the programmer:
            - if
            - if-else
            - if-else-if-else

        Exam Tip

        * In Java 'then' is not a keyword, therefore it shouldn't be used with the if statement.
        * The if-else-if-else is an if-else construct which the else part defines another if construct

     */

    public static void main(String[] args) {

        int score = 200;
        String name = "Lion";

        // if construct example
        if (name.equals("Lion")) {   // evaluates to true
            score = 500;
        }

        assert (score == 500);
        System.out.println(score); // output 500


        name = "Panda";

        // if/else construct example
        if (name.equals("Tiger")) { // evaluates to false
            score = 1000;
        } else {
            score = 2000;
        }

        assert (score == 2000);
        System.out.println(score); // output 2000


        String result = "1";
        score = 10;

        // the value of score is accumulating after each if/else if construct, but it's total value is never equal to
        // true, therefore result is set to "F" (else, if none of the other if constructs are true)
        if ((score = score + 10) == 100) {
            result = "A";
        } else if ((score = score + 29) == 50) {
            result = "B";
        } else if ((score = score + 200) == 10) {
            result = "C";
        } else {
            result = "F";
        }

        System.out.println(result + " : " + score);  // equals F:249


    /*
        Missing else blocks

        * Even if an if statement doesn't define either the 'then' or else part of the if statement, it is valid.
        * You are not required to provide an else statement/block.
     */

        if(score == 249) System.out.println("Valid IF construct");


    /*
        The presence and absence of the {} within the If construct

         * You can execute a single statement or a block of statements when an if condition evaluates to true or false.
         * An if block is marked by enclosing one or more statements within a pair of curly braces, {}.
         * An if block will execute a single line of code if there are no braces, but will execute an unlimited number
           of lines if they're contained within a block.
         * The curly braces are optional if there's only one line within the if statement.

         Exam Tip
         In the exam, watch out for code like this that uses misleading indentation in if constructs. In the absence of
         defined code block ( {} ), only the statement following the if construct will be considered to be part of it.

     */

        if(score == 500)  // score = 249
            System.out.println("Output Success Message to Console."); // this will not print
            result = "Testing";  // will execute regardless of whether score is equal to 249, without the curly brackets
                                 // only the first line of an if statement will be executed.

        System.out.println(result);

        if(score == 500)  // score = 249
            System.out.println("Output Success Message to Console.");
            //result = "ABCDEF"; // will cause a compile error, only the 1st line after the if statement (without brackets)
                               // is valid.
        else
            System.out.println("else print me!");


    /*
        Appropriate versus inappropriate expressions passed as arguments to an if statement

        * == compares two values
        * <= less than or equal to
        * >= greater than or equal to
        * .equals(object)
        * (testing) - evaluates the boolean value, if it is equal to true the JVM will process the if statement code.

        Exam Tip
        Watch out for code in the exam that uses the assignment operator (=) to compare a boolean value in the if
        condition. It won't compare the boolean value; it'll assign a value to it.
        The correct operator for comparing a boolean value is the equality operator (==).


        Nested if constructs

        * A nested if construct is an if construct defined within another if construct.
        * There is theoretically no limit to how many levels of if-else constructs you can have.

     */

        score = 200;

        if(score == 100)
            if(score == 200)
                if (score == 300)
                        System.out.println(("Score Equals 300"));
                    else
                        System.out.println("Not Equal to 300");
                    else
                        System.out.println("Not Equal to 200");
                    else
                        System.out.println("Not Equal to 100");

    }

}
