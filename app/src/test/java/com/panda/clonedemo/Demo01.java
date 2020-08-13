package com.panda.clonedemo;

import org.junit.Test;

public class Demo01 {
    @Test
    public void main() {
        Professor p = new Professor("wangwu", 50);
        Student s1 = new Student("xiaoming", 20, p);
        Student s2 = (Student) s1.clone();
        s2.getProfessor().setName("xiaowamgwu");
        s2.getProfessor().setAge(40);
        System.out.println("name=" + s1.getName()
                + "," + "age=" + s1.getAge());
        System.out.println("name=" + s2.getProfessor().getName() + "," + "age=" + s2.getProfessor().getAge());
    }
}
