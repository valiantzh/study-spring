package com.study.spring.rabbitmq.demo1;

import com.study.spring.rabbitmq.demo1.exception.SendRefuseException;

public interface EventTemplate {
	void send(String queueName,String exchangeName,Object eventContent) throws SendRefuseException;
    void send(String queueName,String exchangeName,Object eventContent,CodecFactory codecFactory) throws SendRefuseException;
}
