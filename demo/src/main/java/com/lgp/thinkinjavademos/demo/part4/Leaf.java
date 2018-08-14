package com.lgp.thinkinjavademos.demo.part4;

/**
 * @AUTHOR lgp
 * @DATE 2018/6/14 11:24
 * @DESCRIPTION
 **/
public class Leaf {
    private int i = 0;
    Leaf increment() {
        i++;
        return this;
    }
    void print() {
        System.out.println("i = " + i);
    }
    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
        try {
            x.finalize();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
