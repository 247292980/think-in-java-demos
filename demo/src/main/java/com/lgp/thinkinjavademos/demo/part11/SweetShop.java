package com.lgp.thinkinjavademos.demo.part11;

/**
 * @AUTHOR lgp
 * @DATE 2018/7/18 9:54
 * @DESCRIPTION
 **/
class Candy {
    static {
        System.out.println("Loading Candy");
    }
}
class Gum {
    static {
        System.out.println("Loading Gum");
    }
}
class Cookie {
    static {
        System.out.println("Loading Cookie");
    }
}
public class SweetShop {
    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy");
        try {
            Class.forName("Gum");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(
                "After Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After creating Cookie");
    }
} ///:~
