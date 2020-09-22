package com.cxl.community.dao;

import com.cxl.community.entity.LoginTicket;
import org.apache.ibatis.annotations.*;

@Mapper
public interface LoginTicketMapper {

    int insertLoginTicket(LoginTicket loginTicket);

    LoginTicket selectByTicket(String ticket);

    int updateStatus(String ticket, int status);

}
