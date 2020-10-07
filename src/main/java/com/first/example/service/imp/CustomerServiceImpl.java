package com.first.example.service.imp;

import com.first.example.bean.Customer;
import com.first.example.exception.CustomerException;
import com.first.example.mapper.CustomerMapper;
import com.first.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : Zhaoy
 * @motto :生而为人我很抱歉
 * @date : 2020/9/23 10:40
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerMapper customerMapper;

    /**
     * 用户登录方法
     *
     * @param customer 登录的用户
     * @return 是否成功登录
     */
    @Override
    public Boolean insetCustomer(Customer customer) {
        try {
            return customerMapper.insertCustomer(customer) >= 1;
        } catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    /**
     * 查询一个用户
     *
     * @param phone 用户账号
     * @return 是否能够查询到
     */
    @Override
    public Customer findByPhone(String phone) {
        try{
            return customerMapper.findByPhone(phone);
        }catch (Exception e){
            throw new CustomerException(phone,e.getMessage());
        }
    }
}
