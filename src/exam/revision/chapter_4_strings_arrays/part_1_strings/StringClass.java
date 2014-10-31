package exam.revision.chapter_4_strings_arrays.part_1_strings;

/**
 * The String Class
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 31/10/2014
 * @project JavaExamProject
 */
public class StringClass {

    public static void main(String[] args) {

    /*
        The String Class

        * Is located in the package java.lang.
        * The String class represents character strings.
        * It's most commonly used methods are:
            - indexOf()
            - subString()
            - replace()
            - charAt()
        * The String class is perhaps the most used class in the Java API.
        * String's are zero based positions, the first character in a String is stored in
          position zero.


        Creating String Objects

        * You can create objects of the class String by using the new operator, but using the
          new operator or the assignment operator (=), or by enclosing the value within double
          quotes ("value").

     */

        String str1 = new String("Paul");
        String str2 = new String("Paul");

        // equals false/
        System.out.println(str1 == str2);

    /*  These two objects will not be equal to one another (different object references, but they
        will have the same value. The two values str1 & str2 refer to different String objects.
    */

        // equals true
        System.out.println(str1.equals(str2));

        String str3 = "Harry";
        String str4 = "Harry";

        // equals true
        System.out.println(str3 == str4);

        /*
            The result of == of two Strings that have been created using the = will result as true.
            This is because the two String values refer to the same object.

            In the example of str3 & str4, the objects are created and stored in a pool of String
            objects. Before creating a new object in the pool, Java will search for an object with
            similar contents. Therefore, when str4 is requesting to be created, Java will search
            this pool of Strings and find that str3 with the same content has already been created.

            str4 refers to the the String object of str3. Therefore, these two variables shares the
            same object reference.

            The final way to create is a String is to simply do the following:

            When a String variable is created using " " (double quotes), the JVM will create a
            String object with the specified value and places it in the String constant pool.

         */

        //System.out.println("MyStringValue");

        String str5 = "MyStringValue";

        // equals true as MyStringValue has been created in the String constant pool
        System.out.println("MyStringValue" == str5);

        /*

            If we had created str5 using the new String operator, the value of the above expression
            would result in false as the value would not have been stored in the constant pool and would
            have been created as a new String object (with a different reference).


            - As String is a class, you can assign null to it.

                String exampleStr = null;


            The String Class is Immutable

            - The concept that the class String is immutable is an important point to remember.
            - Once created, the contents of an object of the class String can never be modified.
            - String objects can be shared across multiple reference variables without any fear of
              changes in their value.

        */

        // str is the reference of the new String object that has been created.
        String str = new String();

        // str refers to an object with a value of "Hello"

        str  = "Hello";
        System.out.println(str);  //Prints Hello

        // str refers to an object with a value of "Hello!"

        str = "Help!";
        System.out.println(str);  //Prints Help!

        // "Hello" & "Help!" are two separate objects that have been created within the String
        // constant pool.


        /*
            Methods of the Class String

            - CharAt()

             You can use the method charAt(int index) to retrieve a character at a specified index
             of a String.

             If an integer value that exceeds the length of the String, the JVM will throw a
             RunTimeException, StringIndexOutOfBoundsException

        */

        String example1 = "MyStringValue";
        // equals S
        System.out.println(example1.charAt(2));
        // equals e
        System.out.println(example1.charAt(12));


        /*
            - indexOf(String/char value);

            The indexOf method will return the first found index value (int) of a given String
            or Char, if found within the given String.

            If a character is searched for and does not exist in the given String, -1 will be the
            resulting output.

            By default the indexOf() method starts its search from the first char of the target String.
            You can however set the starting position, to an integer number. For exaple, to find the
            2nd instances of the given value.

         */

        // equals 8
        System.out.println(example1.indexOf("V"));

        // equals -1
        System.out.println(example1.indexOf("Z"));

        String example2 = "West Ham United";

        // prints 13, instead of 1
        System.out.println(example2.indexOf("e", 2));


        /*
            The substring() method

            - The substring() method is shipped in two flavors.
            - The first version returns a substring of a given String from the positions you
              specify to the end of the String.

         */

        // equals United
        System.out.println(example2.substring(9));

        /*
            - The second method allows us to specify an end potion (instead of the default, end
             of String).

             Exam Tip - The substring() method doesn't include the character at the end position
             in its return value, if you wish to see that character you must increase the count by 1.

         */

        // equals Ham
        System.out.println(example2.substring(5,8));


        /*
            The trim() Method

            - The trim() method returns a new String by removing all of the leading and trailing
              white spaces within the given String.
            - White spaces are blanks (new lines, spaces or tabs).
            - This method will not remove white spaces within a String, only at the start/end.

         */

        String whiteSpace = " This_String_Has_White_space ";
        System.out.println(whiteSpace);
        System.out.println(whiteSpace.trim());


        /*
            The replace() Method

            - This method will return a new String by replacing all the occurrences of a char with
              another char.
            - Instead of specifying a char to be replaced by another char, you can also specify
              a sequence of characters, a String to be replaced by another String.
         */

        String example3 = "ABCAB";
        System.out.println(example3.replace('B', 'b'));
        System.out.println(example3.replace("CA", "12"));


        /*
            The length() method

            - You can use the length() method to retrieve the length of a String.

            Exam Tip - The length of a String is one number greater than the position it stores its
            last character. A String starts at position 0, instead of 1.


            The startsWith() and endsWith() Methods

            - The method startsWith() determines whether a String starts with a specified prefix,
              specified as a String.
            - You can also specify whether you wish to search from the star of a String or from a
              particular position.
            - The method returns true if a match is found and false if otherwise.


            - endsWith() performs the same behavior as startsWith() but in reverse.

         */

        String example4 = "PremierLeague";
        // equals true
        System.out.println(example4.startsWith("P"));
        // equals true
        System.out.println(example4.startsWith("L", 7));
        // equals false
        System.out.println(example4.startsWith("p"));


       /*
           Method chaining

           - It's common practice to use multiple String methods in a single line of code.
           - The methods are evaluated from left to right.
           - Method chaining is one of the favourite topics of the exam authors.

           Exam Tip - When chained, the methods are evaluated from left to right.

        */

        // returns length of string
        System.out.println(example4.replace('e', 'F').trim().length());
        // returns value of String with replaced character
        System.out.println(example4.replace('e', 'F').trim());

        String example5 = "ABCAB";
        System.out.println(example5.substring(0, 2).startsWith("A"));

    }
}
