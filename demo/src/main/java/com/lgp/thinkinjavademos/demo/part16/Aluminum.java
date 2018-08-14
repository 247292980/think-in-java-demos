package com.lgp.thinkinjavademos.demo.part16;

/**
 * @AUTHOR lgp
 * @DATE 2018/7/26 14:56
 * @DESCRIPTION
 **/
public class Aluminum extends Trash {
    private static double val = 1.67f;
    public Aluminum(double wt) { super(wt); }
    public double value() { return val; }
    public static void value(double newVal) {
        val = newVal;
    }
}
