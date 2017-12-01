package goose.makingclasses;

/**
 * Created by Gustavo Silvera on 11/30/2017.
 */

public class TaxArithmetic extends Arithmetic {
    public float calculateTax(float purchase, float Trate) {
        return mult(purchase, div(Trate, (float)100));//purchase * Trate /100
    }
    public float calculateTax(float Trate) {
        float purchase = getm1() + getm2();//using public instances
        return calculateTax(purchase, Trate);
    }
}
