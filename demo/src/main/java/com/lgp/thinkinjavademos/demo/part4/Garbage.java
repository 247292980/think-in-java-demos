package com.lgp.thinkinjavademos.demo.part4;

/**
 * @AUTHOR lgp
 * @DATE 2018/6/14 14:23
 * @DESCRIPTION
 **/
public class Garbage {
    public static void main(String[] args) {
       String s = "before";
        if (s.length() == 0) {
            System.err.println("Usage: \n" +
                    "java Garbage before\n or:\n" +
                    "java Garbage after");
            return;
        }
        while (!Chair.f) {
            new Chair();
            new String("To take up space");
        }
        System.out.println(
                "After all Chairs have been created:\n" +
                        "total created = " + Chair.created +
                        ", total finalized = " + Chair.finalized);
        if (s.equals("before")) {
            System.out.println("gc():");
            System.gc();
            System.out.println("runFinalization():");
            System.runFinalization();
        }
        System.out.println("bye!");
        if (s.equals("after"))
            System.runFinalizersOnExit(true);
    }
}
