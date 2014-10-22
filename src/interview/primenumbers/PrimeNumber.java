package interview.primenumbers;

import java.util.Arrays;

/**
 * Prime Number Exercise
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 22/10/2014
 * @project JavaExamProject
 */
public class PrimeNumber {

    // greater than 1 that has no positive divisors other than 1 and itself (no remainder)
    public static void main(String[] args) {

        boolean isPrime = isNumberAPrimeNumber(41);
        System.out.println(isPrime);

        String listOfPrimeNumbers = listAllPrimeNumbersForGivenRange(100);
        System.out.println(listOfPrimeNumbers);

    }

    private static boolean  isNumberAPrimeNumber(int userInput) {

        boolean isPrimeNumber = true;

        // check if userInput is divisible by 2 (which would make the value an even number)
        if (userInput % 2 == 0) return false;

        // prime number must be greater than 1, therefore int is assigned the starting value of 2.
        for(int i = 2; i < userInput; i++) {

            if(userInput % i == 0) isPrimeNumber = false;

        }

        return isPrimeNumber;
    }

    private static String listAllPrimeNumbersForGivenRange(int range) {

        StringBuffer primeStr = new StringBuffer();

        // set all values for the array to true
        boolean[] primes = new boolean[range];
        Arrays.fill(primes, true);

        // prime number must be greater than 1, therefore int is assigned the starting value of 2.
        for (int i = 2; i < range; i++) {

            for (int j = 2; i * j < primes.length; j++) {
                primes[i * j] = false;

            }

            if(primes[i]) {
                primeStr.append(i + ", ");
            }

        }

        return primeStr.toString();
    }

}
