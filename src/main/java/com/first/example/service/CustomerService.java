package com.first.example.service;

import com.first.example.bean.Customer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @author : Zhaoy
 * @motto :生而为人我很抱歉
 * @date : 2020/9/23 10:39
 */
public interface CustomerService {

    /**
     *用于用户登录
     * @param customer 登录的用户
     * @return 返回是否成功
     */
    Boolean insetCustomer(Customer customer);

    /**
     * 查询一个用户
     * @param phone 用户账号
     * @return 是否能够查询到
     */
    Customer findByPhone(String  phone);
}
