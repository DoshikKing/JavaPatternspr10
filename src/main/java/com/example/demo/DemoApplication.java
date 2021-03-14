package com.example.demo;

import com.example.demo.components.Junior;
import com.example.demo.components.Middle;
import com.example.demo.components.Senior;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        //ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AutoConfig.class);
        Junior j = applicationContext.getBean(Junior.class);
        System.out.println(j.doCoding());
        Middle m = applicationContext.getBean(Middle.class);
        System.out.println(m.doCoding());
        Senior s = applicationContext.getBean(Senior.class);
        System.out.println(s.doCoding());
        //SpringApplication.run(DemoApplication.class, args);
    }

}
