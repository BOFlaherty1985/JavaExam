package interview;

/**
 * Interview Practice - Example One
 *
 * Write a Java application that replaces certain characters from a String.
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 20/10/2014
 * @project JavaExamProject
 */
public class ManipulateStrings {

    private static String replaceCharacterByCharIndex(String original_str, int i) {
        return original_str.replace(original_str.charAt(i), 'd');
    }

    // Iterative Example
    private static String replaceMultipleCharactersInString(String original_str, int index, char replace_value) {

        StringBuilder myString = new StringBuilder();

        for(int i = 0; i < original_str.length(); i++) {

            myString = (i % index == 0) ? myString.append(replace_value) :
                    myString.append(original_str.charAt(i));

        }

        return myString.toString();
    }


    public static void main(String[] args) {

        String value_one = replaceCharacterByCharIndex("StringValue", 2);
        System.out.println(value_one);

        String value_two = replaceMultipleCharactersInString("this_is_a_test_string", 5, '*');
        System.out.println(value_two);

        String value_three = reverseGivenString("myStringValue");
        System.out.println(value_three);

        String value_four = reverseGivenStringUsingStringBuffer("myStringValue");
        System.out.println(value_four);

    }

    private static String reverseGivenString(String myStringValue) {

        String reverseValue = "";

        for(int i = myStringValue.length(); i > 0 ; i--) {
            reverseValue = reverseValue + myStringValue.charAt(i-1);
        }

        return reverseValue;
    }

    private static String reverseGivenStringUsingStringBuffer(String myStringValue) {
        return new StringBuffer(myStringValue).reverse().toString();
    }

}
