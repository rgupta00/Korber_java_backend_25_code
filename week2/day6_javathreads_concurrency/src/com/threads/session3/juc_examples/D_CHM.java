package com.threads.session3.juc_examples;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

public class D_CHM {
    public static void main(String[] args) {
        Map<String, Integer> map1=new HashMap<>(16, .75f);
        ConcurrentHashMap<String, Integer> map=
                new ConcurrentHashMap<>(16, .75f,16);
        map.putIfAbsent("foo",20);//thread safe
    }
}
