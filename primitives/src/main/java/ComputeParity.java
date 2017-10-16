public class ComputeParity {

    /*
    5.1
    */

    public static short parity(long n) {
        short numOfOnes = 0;
        while (n > 0) {
            short andOperation = (short) (n & 1);
            numOfOnes = (short) (numOfOnes ^ andOperation);
            n = n >> 1;
        }
        return numOfOnes;
    }


    public static short parityNew(long n) {
        short parity = 0;
        while (n > 0) {
            parity ^= 1;
            n &= n-1;
        }
        return parity;
    }

    public static short parityFinal(long n) {
        n ^= n >>> 32;
        n ^= n >>> 16;
        n ^= n >>> 8;
        n ^= n >>> 4;
        n ^= n >>> 2;
        n ^= n >>> 1;
        return (short) (n & 1);
    }
}
