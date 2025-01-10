package com.day4.session1.string_class;

public class Demo {
    public static void main(String[] args) {
        //HOW to rev a string
        String a="nitin";
        String rev = new StringBuilder(a).reverse().toString();
        System.out.println(rev);

//        String s1 = "Hello";
//        s1= s1.toUpperCase();
//        System.out.println(s1);

//        String s2 = "Hello";
//        System.out.println(s1.equals(s2));
    }
}
