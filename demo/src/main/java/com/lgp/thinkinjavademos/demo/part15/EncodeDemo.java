package com.lgp.thinkinjavademos.demo.part15;

/**
 * @AUTHOR lgp
 * @DATE 2018/7/26 10:15
 * @DESCRIPTION
 **/
import java.net.*;
public class EncodeDemo {
    public static void main(String[] args) {
        String s = "";
        for(int i = 0; i < args.length; i++)
            s += args[i] + " ";
        s = URLEncoder.encode(s.trim());
        System.out.println(s);
    }
} ///:~
