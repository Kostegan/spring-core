package com.test.core.spring.initdestroy.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 *
 */
public class SpringInterfaceInitBean implements InitializingBean, DisposableBean{

    private static Logger log = LoggerFactory.getLogger(SpringInterfaceInitBean.class);

    @Override
    public void afterPropertiesSet() throws Exception {
        log.debug("");
        log.debug("afterPropertiesSet invoked");
    }

    @Override
    public void destroy() throws Exception {
        log.debug("");
        log.debug("destroy invoked");
    }
}
