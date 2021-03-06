/*
package com.lgp.thinkinjavademos.demo.part8;

import java.util.*;

*/
/**
 * @AUTHOR lgp
 * @DATE 2018/7/13 16:26
 * @DESCRIPTION
 **//*

public class ReadOnly {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        Collection1.fill(c); // Insert useful data
        c = Collections.unmodifiableCollection(c);
        Collection1.print(c); // Reading is OK
//! c.add("one"); // Can't change it
        List a = new ArrayList();
        Collection1.fill(a);
        a = Collections.unmodifiableList(a);
        ListIterator lit = a.listIterator();
        System.out.println(lit.next()); // Reading OK
//! lit.add("one"); // Can't change it
        Set s = new HashSet();
        Collection1.fill(s);
        s = Collections.unmodifiableSet(s);
        Collection1.print(s); // Reading OK
//! s.add("one"); // Can't change it
        Map m = new HashMap();
        Map1.fill(m, Map1.testData1);
        m = Collections.unmodifiableMap(m);
        Map1.print(m); // Reading OK
//! m.put("Ralph", "Howdy!");
    }
} ///:~
*/
