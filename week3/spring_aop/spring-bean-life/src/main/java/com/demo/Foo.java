package com.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Foo {
    private String fooValue;

    public Foo(){
        System.out.println("default ctr");
    }

    @PostConstruct
    public void init(){
        System.out.println("-------init method--------");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("-------destroy method--------");
    }

    public String getFooValue() {
        return fooValue;
    }

    public void setFooValue(String fooValue) {
        System.out.println("Foo setter is called");
        this.fooValue = fooValue;
    }
    public void print(){
        System.out.println(fooValue);
    }
}
