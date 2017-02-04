package com.test.core.spring.ioc;

import com.test.core.spring.ioc.beans.Car;
import com.test.core.spring.ioc.beans.Garage;
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

        final Car car1 = context.getBean("car", Car.class);
        System.out.println("Car1 model - " + car1.getModel());
        logger.debug("Car model: {}", car1.getModel());
        final Car car2 = context.getBean("opelCar",Car.class);
        System.out.println("Car2 model - " + car2.getModel());
        logger.debug("Car model: {}", car2.getModel());
        final Garage garage1 = context.getBean("opelGarage",Garage.class);
        System.out.println("Garage number is: "+garage1.getNumber());
        System.out.println("Car in garage number "+garage1.getNumber()+" is "+garage1.getCar().getModel());
        logger.debug("Garage number is: " + garage1.getNumber());
        logger.debug("Car in garage number "+garage1.getNumber()+" is "+garage1.getCar().getModel());
    }
}
