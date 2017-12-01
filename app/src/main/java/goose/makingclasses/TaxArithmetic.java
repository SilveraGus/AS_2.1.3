package goose.makingclasses;

/**
 * Created by Gustavo Silvera on 11/30/2017.
 */

public class TaxArithmetic extends Arithmetic {
    //utilizes the steps for subclasses and tax calculations
    public float calculateTax(float purchase, float Trate) {//calculates the tax given the purchase
        return mult(purchase, div(Trate, (float)100));//purchase * Trate /100
    }
    public float calculateTax(float Trate) {//calculates the tax with no purchase
        float purchase = getm1() + getm2();//using public instances
        return calculateTax(purchase, Trate);
    }
}
