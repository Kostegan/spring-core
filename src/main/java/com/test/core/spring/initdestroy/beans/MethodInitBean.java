package com.test.core.spring.initdestroy.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 */
public class MethodInitBean {
    private static Logger log = LoggerFactory.getLogger(MethodInitBean.class);

    public void someInitMethod() {
        log.debug("");
        log.debug("someInitMethod invoked");
    }

    public void someDestroyMethod() {
        log.debug("");
        log.debug("someDestroyMethod invoked");
    }
}
