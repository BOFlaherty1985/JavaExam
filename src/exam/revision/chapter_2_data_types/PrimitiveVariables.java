package exam.revision.chapter_2_data_types;

/**
 * Primitive Variables
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 15/10/2014
 * @project JavaExamProject
 */
public class PrimitiveVariables {

    public static void main(String[] args) {

        /*
            Exam Tip - Watch out for questions that use incorrect names for primitive data types. For example, there isn't
            any bool primitive data type in Java.

            Remember that only two types of Primitive data types are shorted, char and int.

         */


        // Numeric Primitive Types
        byte b = 5;
        int i = 1;
        short s = 5;
        long l = 1L;

        // Booleans Primitive Types
        boolean value = true;

        // Floating-point Primitive Types
        float f = 1F;
        double d = 2D;

        // Character Primitive Types
        char c = 'G';


        /*
            Primitive Data Types

            * Primitive data types are the simplest data types in Java.
            * Primitive data types are pre-defined by the programming language. A user can't define a primitive data type
             in Java. (Custom type)
            * It's helpful to categorise the primitive data types into three groups, boolean, numeric and character data types.


            Boolean Data Type

            * The boolean data type is used to store data with only two possible values, these two possibilities are 'true'
             or 'false'  (that can represent, 1 or 0 / yes or no etc)
            * true and false are literal values
            * A literal is a fixed value that doesn't need further calculations to be assigned any variable.


            Numeric Data Type

            * Numeric values can be stored wither as integers or decimal numbers (floating points).
            * bye, short, int and long can be used to store integers.
            * The byte, short, int and long data types use 8, 16,32 and 64 bits respectively to store their values.
            * float and double can be used to store decimal numbers, and are 32bit and 64bit respectively.
            * The default type of integers, that is, non decimal numbers is int.
            * To designate an integer literal value as a long value, you must add the suffix 'L' or 'l' to the end of the
              numeric value.
            * The default type of decimal number is a double.
            * In Java 7, you can use underscores in literals to make the code easier to read i.e. ox10_B
            * The suffixes D and d can be used to mark a literal value as a double value, and an F or F can be used to mark
              the variable as a float.


            Character Data Type

              * A char data type can store a single 16bit Unicode character, that is, it can store characters from virtually
                all of the worlds existing scripts and languages.
              * Internally, the char data type is stored as an unsigned integer value (only positive integers)
              * When you assign a letter to a charm Java stores its integer equivalent value.
              * Single quotes, not double quotes, are used to assign a letter to a char variable.

         */

    }

}
