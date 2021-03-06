package com.test.core.spring.lazyinit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 *
 */
public class LazyInitExample {
    private static Logger log = LoggerFactory.getLogger(LazyInitExample.class);

    public static void main(String[] args) throws InterruptedException{
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"springContext.xml"});

        log.debug("\n\n\n");

        Thread.sleep(5000);

        Date notLazy = context.getBean("not-lazy", Date.class);
        Date lazy = context.getBean("lazy",Date.class);

        log.debug("Not-lazy is: {}",notLazy);
        log.debug("lazy is: {}",lazy);
    }

}
