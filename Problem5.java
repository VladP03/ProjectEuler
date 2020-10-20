/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class Problem5 {

    public static boolean isDivededBy1to20(int number) {

        boolean ok = true;
        for (int i=2;i<=20 && ok==true;i++) {
            if (number%i!=0) {
                ok = false;
            }
        }

        return ok;
    }

    public static void main(String[] args) {

        for (int i=2;i< Integer.MAX_VALUE;i++) {
            if (isDivededBy1to20(i) == true) {
                System.out.println(i);
                break;
            }
        }
    }
}
