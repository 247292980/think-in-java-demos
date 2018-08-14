package com.lgp.thinkinjavademos.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @AUTHOR lgp
 * @DATE 2018/6/22 15:17
 * @DESCRIPTION
 **/
public class ParamterTest {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(0);
        list2.add(0);
        f(list1, list2);
        System.out.println("list1 2");
        p(list1);
        System.out.println("list2 2");
        p(list2);
    }

    public static void f(List<Integer> list1, List<Integer> list2) {
        list1.add(1);
        list2.add(1);
        list2 = new ArrayList<>();
        list1.add(2);
        list2.add(2);
        System.out.println("list1 1");
        p(list1);
        System.out.println("list2 1");
        p(list2);
    }

    public static void p(List<Integer> list) {
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
