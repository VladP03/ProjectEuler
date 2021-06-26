import java.util.BitSet;

public class Problem23 {
    private static int max = 28123;
    private static BitSet abundantNumbers = new BitSet(max);

    public static void main(String[] args) {
        for (int i=1;i<=max;i++) {
            if (isAbundant(i)) {
                abundantNumbers.set(i);
            }
        }

        long sum = 0;
        for (int i=1;i<=max;i++) {
            if (!equalsWith2Abundant(i)) {
                sum += i;
            }
        }

        System.out.println(sum);
    }

    private static boolean equalsWith2Abundant(int number) {
        for (int i=abundantNumbers.nextSetBit(0);i<=max;i=abundantNumbers.nextSetBit(i+1)) {
            if (i > number) {
                return false;
            } else if (abundantNumbers.get(number-i)) {
                return true;
            }
        }

        return false;
    }

    private static boolean isAbundant(int number) {
        int sum=0;

        for (int i = number/2; i>=1; i--) {
            if (isDivided(number,i)) {
                sum+=i;

                if (sum > number) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean isDivided(int number, int divisor) {
        return number%divisor==0;
    }
}
