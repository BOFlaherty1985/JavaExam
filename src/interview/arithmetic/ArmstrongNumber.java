package interview.arithmetic;

/**
 * Armstrong Numbers
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 22/10/2014
 * @project JavaExamProject
 */
public class ArmstrongNumber {

    // Armstrong number of a 3 digit value is if all of it's individual parts multiplied by the number of digits, added
    // together is equal to the initial value.
    public static void main(String[] args) {

        boolean result = isValueAnArmstrongNumber(153);
        System.out.println(result);
    }

    private static boolean isValueAnArmstrongNumber(int input) {

        // convert user int value to a String object in order to use the charAt() method
        StringBuffer valueAsStr = new StringBuffer(String.valueOf(input));

        int combinedTotal = 0;

        // determine the number of digits in the users input
        for(int i = 0; i < valueAsStr.length(); i++ ) {

            String number = Character.toString(valueAsStr.charAt(i));

            // Using Math.pow (power of) work out the total of each individual part of the sum.
            Double toPower = Math.pow(Double.valueOf(number), valueAsStr.length());

            // add individual values multiplied by one another to the combinedTotal
            combinedTotal +=  toPower.intValue();

        }

        return (combinedTotal == input) ?  true : false;
    }

}
