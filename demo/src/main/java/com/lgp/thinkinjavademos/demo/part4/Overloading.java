package com.lgp.thinkinjavademos.demo.part4;

/**
 * @AUTHOR lgp
 * @DATE 2018/6/14 10:53
 * @DESCRIPTION
 **/
public class Overloading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
// Overloaded constructor:
        new Tree();
    }
}
