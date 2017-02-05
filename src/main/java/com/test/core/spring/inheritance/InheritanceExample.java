package com.test.core.spring.inheritance;

import com.test.core.spring.inheritance.beans.Adult;
import com.test.core.spring.inheritance.beans.Child;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 */
public class InheritanceExample {
    private static Logger log = LoggerFactory.getLogger(InheritanceExample.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"springContext.xml"});

        log.debug("\n\n\n");
        final Child child = context.getBean("child", Child.class);
        log.debug("Child name: {}", child.getName());
        log.debug("Child responsible's Passport Number: {}", child.getResponsible().getPaspNum());

//        final Child child = context.getBean("child", Child.class);
//        log.debug("Child name: {}", child.getName());
//        final Adult adult = context.getBean("adult", Adult.class);
//        System.out.println("++++++++++++++" + child.getName());
//        System.out.println("++++++++++++++" + adult.getPaspNum());
//        log.debug("Child name: " + child.getName());
//        log.debug("Child responsible is passport number: : " + child.getResponsible().getPaspNum());
//        log.debug("Child responsible is passport number: : " + child.getResponsible().getName());
//        System.out.println("========================================");
//        log.debug("Child responsible is passport number: : ", child.getResponsible().getPaspNum());
//        log.debug("Child responsible is passport number: : {}", child.getResponsible().getName());
    }
}
