package se.ecjava.abdirahmanAli;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private AppTest minicalc;
    @Before public void minicalc(){
        minicalc=new AppTest();
    }
    /**
     * Rigorous Test :-)
     */
    @Test
  public void addition(){
 double a=10.0;
 double b=10.0;
 double expected=20.0;
 double delta=0;
 double actual =minicalc.addition(a,b);

        Assert.assertEquals(expected,actual,delta);
    }
    @Test

    public void subtraction(){
        double a=10.0;
        double b=5.0;
        double expected=5.0;
        double delta=0;
        double actual =minicalc.subtraction(a,b);

        Assert.assertEquals(expected,actual,delta);
    }
    @Test
    public void multiplication(){
        double a=10.0;
        double b=5.0;
        double expected=50.0;
        double delta=0;
        double actual =minicalc.multiplication(a,b);

        Assert.assertEquals(expected,actual,delta);
    }
    @Test
    public void divison(){
        double a=10.0;
        double b=2.0;
        double expected=5.0;
        double delta=0;
        double actual =minicalc.divison(a,b);

        Assert.assertEquals(expected,actual,delta);
    }
    public static double addition(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double subtraction(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public static double divison(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public static double multiplication(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }
}
