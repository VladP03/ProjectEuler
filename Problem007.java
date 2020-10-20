/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
*/

public class Problem007 {

    public static boolean isPrime(int number) {

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int prime = 2;
        for (int i = 5; i < Integer.MAX_VALUE; i++) {
            if (isPrime(i)) {
                prime++;
            }
            if (prime == 10_001) {
                System.out.println(i);
                break;
            }
        }
    }
}
