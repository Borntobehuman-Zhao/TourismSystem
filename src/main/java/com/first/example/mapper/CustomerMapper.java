package com.first.example.mapper;

import com.first.example.bean.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author : Zhaoy
 * @motto :生而为人我很抱歉
 * @date : 2020/9/23 9:54
 */
@Mapper
public interface CustomerMapper {
    /**
     * 用户注册
     *
     * @param customer 用户
     * @return 注册是否成功
     */
    Integer insertCustomer(Customer customer);

    /**
     * 查询一个用户
     *
     * @param phone 用户账号
     * @return 是否能够查询到
     */
    Customer findByPhone(@Param("phone") String phone);


}

