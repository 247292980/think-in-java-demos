package com.lgp.thinkinjavademos.demo.part16;

/**
 * @AUTHOR lgp
 * @DATE 2018/7/26 14:26
 * @DESCRIPTION
 **/
final class Singleton {
    private static Singleton s = new Singleton(47);
    private int i;
    private Singleton(int x) { i = x; }
    public static Singleton getHandle() {
        return s;
    }
    public int getValue() { return i; }
    public void setValue(int x) { i = x; }
}
public class SingletonPattern {
    public static void main(String[] args) {
        Singleton s = Singleton.getHandle();
        System.out.println(s.getValue());
        Singleton s2 = Singleton.getHandle();
        s2.setValue(9);
        System.out.println(s.getValue());
        try {
// Can't do this: compile-time error.
// Singleton s3 = (Singleton)s2.clone();
        } catch(Exception e) {}
    }
} ///:~
