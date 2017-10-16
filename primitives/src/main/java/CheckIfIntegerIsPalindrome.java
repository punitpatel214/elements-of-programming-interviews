public class CheckIfIntegerIsPalindrome {

    /*
    5.9
    */

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int numOfDigit = (int) (Math.log10(x) + 1);
        for (int i = 0; i < numOfDigit / 2; i++) {
            int firstDigitDivider = (int) Math.pow(10, numOfDigit - 1);
            if (x % 10 != x / firstDigitDivider) {
                return false;
            }
            x %= firstDigitDivider;
            x /= 10;
            numOfDigit -= 2;
        }
        return true;
    }
}
