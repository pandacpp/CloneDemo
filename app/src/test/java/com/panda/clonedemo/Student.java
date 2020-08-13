package com.panda.clonedemo;

import androidx.annotation.NonNull;

public class Student implements Cloneable {
    private String name;
    private Integer age;

    //引用
    private Professor professor;

    public Student(String name, Integer age, Professor professor) {
        super();
        this.name = name;
        this.age = age;
        this.professor = professor;
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

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @NonNull
    @Override
    protected Object clone() {
        Student o = null;
        try {
            o = (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.toString());
        }
        o.professor = (Professor) professor.clone();
        return o;
    }
}
