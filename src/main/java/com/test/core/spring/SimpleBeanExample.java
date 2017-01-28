package com.test.core.spring;

import com.test.core.spring.beans.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 */
public class SimpleBeanExample {
    private static Logger logger = LoggerFactory.getLogger(SimpleBeanExample.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"springContext.xml"});

        logger.debug("\n\n\n");

        final Car car = context.getBean("car",Car.class);
        System.out.println(car.getModel());
        logger.debug("Car model: {}", car.getModel());
    }
}
