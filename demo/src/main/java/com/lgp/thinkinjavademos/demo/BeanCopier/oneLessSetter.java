package com.lgp.thinkinjavademos.demo.BeanCopier;

/**
 * @AUTHOR lgp
 * @DATE 2018/6/25 16:31
 * @DESCRIPTION
 **/
public class oneLessSetter {
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private int id;

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return " oneLessSetter{  "
                + " \n id : " + this.id
                + " \n name : " + this.name
                + " \n }";
    }
}
