package com.study.spring.rabbitmq.demo1;

public interface EventProcesser {
	public void process(Object e);
}
