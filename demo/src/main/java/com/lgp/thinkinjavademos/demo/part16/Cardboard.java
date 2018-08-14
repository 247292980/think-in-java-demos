package com.lgp.thinkinjavademos.demo.part16;

/**
 * @AUTHOR lgp
 * @DATE 2018/7/26 14:57
 * @DESCRIPTION
 **/
public class Cardboard extends Trash {
    private static double val = 0.23f;
    public Cardboard(double wt) { super(wt); }
    public double value() { return val; }
    public static void value(double newVal) {
        val = newVal;
    }
} ///:~
