package com.anno_tut;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class Student{
    private int id;
    private String name;

    public Student() {
        System.out.println("default ctr");
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("param ctr");
    }
    public void print(){
            System.out.println("id "+id);
        System.out.println("name "+name);
    }
}
public class DemoReflection {
    public static void main(String[] args) throws ClassNotFoundException {
//        Student s=new Student(3,"raj");
//        s.print();

        Class<?> clazz=Class.forName("com.anno_tut.Student");
        Method[]methods=clazz.getDeclaredMethods();
        for(Method m:methods){
            System.out.println(m.getName()+" :"+ Modifier.toString(m.getModifiers()));
        }
    }
}
