package com.java8.session1.ex3;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

//OCP
public class AppleApp {
    public static List<Apple>getAllApplesOnPredicate(List<Apple> apples,
                                                     Predicate<Apple> predicate){
        return apples.stream().filter(predicate).collect(Collectors.toList());
    }
}




