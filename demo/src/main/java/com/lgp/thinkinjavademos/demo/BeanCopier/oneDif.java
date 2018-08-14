package com.lgp.thinkinjavademos.demo.BeanCopier;

/**
 * @AUTHOR lgp
 * @DATE 2018/6/25 16:05
 * @DESCRIPTION
 **/
public class oneDif {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    @Override
    public String toString() {
        return " oneDif{  "
                + " \n id : " + this.id
                + " \n name : " + this.name
                + " \n }";
    }
}
