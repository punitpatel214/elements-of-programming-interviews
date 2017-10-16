public class ReverseBits {

    /*
    5.3
    */

    public static int reverse(int x) {

        int lastBit = 0;
        int iteration = 0;
        while (lastBit == 0 && x > 0) {
            lastBit = x & 1;
            x = x >> 1;
            iteration++;
        }
        int reverseBit = lastBit;
        while (x > 0) {
            reverseBit = reverseBit << 1 | x & 1;
            x = x >> 1;
            iteration++;
        }
        while (iteration < 32) {
            reverseBit <<= 1;
            iteration++;
        }
        return reverseBit;
    }

    public static int reverseNew(int x) {
        int i =0;
        int j = 31;
        for (int k = 0; k < 16; k++) {
            x = (int) SwapBits.swapBits(x, i++, j--);
        }
        return x;
    }



}
