package com.lgp.thinkinjavademos.demo.part7;

/**
 * @AUTHOR lgp
 * @DATE 2018/7/6 15:23
 * @DESCRIPTION
 **/
abstract class Instrument4 {
    int i; // storage allocated for each

    public abstract void play();

    public String what() {
        return "Instrument4";
    }

    public abstract void adjust();
}

class Wind4 extends Instrument4 {
    @Override
    public void play() {
        System.out.println("Wind4.play()");
    }

    @Override
    public String what() {
        return "Wind4";
    }

    @Override
    public void adjust() {
    }
}

class Percussion4 extends Instrument4 {
    @Override
    public void play() {
        System.out.println("Percussion4.play()");
    }

    @Override
    public String what() {
        return "Percussion4";
    }


    @Override
    public void adjust() {
    }
}

class Stringed4 extends Instrument4 {
    @Override
    public void play() {
        System.out.println("Stringed4.play()");
    }

    @Override
    public String what() {
        return "Stringed4";
    }

    @Override
    public void adjust() {
    }
}

class Brass4 extends Wind4 {
    @Override
    public void play() {
        System.out.println("Brass4.play()");
    }

    @Override
    public void adjust() {
        System.out.println("Brass4.adjust()");
    }
}

class Woodwind4 extends Wind4 {
    @Override
    public void play() {
        System.out.println("Woodwind4.play()");
    }

    @Override
    public String what() {
        return "Woodwind4";
    }
}

public class Music4 {
    // Doesn't care about type, so new types
// added to the system still work right:
    static void tune(Instrument4 i) {
// ...
        i.play();
    }

    static void tuneAll(Instrument4[] e) {
        for (Instrument4 anE : e) {
            tune(anE);
        }
    }

    public static void main(String[] args) {
        Instrument4[] orchestra = new Instrument4[5];
        int i = 0;
// Upcasting during addition to the array:
        orchestra[i++] = new Wind4();
        orchestra[i++] = new Percussion4();
        orchestra[i++] = new Stringed4();
        orchestra[i++] = new Brass4();
        orchestra[i++] = new Woodwind4();
        tuneAll(orchestra);
    }
} ///:~
