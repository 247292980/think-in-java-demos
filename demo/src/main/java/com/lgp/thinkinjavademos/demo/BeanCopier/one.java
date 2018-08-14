package com.lgp.thinkinjavademos.demo.BeanCopier;

/**
 * @AUTHOR lgp
 * @DATE 2018/6/25 16:04
 * @DESCRIPTION
 **/
public class one {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int id;
    private String name;

    @Override
    public String toString() {
        return " one{  "
                + " \n id : " + this.id
                + " \n name : " + this.name
                +"  \n }";
    }
}
