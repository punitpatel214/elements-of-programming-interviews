public class ReverseDigits {

    /*
    5.8
    */

    public static long reverse(int x) {
        int absValue = Math.abs(x);
        int result = 0;
        while (absValue > 0) {
            result = (result * 10) + (absValue % 10);
            absValue /= 10;
        }
        return x > 0 ? result : -result;
    }
}
