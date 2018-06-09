package com.zpy.exe;

import com.zpy.dao.ClientsMapper;
import com.zpy.pojo.User;
import com.zpy.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;

public class Execute {

    @Autowired
    User user;

    public void doExecute(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        user=context.getBean(User.class);
        user.setClient_name("张三1");
        System.out.println(user.getClient_name());
        user.setClient_code("6661");
        user.setClient_id("150424128707221129");
        //ServiceImpl impl = context.getBean("serviceImpl",ServiceImpl.class);
        //impl.doService();
        ClientsMapper mapper = (ClientsMapper) context.getBean("clientsMapper");
        mapper.insertUser(user);

    }
    public static void main(String[] args){
        Execute e = new Execute();
        e.doExecute();
    }
}
