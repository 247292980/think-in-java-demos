package com.lgp.thinkinjavademos.demo.part10;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/**
 * @AUTHOR lgp
 * @DATE 2018/7/16 17:11
 * @DESCRIPTION
 **/
public class Echo {
    public static void main(String[] args) {
        DataInputStream in =
                new DataInputStream(
                        new BufferedInputStream(System.in));
        String s;
        try {
            while((s = in.readLine()).length() != 0)
                System.out.println(s);
// An empty line terminates the program
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
} ///:~
