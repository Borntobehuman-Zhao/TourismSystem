package com.first.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.first.example.bean.Hostel;
import com.first.example.bean.Recode;
import com.first.example.result.Result;
import com.first.example.result.ResultCode;
import com.first.example.service.RecodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Access;

/**
 * @author : Zhaoy
 * @motto :生而为人我很抱歉
 * @date : 2020/10/8 22:43
 */
@RestController
public class RecodeController {
    @Autowired
    RecodeService recodeService;

    @PostMapping("/insertRecode")
    public Result insertRecode(@RequestBody Recode recode){
        if(recodeService.insertRecode(recode)){
            return new Result()
                    .setCode(ResultCode.SUCCESS)
                    .setMessage("插入成功");
        }
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage("插入失败");
    }

    @PostMapping("/findRecode")
    public Result findRecode(@RequestBody String params){
        Integer customerId  = JSONObject.parseObject(params).getInteger("customerId");
        Recode recode = recodeService.findRecode(customerId);
        System.out.println(customerId+"    "+recode);
        if(recode != null){
            return new Result<>()
                    .setCode(ResultCode.SUCCESS)
                    .setMessage("成功")
                    .setData(recode);
        }
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage("失败");
    }
}
