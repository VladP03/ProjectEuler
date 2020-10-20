/*
Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.
*/

public class Problem021{

    public static long sumOfDiviors (int number) {

        long sum = 1L;

        for (int i=2;i<=Math.sqrt(number);i++) {
            if (number%i==0) {
                if (number/i==i) {
                    sum += i;
                } else {
                    sum += i;
                    sum += number/i;
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {

//        System.out.println(sumOfDiviors(197));

        long sum = 0;
        for (int i=1;i<10000-1;i++) {   // 10000-1
            for (int j=i+1;j<10000;j++) {   // 10000
                if (sumOfDiviors(i) == j && sumOfDiviors(j) == i) {
                    sum += i+j;
                    System.out.println("d("+i+")= " + sumOfDiviors(i) + " & d("+j+")= " + sumOfDiviors(j));
                }
            }
        }

        System.out.println("The sum of amicable numbers is: " + sum);
    }
}
