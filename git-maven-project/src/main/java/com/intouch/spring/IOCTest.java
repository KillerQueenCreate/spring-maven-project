package com.intouch.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IOCTest {
    private static final DateFormat dateFormat=new SimpleDateFormat("yyyy年MM月dd");
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        //Date now= (Date) context.getBean("now");
        Date today=(Date) context.getBean("now");
        System.out.println("Now is "+ dateFormat.format(today));


    }

}
