public class ComputeDivision {

    /*
    5.6
    */

    public static long divide(long x, long y) {
        long division = 0;
        while (x > 0) {
            x = minus(x, y);
            division = add(division, 1);
        }
        return division;
    }

    private static long minus(long x, long y) {
        return add(x, add(~y, 1));
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
