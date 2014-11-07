package exam.revision.chapter_5_flow_control;

import java.util.ArrayList;
import java.util.List;

/**
 * For Loop
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 03/11/2014
 * @project JavaExamProject
 */
public class ForLoop {

    public static void main(String[] args) {

        /*
            The For Loop Construct

            * A for loop is usually used to execute a set of statements a fixed number of times.

                for(starting point; condition; ending point (++ or --))

            Parts of a For Loop

            Initialization block (starting point)

            * An initialization block executes only once.
            * A for loop can declare and initialize multiple variables in its initialization block.
            * However, the variables that it declares should be of the same type.
            * You can not declare variables of different types within the same initialization block. (will not compile)
            * The variables defined within this block are limited to the for construct, they can not be used outside of the
              the loop.

        */

        for(int a = 0, b = 1; a < 10; a++, b--) {
            System.out.println(a);
            System.out.println(b);
        }

        /*
            Termination Clause

            * The termination clause is evaluated for each iteration before executing the statements defined within the
              body of the loop.
            * The for loop terminates when the termination condition is equal to false.


            The Update Clause

            * Code defined within this block of the for loop executes after all the code defined in the body of the for
              loop. (end of the for loop logic)
            * The termination clause is executed next, and if this returns 'true', the update clause will be executed.


            Nested For Loop

            * If a loop encloses another loop, they are called 'nested loops'
            * The loop that encloses another loop is called the 'outer loop' and the enclosed loop is referred to as the 'inner loop'.
            * There are no limits on the levels of nesting for loops.
            * Nested loops are often used to initialize or iterate over multidimensional arrays.

         */

            int[][] multiArray;
            multiArray = new int[3][5];

            // outer for loop
            for(int x = 0; x < multiArray.length; x++) {
                // inner for loop
                for(int y = 0; y < multiArray[x].length; y++) {

                   multiArray[x][y] = x + y;
                   System.out.println("multiArray[" + x + "] [" + y + "]" + multiArray[x][y]);
                }

            }

        /*
            The enhanced for loop

            * The enhanced for loop is also called the for-each loop, and offers some advantages over the regular for loop (it also has some limitations).
            * There is less code clutter within the enhanced for loop, and the code is easier to write and comprehend.
            * The colon within the enhanced for loop can be interpreted as 'IN'
            * The enhanced for loop can not be used to initialize an array and modify its elements
            * The enhanced for loop can't be used to iterate over multiple collections or arrays in the same loop.
            * The enhanced for loop can't be used to delete the elements of a collection.  (ConcurrentModificationException)
            * The enhanced for loop is simpler than the standard for loop, but less flexible.

            Exam Tip
            Use the for-each loop to iterate arrays and collections. Don't use it to initialize, modify or filter them.

         */

        List<String> firstNames = new ArrayList<String>();
        firstNames.add("Benjamin");
        firstNames.add("Mark");
        firstNames.add("David");
        firstNames.add("Sandy");

        for(String name : firstNames) {
            System.out.println(name);
        }

    }

}

