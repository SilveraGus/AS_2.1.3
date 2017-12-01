package goose.makingclasses;

/**
 * Created by Gustavo Silvera on 11/30/2017.
 */

public class Arithmetic {
    private float mOperand1;
    private float mOperand2;

    public Arithmetic(){
        mOperand1 = 2;
        mOperand2 = 3;
    }
    public String toString() {
        return "Arithmetic Instance:  mOperand1 = " + mOperand1 + "; mOperand2 = " + mOperand2 + ".";
    }
    public void setValues(float m1, float m2) {
        mOperand1 = m1;
        mOperand2 = m2;
    }
    public float getm1(){
        return mOperand1;
    }
    public float getm2(){
        return mOperand2;
    }
    public static float add(float operand1, float operand2){
        return operand1 + operand2;
    }
    public static float mult(float operand1, float operand2){
        return operand1 * operand2;
    }
    public static float diff(float operand1, float operand2){
        return operand1 - operand2;
    }
    public static float div(float operand1, float operand2){
        return operand1 / operand2;
    }

}
