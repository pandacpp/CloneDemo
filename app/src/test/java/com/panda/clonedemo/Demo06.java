package com.panda.clonedemo;

import org.junit.Test;

public class Demo06 {
    @Test
    public void main(){
        User u = new User("xiaoming",20);
        User u2 = (User) u.clone();
        u2.setName("lisi");
        u2.setAge(30);
        System.out.println(u.getAge());
        System.out.println(u.getName());

        System.out.println(u2.getAge());
        System.out.println(u2.getName());

    }
}
