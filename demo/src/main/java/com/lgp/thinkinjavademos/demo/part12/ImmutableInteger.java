package com.lgp.thinkinjavademos.demo.part12;

import java.util.Vector;

/**
 * @AUTHOR lgp
 * @DATE 2018/7/18 15:46
 * @DESCRIPTION
 **/
public class ImmutableInteger {
    public static void main(String[] args) {
        Vector v = new Vector();
        for (int i = 0; i < 10; i++)
            v.addElement(new Integer(i));
// But how do you change the int
// inside the Integer?
    }
} ///:~
