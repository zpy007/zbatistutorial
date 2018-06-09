package com.zpy.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;

public interface ClientsMapper {
    //@Select("select * from clients where client_id=#{id}")
    HashMap selectClient(/*@Param("id")*/ String id);
}
