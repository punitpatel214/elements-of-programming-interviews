public class SwapBits {

    /*
    5.2
    */

    public static long swapBits(long x, int i, int j) {
        long iBit = x >> i & 1;
        long jBit = x >> j & 1;
        if (iBit != jBit) {
            long iData = 1 << i;
            long jData = 1 << j;
            long data = iData | jData;
            x = x ^ data;
        }
        return x;
    }
}
