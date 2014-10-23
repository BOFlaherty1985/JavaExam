package exam.revision.chapter_3_methods.part_3_create_methods;

/**
 * Overloading Methods
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 23/10/2014
 * @project JavaExamProject
 */
public class OverloadingMethods {

    public static void main(String[] args) {

        String result_one = appendStringValues("Welcome", "Benjamin");
        System.out.println(result_one);

        String result_two = appendStringValues("Welcome", "Benjamin", "OFlaherty");
        System.out.println(result_two);
    }

   /*

        * Overloaded methods are methods with the same name but different method parameter lists.
        * They are defined in the same class with the same name.
        * Overloaded methods must have different parameters from one another.
        * Overloaded methods may or may not define a return type.
        * Overloaded methods may or may not define different access modifiers.
        * Overloaded methods can't be defined by only changing their return type or access modifier.

    */

    private static String appendStringValues(String originalStr, String additionalStr) {
        return new StringBuffer(originalStr).append(additionalStr).toString();
    }

    private static String appendStringValues(String originalStr, String firstValueStr, String secondValueStr) {

        StringBuffer stringBuffer = new StringBuffer(originalStr);
        stringBuffer.append(firstValueStr);
        stringBuffer.append(secondValueStr);

        return String.valueOf(stringBuffer);
    }


    /*
        Overloaded Method: Argument List

        * Overloaded methods accept different argument lists, these lists can differ in terms of any of the following:
             - Change in the number of parameters that are accepted
             - Change in the type of parameters that are accepted
             - Change in the positions of the parameters that are accepted.


        Overloaded Method: Return Type

        * Methods can't be defined as overloaded methods if they differ only in their return types.
        * If this is the case, and the overloaded methods are defined within the same class, they will not compile
        * You will also receive a compilation error if one of the methods is defined in the subclass (derived class).
        * This is also the case even if the methods share a different return type (see example below), compile error.


        private static String compileErrorOverloadedMethod(String originalStr, String additionalStr) {
            return new StringBuffer(originalStr).append(additionalStr).toString();
        }

        private static int compileErrorOverloadedMethod(String originalStr, String additionalStr) {

            System.out.println(originalStr);
            System.out.println(additionalStr);

            return 1 + 1;
        }


        Access Modifier

        * Methods can not be defined as overloaded if they only different in their access modifier (private & public for
          example).

     */



}
