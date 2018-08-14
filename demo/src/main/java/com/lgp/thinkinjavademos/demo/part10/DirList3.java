package com.lgp.thinkinjavademos.demo.part10;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @AUTHOR lgp
 * @DATE 2018/7/16 15:57
 * @DESCRIPTION
 **/
public class DirList3 {
    public static void main(final String[] args) {
        try {
            File path = new File(".");
            String[] list;
            if (args.length == 0) {
                list = path.list();
            } else {
                list = path.list(new FilenameFilter() {
                    @Override
                    public boolean accept(File dir, String n) {
                        String f = new File(n).getName();
                        return f.indexOf(args[0]) != -1;
                    }
                });
            }
            for (String aList : list) {
                System.out.println(aList);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
} ///:~
