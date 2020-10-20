/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Main {

    public static boolean isPalindrome(int number) {

        int copyOfNumber = number;

        int newNumber=0;
        while (number!=0) {
            newNumber = newNumber*10 + number%10;
            number/=10;
        }

        if (copyOfNumber == newNumber) {
            return true;
        }

        return false;
    }

    public static int largestPalindrome() {

        int max=0;
        for (int i=999;i>=0;i--) {
            for (int j=999;j>=0;j--) {
                if (isPalindrome(i*j) == true) {
                    if (max < i*j) {
                        max=i*j;
                    }
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println(largestPalindrome());
    }
}
