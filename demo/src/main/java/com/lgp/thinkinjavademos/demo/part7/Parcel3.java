package com.lgp.thinkinjavademos.demo.part7;

/**
 * @AUTHOR lgp
 * @DATE 2018/7/9 9:05
 * @DESCRIPTION
 **/
public class Parcel3 {
    private class PContents extends Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination {
        private String label;

        private PDestination(String whereTo) {
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Destination dest(String s) {
        return new PDestination(s);
    }

    public Contents cont() {
        return new PContents();
    }
}

class Test {
    public static void main(String[] args) {
        Parcel3 p = new Parcel3();
        Contents c = p.cont();
        Destination d = p.dest("Tanzania");
// Illegal -- can't access private class:
//! Parcel3.PContents c = p.new PContents();
    }
} ///:~
