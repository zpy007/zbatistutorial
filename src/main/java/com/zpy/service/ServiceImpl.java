package com.zpy.service;

import com.zpy.dao.ClientsMapper;

import java.util.HashMap;

public class ServiceImpl {

    public ClientsMapper clientsMapper;

    public void doService(){
        HashMap hashMap = clientsMapper.selectClient("150404198209020915");
        System.out.println(hashMap);
    }

    public ClientsMapper getClientsMapper() {
        return clientsMapper;
    }

    public void setClientsMapper(ClientsMapper clientsMapper) {
        this.clientsMapper = clientsMapper;
    }
}
