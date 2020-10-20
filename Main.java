public class Main {

    public static long largestPrimeFactor(long number) {

        long i;

        for (i=2;i<=number;i++) {
            if (number%i==0) {
                number/=i;
                i--;
            }
        }

        return i;
    }

    public static void main(String[] args) {

        long number = 60085147012831L;
        System.out.println(largestPrimeFactor(number));
    }
}
