package com.lgp.thinkinjavademos.demo.part8;

import java.util.Vector;

/**
 * @AUTHOR lgp
 * @DATE 2018/7/11 10:45
 * @DESCRIPTION
 **/
public class CrashJava {
    public String toString() {
        return "CrashJava address: " + this + "\n";
    }
    public static void main(String[] args) {
        Vector v = new Vector();
        for(int i = 0; i < 10; i++)
            v.addElement(new CrashJava());
        System.out.println(v);
    }
} ///:~
