package com.panda.clonedemo;

import androidx.annotation.NonNull;

/**
 * 原文链接：https://www.cnblogs.com/qlwang/p/7889802.html
 */

public class User implements Cloneable {
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @NonNull
    @Override
    protected Object clone() {
        Object o = null;
        try {
            //Object中clone()识别出你要复制的是哪一个对象
            o = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.toString());
        }
        return o;
    }
}
