package exam.revision.chapter_4_strings_arrays.part_1_strings;

/**
 * Description Here
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 31/10/2014
 * @project JavaExamProject
 */
public class StringBuilderMethod {

    private static String companyName = "AGEAS INSURANCE LIMITED";

    public static void main(String[] args) {

        /*
            The StringBuilder class

            * The class StringBuilder is defined in the package java.lang and it has a mutable
              sequence of characters.
            * You must use class StringBuilder when you're dealing with larger Strings or modifying
              the contents of a string often.
            * Doing so will improve the performance of your code.

            Exam Tip
            You can expect questions on the need for the StringBuilder class and its comparison with
            the String class.

            The StringBuilder class is mutable

            * The class StringBuilder uses a non-final char array to store its values.
            * It class String builder contains two variables, an array of char[] and an int for count (length).

            Creating StringBuilder objects

            * You can create objects of StringBuilding using multiple overloaded constructors:
            * String builder uses a 0 index (same as String), therefore the first char in the
              StringBuilder object will be at position 0.
            *

         */

        StringBuilder sb1 = new StringBuilder(); // default, initial capacity of 16.
        System.out.println(sb1.capacity());        // 16

        StringBuilder sb2 = new StringBuilder(sb1);
        System.out.println(sb2.capacity());  // 16

        StringBuilder sb3 = new StringBuilder(50); // defines a StringBuilder with capacity of 50 chars
        System.out.println(sb3.capacity()); // 50

        StringBuilder sb4 = new StringBuilder("Benjamin OFlaherty");
        System.out.println(sb4.length());
        System.out.println(sb4.capacity()); // 34  (18 + 16 = 34)


        /* Methods of the StringBuilder class

        append()

        * The append method adds the specified value at the end of the existing value of the
          StringBuilder object
        * This method accepts all of the primitive values, String, char, array and Object.

        */

        sb1.append("My value");
        sb2.append(12);
        sb3.append('c');
        sb4.append(new Object());

        sb1.append(true);
        System.out.println(sb1); // My valuetrue

        // you can append a complete char array to a StringBuilder object.

        StringBuilder sb5 = new StringBuilder();
        char[] array = {'a', 'b', 'c', 'd'};

        sb5.append(array);

        System.out.println(sb5);   // prints abcd

        /*

        insert()

        * The insert method is as powerful as the append method.
        * It also exists in multiple flavors that accept any data type.
        * The main difference between append and insert methods is that the insert method
          enables you to insert the requested data at a particular position, but append simply
          inserts the new value at the end of the StringBuilder object.
        * insert() inserts a new primitive value but does not replace the existing value at
          the current specified position.

        Exam Tip
        Take note of the start and end positions when inserting a value in a StringBuilder.
        Multiple flavors of the insert method defined in StringBuilder may confuse you because
        they can be used to insert either single or multiple characters.

        */

        StringBuilder sb6 = new StringBuilder("Benjamin");
        sb6.insert(3, "*");  // should output Ben*jamin
        System.out.println(sb6);

        // insert(position, array[], stat position of array, end position of array)
        sb6.insert(1, array, 1, 2);  // Bbcen*jamin
        System.out.println(sb6);

        /*

        delete()



        length()

        trimToSize()

        setLength()

        chartAt()

        indexOf()

        // subString()

        // setLength()

        */

        String randomStr = "489464-1402201400002qRFNW11hoMeBXczmhm13jIZ3OOBcJ8jM9zp4oT7WSsUwMLSRkJYCcjd1sgQqmfC77TtTvYNPCY9X8UhrZEKEL";

        StringBuilder stringBuilder = new StringBuilder(companyName);
        stringBuilder.append(" ");
        stringBuilder.append(randomStr);

        System.out.println(stringBuilder.toString());

    }
}
