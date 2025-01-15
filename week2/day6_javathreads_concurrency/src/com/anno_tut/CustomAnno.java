package com.anno_tut;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

//how to create our own anntations
@Target({ElementType.METHOD, ElementType.TYPE}) //where i can apply this annotations
@Retention(RetentionPolicy.RUNTIME)//scope of the annotations, RUNTIME, custom : RUNTIME
@interface MyAnn{
    public String message() default "hello";
}

//2 u use that anno
class MyDemo{
    @MyAnn(message = "i was applied")
    void foo(){
        System.out.println("foo method ...");
    }
}
//3. u have to process that annotation, using "java reflection"
public class CustomAnno {
    public static void main(String[] args)throws ClassNotFoundException {

       Class<?> clazz=Class.forName("com.anno_tut.MyDemo");
       Method[] methods=clazz.getDeclaredMethods();
       for(Method m:methods){
           if(m.isAnnotationPresent(com.anno_tut.MyAnn.class)){
               com.anno_tut.MyAnn anno=m.getAnnotation(com.anno_tut.MyAnn.class);
               System.out.println(anno.message());
           }
       }
    }
}
