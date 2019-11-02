package com.jengstrom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App
{
//    private static Object Tire;

    public static void main(String[] args )
    {
//        BeanFactory -> small app
//        BeanFactory
//        ApplicationContext -> large app
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/*spring.xml");

        Vehicle obj = (Vehicle) context.getBean("vehicle");
        obj.drive();

//        Tire t = (Tire) context.getBean("tire");
//        Tire t = (Tire) context.getBean("Tire", Tire);
//        System.out.println(t);
    }
}
