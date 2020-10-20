/*
n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!
*/

import java.math.BigInteger;

public class Problem020{

    public static String factorial (int number) {

        BigInteger fac = new BigInteger(String.valueOf(1));
        for (int i=2;i<=number;i++) {
            fac = fac.multiply(BigInteger.valueOf(i));
        }

        return fac.toString();
    }

    public static long sumOfDigit(String pattern) {

        long sum=0;
        for (int i=0;i<pattern.length();i++) {
            sum+=Integer.parseInt(String.valueOf(pattern.charAt(i)));
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sumOfDigit(factorial(100)));

    }
}
