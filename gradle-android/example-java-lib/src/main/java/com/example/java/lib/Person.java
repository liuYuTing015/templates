package com.example.java.lib;

/**
 * Created by mrseasons on 2015/4/25.
 */
public class Person {

    /**
     * 姓名
     */
    private String name;

    private Address address;

    public Person(String name) {
        this.name = name;
        this.address = new Address();
    }

    void setName(String name) {
        this.name = name;
    }

    /**
     * 挨拶する
     *
     * @return　挨拶文字列
     */
    public String hello() {
        return "Hello, I'm " + name;
    }

    @Override
    public String toString() {
        return name;
    }
}
