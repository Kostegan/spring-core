package com.test.core.spring.initdestroy.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 */
public class DefaultMethodInitBean {
    private static Logger log = LoggerFactory.getLogger(DefaultMethodInitBean.class);

    public void someDefaultInitMethod(){
        log.debug("");
        log.debug("someDefaultInitMethod invoked");
    }

    public void someDefaultDestroyMethod(){
        log.debug("");
        log.debug("someDefaultDestroyMethod invoked");

    }
}
