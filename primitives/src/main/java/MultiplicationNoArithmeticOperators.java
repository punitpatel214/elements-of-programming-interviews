public class MultiplicationNoArithmeticOperators {

    /*
    5.5
    */

    public static long multiply(long x, long y) {
        long sum = 0;
        long sumTimes = 0;
        while (sumTimes < y) {
            sum = add(x, sum);
            sumTimes = add(sumTimes , 1);
        }
        return sum;
    }

    private static long add(long x, long y) {
        long carry;
        while (x != 0) {
            carry = x & y;
            y = x ^ y;
            x = carry << 1;
        }
        return y;
    }
}
