package goose.makingclasses;
import junit.framework.TestCase;
/**
 * Created by Gustavo Silvera on 11/30/2017.
 */

public class ArithmeticTest extends TestCase{

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
    TaxArithmetic taxes =  new TaxArithmetic();
    public void testArithmeticTax() {
        assertEquals(taxes.calculateTax((float)10.75, (float)8.5), (float)0.91375);
    }
    @Override
    public void tearDown() throws Exception{
        super.tearDown();
    }
}
