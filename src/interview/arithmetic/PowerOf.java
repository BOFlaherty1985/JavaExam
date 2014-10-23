package interview.arithmetic;

/**
 * Power Of Exercise
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 23/10/2014
 * @project JavaExamProject
 */
public class PowerOf {

    public static void main(String[] args) {

        // 2 to the power of 77
        boolean result = isPowerOf(2D, 151115727451828646838272D, 98);
        System.out.println(result);

    }

    private static boolean isPowerOf(double power_value, double user_value, int range) {

        double[] powersList = new double[range];

        for(int i = 0; i < range; i++) {

            // generate powers of list
            powersList[i] = Math.pow(power_value, new Double(i));

            // if the users value is stored within our array list of values, return true
            if(powersList[i] == user_value) {
                return true;
            }

        }

        return false;
    }

}
