package com.first.example.controller;

import com.first.example.bean.Customer;
import com.first.example.result.Result;
import com.first.example.result.ResultCode;
import com.first.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author : Zhaoy
 * @motto :生而为人我很抱歉
 * @date : 2020/9/23 9:31
 */
@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/login")
    @CrossOrigin
    @ResponseBody
    public Result login(@RequestBody Customer customer, HttpServletRequest request) {
        System.out.println("login" + customer.toString());
        Customer resCustomer = customerService.findByPhone(customer.getPhone());
        if (resCustomer != null && resCustomer.getPassword().equals(customer.getPassword())) {
            HttpSession session = request.getSession();
            session.setAttribute("customer", resCustomer);
            return new Result()
                    .setCode(ResultCode.SUCCESS)
                    .setMessage("登录成功");
        }
        return new Result()
                .setCode(ResultCode.INTERNAL_SERVER_ERROR)
                .setMessage("登录失败");
    }

    @PostMapping("/needLogin")
    @CrossOrigin
    @ResponseBody
    public String needLogin(@RequestBody Customer customer, HttpServletRequest request) {
        return "redirect:/login";
    }

    @PostMapping("/registry")
    @CrossOrigin
    @ResponseBody
    public Result register(@RequestBody Customer customer) {
        System.out.println(customer.toString() + "registry");
        boolean flag = customerService.insetCustomer(customer);
        System.out.println(flag);
        if (flag) {
            return new Result()
                    .setCode(ResultCode.SUCCESS)
                    .setMessage("注册成功,请登录");
        }
        return new Result()
                .setCode(ResultCode.INTERNAL_SERVER_ERROR)
                .setMessage("注册失败");
    }
    @PostMapping("findByPhone")
    public Result findByPhone(@RequestBody Customer  customer){
        Customer rescustomer = customerService.findByPhone((customer.getPhone().replace("\"","")).trim());
        System.out.println((customer.getPhone().replace("\"","")).trim());
        System.out.println(rescustomer);
        if(rescustomer != null){
            return new Result<>()
                    .setCode(ResultCode.SUCCESS)
                    .setMessage("查到用户")
                    .setData(rescustomer);
        }
        return new Result()
                .setCode(ResultCode.FAIL)
                .setMessage("成功");
    }
}
