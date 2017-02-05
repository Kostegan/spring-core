package com.test.core.spring.instatntiation;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.test.core.spring.inheritance.beans.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 */
public class InstantiationExample {
    private static Logger log = LoggerFactory.getLogger(InstantiationExample.class);
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"springContext.xml"});

        log.debug("\n\n\n");

        Person person = context.getBean("",Person.class);
        log.debug("Default constructor: {}", gson.toJson(person));
    }

}
