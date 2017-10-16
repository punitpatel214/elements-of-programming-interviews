import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputeParityTest {

    private short expected;
    private long n;


    @Test
    public void parity1() {
        expected = 0;
        n = 0;

        test(expected, n);
    }

    @Test
    public void parity2() {
        expected = 1;
        n = 1;

        test(expected, n);
    }

    @Test
    public void parity3() {
        expected = 1;
        n = 2;

        test(expected, n);
    }

    @Test
    public void parity4() {
        expected = 0;
        n = 152950;

        test(expected, n);
        System.out.println(1 ^ 1>>1);
    }

    private void test(short expected, long n) {
        assertEquals(expected, ComputeParity.parity(n));
        assertEquals(expected, ComputeParity.parityNew(n));
        assertEquals(expected, ComputeParity.parityFinal(n));
    }


}