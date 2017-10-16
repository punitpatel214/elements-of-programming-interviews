public class FindClosestInteger {

    /*
    5.4
    */

    public static long closestIntSameBitCount(long x) {
        int bitCount = countBits(x);
        long forwardOFx = x;
        long backwd = x;
        while (true) {
            if (countBits(++forwardOFx) == bitCount) {
                return forwardOFx;
            }

            if (countBits(--backwd) == bitCount) {
                return backwd;
            }
        }
    }

    private static int countBits(long x) {
        if (x < 0 ) {
            x = -x;
        }
        System.out.println("Calculate Bit Count " + x);
        int bitCount = 0;
        while (x > 0) {
            x &= x-1;
            bitCount++;
        }
        System.out.println("Bit Count " + bitCount);
        return bitCount;
    }

}
