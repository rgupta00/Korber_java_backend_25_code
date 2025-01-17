package com.doubts;
class Student{
    private int id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
       return  new StringBuilder("Student{").append("id=").append(id).
        append(", name='").append(name).append('\'').append(", marks=").append(marks).
        append('}').toString();

    }
}
public class Demo {
}
