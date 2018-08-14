package com.lgp.thinkinjavademos.demo.part8;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

/**
 * @AUTHOR lgp
 * @DATE 2018/7/13 9:35
 * @DESCRIPTION
 **/
public class MapCreation {
    public static void main(String[] args) {
        final long REPS = 1000000000;
        long t1 = System.currentTimeMillis();
        System.out.print("Hashtable");
        for(long i = 0; i < REPS; i++)
            new Hashtable();
        long t2 = System.currentTimeMillis();
        System.out.println(": " + (t2 - t1));
        t1 = System.currentTimeMillis();
        System.out.print("TreeMap");
        for(long i = 0; i < REPS; i++)
            new TreeMap();
        t2 = System.currentTimeMillis();
        System.out.println(": " + (t2 - t1));
        t1 = System.currentTimeMillis();
        System.out.print("HashMap");
        for(long i = 0; i < REPS; i++)
            new HashMap();
        t2 = System.currentTimeMillis();
        System.out.println(": " + (t2 - t1));
    }
} ///:~
