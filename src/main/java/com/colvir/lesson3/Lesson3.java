package com.colvir.lesson3;

import com.colvir.lesson3.service.ServiceA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Lesson3 {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.colvir.lesson3");
        ServiceA serviceA1 = context.getBean(ServiceA.class);
        System.out.println("Получили бин сервиса А = " + serviceA1 + ", serviceB = " + serviceA1.getServiceB());

        ServiceA serviceA2 = context.getBean(ServiceA.class);
        System.out.println("Получили бин сервиса А = " + serviceA2 + ", serviceB = " + serviceA2.getServiceB());
    }
}
