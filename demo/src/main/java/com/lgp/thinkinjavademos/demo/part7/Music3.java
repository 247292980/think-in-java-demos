package com.lgp.thinkinjavademos.demo.part7;

/**
 * @AUTHOR lgp
 * @DATE 2018/7/6 11:28
 * @DESCRIPTION
 **/
class Instrument3 {
    public void play() {
        System.out.println("Instrument3.play()");
    }
    public String what() {
        return "Instrument3";
    }
    public void adjust() {}
}
class Wind3 extends Instrument3 {
    @Override
    public void play() {
        System.out.println("Wind3.play()");
    }
    @Override
    public String what() { return "Wind3"; }
    @Override
    public void adjust() {}
}
class Percussion3 extends Instrument3 {
    @Override
    public void play() {
        System.out.println("Percussion3.play()");
    }
    @Override
    public String what() { return "Percussion3"; }
    @Override
    public void adjust() {}
}
class Stringed3 extends Instrument3 {
    @Override
    public void play() {
        System.out.println("Stringed3.play()");
    }
    @Override
    public String what() { return "Stringed3"; }
    @Override
    public void adjust() {}
}
class Brass3 extends Wind3 {
    @Override
    public void play() {
        System.out.println("Brass3.play()");
    }
    @Override
    public void adjust() {
        System.out.println("Brass3.adjust()");
    }
}
class Woodwind3 extends Wind3 {
    @Override
    public void play() {
        System.out.println("Woodwind3.play()");
    }
    @Override
    public String what() { return "Woodwind3"; }
}
public class Music3 {
    // Doesn't care about type, so new types
// added to the system still work right:
    static void tune(Instrument3 i) {
// ...
        i.play();
    }
    static void tuneAll(Instrument3[] e) {
        for (Instrument3 anE : e) {
            tune(anE);
        }
    }
    public static void main(String[] args) {
        Instrument3[] orchestra = new Instrument3[5];
        int i = 0;
// Upcasting during addition to the array:
        orchestra[i++] = new Wind3();
        orchestra[i++] = new Percussion3();
        orchestra[i++] = new Stringed3();
        orchestra[i++] = new Brass3();
        orchestra[i++] = new Woodwind3();
        tuneAll(orchestra);
    }
} ///:~
