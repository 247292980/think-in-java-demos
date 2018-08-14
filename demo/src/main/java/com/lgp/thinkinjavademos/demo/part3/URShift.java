package com.lgp.thinkinjavademos.demo.part3;

/**
 * @AUTHOR lgp
 * @DATE 2018/6/13 17:44
 * @DESCRIPTION
 **/
public class URShift {
    public static void main(String[] args) {
        int i = -1;
        i >>>= 10;
        System.out.println(i);
//        System.out.println(-1 >>>10);
        long l = -1;
        l >>>= 10;
        System.out.println(l);
        short s = -1;
        s >>>= 10;
        System.out.println(s);
        byte b = -1;
        b >>>= 10;
        System.out.println(b);
    }
}
