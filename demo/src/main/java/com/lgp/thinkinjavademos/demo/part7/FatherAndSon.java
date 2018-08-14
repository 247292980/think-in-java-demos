package com.lgp.thinkinjavademos.demo.part7;

/**
 * @AUTHOR lgp
 * @DATE 2018/7/9 17:07
 * @DESCRIPTION
 **/
public class FatherAndSon {
    public static void main(String[] args) {
        new Son();
    }
}

/**
 *
 * */
class Father {
    Father() {
        System.out.println("F");
    }
}

class Son extends Father {
    Son() {
//        这里注不注释结果都不改变
//        super();
        System.out.println("S");
    }
}
