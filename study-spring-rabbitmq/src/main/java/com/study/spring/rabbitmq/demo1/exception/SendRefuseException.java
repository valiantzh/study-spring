package com.study.spring.rabbitmq.demo1.exception;

@SuppressWarnings("serial")
public class SendRefuseException extends Exception {
    public SendRefuseException() {
        super();
        // TODO Auto-generated constructor stub
    }

    public SendRefuseException(String arg0, Throwable arg1) {
        super(arg0, arg1);
        // TODO Auto-generated constructor stub
    }

    public SendRefuseException(String arg0) {
        super(arg0);
        // TODO Auto-generated constructor stub
    }

    public SendRefuseException(Throwable arg0) {
        super(arg0);
        // TODO Auto-generated constructor stub
    }
}
