package test101.basic.programming;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test101PrimeNumberTest {

    @Test
    public void isPrimeNumberFor1() {
        Assert.assertEquals(false, Test101PrimeNumber.isPrimeNumber(1));
    }

    @Test
    public void isPrimeNumberFor2() {
        Assert.assertEquals(true, Test101PrimeNumber.isPrimeNumber(2));
    }

    @Test
    public void isPrimeNumberFor3() {
        Assert.assertEquals(true, Test101PrimeNumber.isPrimeNumber(3));
    }

    @Test
    public void isPrimeNumberFor4() {
        Assert.assertEquals(false, Test101PrimeNumber.isPrimeNumber(4));
    }

    @Test
    public void isPrimeNumberFor5() {
        Assert.assertEquals(true, Test101PrimeNumber.isPrimeNumber(5));
    }

    @Test
    public void isPrimeNumberFor6() {
        Assert.assertEquals(false, Test101PrimeNumber.isPrimeNumber(6));
    }

    @Test
    public void isPrimeNumberFor7() {
        Assert.assertEquals(true, Test101PrimeNumber.isPrimeNumber(7));
    }

    @Test
    public void isPrimeNumberFor8() {
        Assert.assertEquals(false, Test101PrimeNumber.isPrimeNumber(8));
    }

    @Test
    public void isPrimeNumberFor9() {
        Assert.assertEquals(false, Test101PrimeNumber.isPrimeNumber(9));
    }
}