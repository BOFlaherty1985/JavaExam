package exam.revision.chapter_5_flow_control;

/**
 * While Loop
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 03/11/2014
 * @project JavaExamProject
 */
public class WhileLoop {

    /*
        The While Loop

        * A while loop is used to repeatedly execute a set of statements as long as its condition evaluate to true.
        * This loop checks the condition before it starts the execution of the statement.
        * The while loop accepts arguments of type booleans or Boolean.

     */

    public static void main(String[] args) {

        int i = 0;

        System.out.println("WHILE LOOP");

        while(i < 10) { // checks that the condition is equal to 'true' before processing the body of the construct.
            System.out.println(i + " is less than 10");
            ++i;
        }


    /*
        The Do While Loop

        * A do-while loop is used to repeatedly execute a set of statements until the condition that it uses executes
          to false.
        * The loop checks the condition after it completes the execution of all statements in the loop body.
        * The do-while loop accepts arguments of type boolean or Boolean.

        Note:
        Don't forget to use a semicolon (;) to end the do-while loop after specifying its condition.

     */

        System.out.println("DO WHILE LOOP");

        do {
            System.out.println(i + " is less than 10");
            i++;
        } while(i < 20); // executed after the loop body (do statement), if true, the 'do' construct will be repeated.

    }

}
