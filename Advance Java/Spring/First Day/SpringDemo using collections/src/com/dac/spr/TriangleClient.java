package com.dac.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TriangleClient {
    public static void main(String[] args){
//        Triangle triangle = new Triangle();
//        triangle.setType("Equilateral");
//        System.out.println(triangle.getType());
        
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Triangle tri = (Triangle)context.getBean("triangle");
        System.out.println(tri);
    }
}
