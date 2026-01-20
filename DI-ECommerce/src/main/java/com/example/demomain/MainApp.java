package com.example.demomain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demomodel.ProductOrder;

public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        ProductOrder pr = (ProductOrder) context.getBean("order");
        pr.display();
    }
}
