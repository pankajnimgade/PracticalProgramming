package test101.basic.programming;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Test101PrimeNumberTest {

    @Test
    public void isPrimeNumberFor1() {
        assertFalse(Test101PrimeNumber.isPrimeNumber(1));
    }

    @Test
    public void isPrimeNumberFor2() {
        assertTrue(Test101PrimeNumber.isPrimeNumber(2));
    }

    @Test
    public void isPrimeNumberFor3() {
        assertTrue(Test101PrimeNumber.isPrimeNumber(3));
    }

    @Test
    public void isPrimeNumberFor4() {
        assertFalse(Test101PrimeNumber.isPrimeNumber(4));
    }

    @Test
    public void isPrimeNumberFor5() {
        assertTrue(Test101PrimeNumber.isPrimeNumber(5));
    }

    @Test
    public void isPrimeNumberFor6() {
        assertFalse(Test101PrimeNumber.isPrimeNumber(6));
    }

    @Test
    public void isPrimeNumberFor7() {
        assertTrue(Test101PrimeNumber.isPrimeNumber(7));
    }

    @Test
    public void isPrimeNumberFor8() {
        assertFalse(Test101PrimeNumber.isPrimeNumber(8));
    }

    @Test
    public void isPrimeNumberFor9() {
        assertFalse(Test101PrimeNumber.isPrimeNumber(9));
    }
}