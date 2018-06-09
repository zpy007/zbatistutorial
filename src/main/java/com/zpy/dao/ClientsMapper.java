package com.zpy.dao;

import com.zpy.pojo.User;


import java.util.HashMap;

public interface ClientsMapper {
    //@Select("select * from clients where client_id=#{id}")
    HashMap selectClient(/*@Param("id")*/ String id);
    void insertUser(User user);
}
