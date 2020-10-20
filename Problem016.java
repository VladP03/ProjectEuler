/*
2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?
*/

import java.math.BigInteger;

public class Problem016{

    public static void main(String[] args) {

        // 2^1000
        BigInteger number = new BigInteger(String.valueOf(2));
        BigInteger power = number.pow(1000);

        String powerInString = String.valueOf(power);

        int sum = 0;
        for (int i=0;i<powerInString.length();i++) {
            sum += powerInString.charAt(i) - 48;
        }

        System.out.println(sum);
    }
}
