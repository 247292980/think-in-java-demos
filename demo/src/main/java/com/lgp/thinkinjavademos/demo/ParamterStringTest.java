package com.lgp.thinkinjavademos.demo;

/**
 * @AUTHOR lgp
 * @DATE 2018/6/22 16:13
 * @DESCRIPTION
 **/
public class ParamterStringTest {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "a";
        f(s1, s2);
        System.out.println("s1 2");
        p(s1);
        System.out.println("s2 2");
        p(s2);
    }

    public static void f(String s1, String s2) {
        s1 = "b";
        s2 = "b";
        System.out.println("s1 1");
        p(s1);
        System.out.println("s2 1");
        p(s2);
    }

    public static void p(String s) {
        System.out.println(s);
    }

}
