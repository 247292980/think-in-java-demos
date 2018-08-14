package com.lgp.thinkinjavademos.demo.BeanCopier;

/**
 * @AUTHOR lgp
 * @DATE 2018/6/25 16:06
 * @DESCRIPTION
 **/
public class oneNoSetter {
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private int id;
    private String name;

    @Override
    public String toString() {
        return " oneNoSetter{  "
                + " \n id : " + this.id
                + " \n name : " + this.name
                + " \n }";
    }
}
