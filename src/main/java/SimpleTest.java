package main.java;

import org.testng.annotations.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SimpleTest {
    protected int fValue1;
    protected int fValue2;
    protected int fValue3;

    @BeforeClass
    public void setUp()
    {
        fValue1 = 6;
        fValue2 = 2;
        fValue3 = 6;
    }

    @Test(groups={"unittest"})
    public void testAdd()
    {
        double result = fValue1 + fValue2;
        assertTrue (result == 8);
    }

    @Test(groups={"unittest"})
    public void testMinus()
    {
        double result = fValue1 - fValue2;
        assertTrue (result == 4);
    }

    @Test(groups={"unittest"})
    public void testMultiply()
    {
        double result = fValue1*fValue2;
        assertTrue (result == 12);
    }

    @Test(groups={"unittest"})
    public void testDivideByZero()
    {
        double result = fValue1/fValue2;
        assertTrue (result == 3);
    }

    @Test(groups={"unittest"})
    public void testEquals()
    {
        assertEquals(fValue1, fValue3);
        System.out.println();
    }

}
