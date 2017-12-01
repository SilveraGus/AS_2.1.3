package goose.makingclasses;
import junit.framework.TestCase;
/**
 * Created by Gustavo Silvera on 11/30/2017.
 */

public class ArithmeticTest extends TestCase{

    Arithmetic a;
    private float m1 = 5;//one test value for the checks
    private float m2 = 10;//one test value for the checks
    @Override
    public void setUp()throws Exception{
        super.setUp();
        a = new Arithmetic();//creates a new arithmetic class
    }

    public void testArithmeticAdd() {
        //tests the arithmetic add function
        assertEquals(a.add(m1, m2), (float)15);
    }
    public void testArithmeticMult() {
        //tests the arithmetic multiplication function
        assertEquals(a.mult(m1, m2), (float)50);
    }
    public void testArithmeticDiff() {
        //tests the arithmetic differene function
        assertEquals(a.diff(m1, m2), (float)(-5));
    }
    public void testArithmeticDiv() {
        //tests the arithmetic division function
        assertEquals(a.div(m1, m2), (float)0.5);
    }
    TaxArithmetic taxes =  new TaxArithmetic();
    public void testArithmeticTax() {
        //tests the arithmetic tax calfulator function
        assertEquals(taxes.calculateTax((float)10.75, (float)8.5), (float)0.91375);
    }
    @Override
    public void tearDown() throws Exception{
        super.tearDown();
    }
}
