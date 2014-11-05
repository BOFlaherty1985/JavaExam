package exam.revision.chapter_2_data_types;

/**
 * Operators
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 15/10/2014
 * @project JavaExamProject
 */
public class Operators {

    public static void main(String[] args) {

        /*
            Operators

            Assignment Operators

            * Can be used to assign or reassign values to all types of variables.
            * A variable can't be assigned to an incompatible value. For example, character and numeric values can not
              be assigned to a boolean variable.
            * += and -= are short forms of addition and subtraction, and assignment.
            * += can be read as 'first add and then assign', and -= can be read as 'first subtract and then assign".

            * other assignment operators are, *= and /= (same rules apply).
         */

        int value_one = 45;
        int value_two = 25;

        // equals 70
        System.out.println(value_one += value_two);

        int value_three = 50;
        int value_four = 30;

        // equals 20
        System.out.println(value_three -= value_four);

        // assigns the value of '30' to the variables 'value_one' and 'value_two'
        value_one = value_two = 30;
        System.out.println(value_one);
        System.out.println(value_two);

        // equals 60
        System.out.println(value_one += value_two);


        /*
            * You can assign a bigger value to a variable that can only store smaller ranges by explicitly casting the
              bigger value to a smaller value. In the below example, an integer can easily fit into a long variable.

              Exam Tip - You can't use the assignment operators to assign a boolean value to variables of type char, byte,
              int, short, long, float or double.
         */

        int intVal = 102;
        long longVal = intVal;
        System.out.println("Explicit casting example: " + longVal);

        /*
            + addition
            - subtraction
            * multiplication
            / division (quotient)
            % modulus (remainder)
            ++ unary increment operator, increase value by 1;
            -- unary increment operator, decrease value by 1;

            unary operators (increment and decrement), for example, ++a and a++ will behave in exactly the same way.

            When unary operators are used in an expression, its placement with respect to its operand decides whether
            its value will increment or decrement before, or after the expression.

         */

          int a = 20;
          int b = 45;

          // c = 20 - (45+1);
          int c = a - ++b;

          // equals -26
          System.out.println(c);
          // equals 46
          System.out.println(b);


        /*
            Relational Operators

            * Relational operators are used to compare values for equality (==) and non-equality (!=). They are also
              used to determine whether two numeric values are greater than (>, >=) or less than (<, <=) each other.
            * You can't compare incomparable values. For example, you can't compare a boolean with an int, a char or a
              floating-point number. If you try to do this, your code will not compile.
            * The operators equal to (==) and not equal to (!=) can be used to compare all types of primitives: char, int
              short, byte, float, double and boolean.
            * == returns true if the primitive values you're comparing are equal.
            * != returns true if the primitive values you're comparing are not equal.
            * The result of the relational operator is always a boolean value (true/false).
            *
         */

         /*
            Logical Operators

            * You can use the logical operators to determine whether a set of conditions is true or false.
            * Logical AND (&&) evaluates to true if all operands are true and false otherwise.
            * Logical OR (||) evaluates to true if any of the operands are true.
            * Logical negation (!) negates the boolean value, it evaluates to true for false and vice versa.
            * The result of a logical operation is always a boolean value.
            *

          */

    }

}
