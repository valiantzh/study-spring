/**
 * 
 * File: MessageErrorHandler.java <br/>
 * Package: com.study.spring.rabbitmq.demo1.impl <br/>
 * Description:TODO(用一句话描述该文件做什么) <br/>
 * @author zhengxy
 * @Date 2018年11月2日 下午3:59:07
 * @version 1.0
 * 
 */
package com.study.spring.rabbitmq.demo1.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ErrorHandler;

/** 
 *   
 * @author zhengxy
 * @date 2018年11月2日 下午3:59:07  
 *   
 */
public class MessageErrorHandler implements ErrorHandler {
    private static final Logger logger = LoggerFactory.getLogger(MessageErrorHandler.class);
    /* (non Javadoc)  
     * @Title: handleError  
     * @Description: TODO
     * @param t  
     * @see org.springframework.util.ErrorHandler#handleError(java.lang.Throwable)  
     */
    @Override
    public void handleError(Throwable t) {
        logger.error("RabbitMQ happen a error:" + t.getMessage(), t);
        
    }
    
}
