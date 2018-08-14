package com.lgp.thinkinjavademos.demo.part4;

/**
 * @AUTHOR lgp
 * @DATE 2018/6/14 10:54
 * @DESCRIPTION
 **/
public class Tree {

    int height;

    Tree() {
        prt("Planting a seedling");
        height = 0;
    }

    Tree(int i) {
        prt("Creating new Tree that is "
                + i + " feet tall");
        height = i;
    }

    void info() {
        prt("Tree is " + height
                + " feet tall");
    }

    void info(String s) {
        prt(s + ": Tree is "
                + height + " feet tall");
    }

    static void prt(String s) {
        System.out.println(s);
    }
}