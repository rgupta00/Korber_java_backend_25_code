package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //i will go with ano config
@ComponentScan(basePackages = "com.demo") //find annotated classes in this package
public class AppConfig {
}
