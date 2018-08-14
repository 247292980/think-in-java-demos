package com.lgp.thinkinjavademos.demo.part7;

/**
 * @AUTHOR lgp
 * @DATE 2018/7/9 9:16
 * @DESCRIPTION
 **/
public class Parcel4 {
    public Destination dest(String s) {
        class PDestination implements Destination {
            private String label;

            private PDestination(String whereTo) {
                label = whereTo;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Destination d = p.dest("Tanzania");
    }
} ///:~
