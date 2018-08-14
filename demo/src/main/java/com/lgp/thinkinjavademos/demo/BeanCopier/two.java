package com.lgp.thinkinjavademos.demo.BeanCopier;

/**
 * @AUTHOR lgp
 * @DATE 2018/6/25 16:05
 * @DESCRIPTION
 **/
public class two {
    private int id;
    private String name;

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

    @Override
    public String toString() {
        return " two{  "
                + " \n id : " + this.id
                + " \n name : " + this.name
                + "  \n }";
    }
}
