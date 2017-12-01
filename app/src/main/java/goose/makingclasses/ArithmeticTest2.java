package goose.makingclasses;

import junit.framework.TestCase;

/**
 * Created by wdumas on 2/24/2015.
 */
public class ArithmeticTest2 extends TestCase {

    Arithmetic a;
    private float m1 = 5;
    private float m2 = 10;
    @Override
    public void setUp()throws Exception{
        super.setUp();
        a = new Arithmetic();
    }

    public void testArithmeticAdd() {
        assertEquals(a.add(m1, m2), (float)15);
    }
    public void testArithmeticMult() {
        assertEquals(a.mult(m1, m2), (float)50);
    }
    public void testArithmeticDiff() {
        assertEquals(a.diff(m1, m2), (float)(-5));
    }
    public void testArithmeticDiv() {
        assertEquals(a.div(m1, m2), (float)0.5);
    }
    @Override
    public void tearDown() throws Exception{
        super.tearDown();
    }

}
