package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args ) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        Alien obj = context.getBean(Alien.class );
        obj.code();






//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//
//        System.out.println("OUTPUT:"+ obj.getAge());
//        System.out.println("Finished!");

    }
}