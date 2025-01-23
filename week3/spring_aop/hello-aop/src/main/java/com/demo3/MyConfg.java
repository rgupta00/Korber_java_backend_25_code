package com.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.demo3")
 public class MyConfg {

    //Spring : never apply new operation
    //by deafult method name become bean name
    //@Component vs @Bean
    //BB            infra str bean: jdbc connection vendor class , final

    @Bean
    @Scope("singleton")
    public Car car(Engine engine){
        System.out.println("------------------");
        return new Car(engine);
    }

    @Scope("prototype")
    @Bean(name = "e")
    public Engine engine(){
        return new Engine();
    }
}
