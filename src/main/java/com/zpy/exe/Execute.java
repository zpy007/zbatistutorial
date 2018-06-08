package com.zpy.exe;

import com.zpy.service.ServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Execute {

    public void doExecute(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        ServiceImpl impl = context.getBean("serviceImpl",ServiceImpl.class);
        impl.doService();
    }

    public static void main(String[] args){
        Execute e = new Execute();
        e.doExecute();
    }
}
