package interview;

/**
 * Recursive Method Example
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 21/10/2014
 * @project JavaExamProject
 */
public class RecursiveMethods {

    private static StringBuffer modifiedStr = new StringBuffer();

    public static void main(String[] args) {

        myRecursiveMethod(100);

        String value = recursiveStringManipulation("This Would Be My String Value", 'i', 0);
        System.out.println(value);

    }

    // recursive method that counts down from n and exits when the value is equal to 0
    private static int myRecursiveMethod(int aValue) {

        aValue--;
        System.out.println(aValue);

        if(aValue == 0) {
            return 0;
        }

        return myRecursiveMethod(aValue);
    }

    private static String recursiveStringManipulation(String s, char i, int index) {

        // recursive method cutoff, prevents an infinite loop
        if(index < s.length()) {

            modifiedStr = (s.charAt(index) == i) ? modifiedStr.append("*") :
                    modifiedStr.append(s.charAt(index));

            index++;

            // recursive method example.
            return recursiveStringManipulation(s, i, index);
        }

        return modifiedStr.toString();
    }

}
