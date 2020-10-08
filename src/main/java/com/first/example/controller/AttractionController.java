package com.first.example.controller;

import com.first.example.bean.Attraction;
import com.first.example.bean.Hostel;
import com.first.example.result.Result;
import com.first.example.result.ResultCode;
import com.first.example.service.AttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author : Zhaoy
 * @motto :生而为人我很抱歉
 * @date : 2020/9/24 10:45
 */
@RestController
public class AttractionController {

    @Autowired
    AttractionService attractionService;

    @GetMapping(value = "/find", produces = "application/json;charset=utf-8")
    public Result findAttractions(@RequestParam("keyWord") String keyWord, HttpServletRequest request) {
        List<Attraction> lists = attractionService.findAttractionsByKey(keyWord);
        request.getSession().setAttribute("attractionList", lists);
        if (lists != null) {
            return new Result<>()
                    .setCode(ResultCode.SUCCESS)
                    .setMessage("成功查询关键字景点")
                    .setData(lists);
        }
        return new Result<>()
                .setCode(ResultCode.FAIL)
                .setMessage("该景点尚未被录入");
    }

    @GetMapping(value = "/limit", produces = "application/json;charset=utf-8")
    public Result getAttractions(@RequestParam Integer limit) {
        List<Attraction> listAttractions = attractionService.findAttractions(limit);
        if (listAttractions != null) {
            return new Result<>()
                    .setCode(ResultCode.SUCCESS)
                    .setMessage("景点列表如下")
                    .setData(listAttractions);

        }
        return new Result()
                .setCode(ResultCode.FAIL)
                .setMessage("系统尚未推荐景点");
    }

    @GetMapping(value = "/findHostel", produces = "application/json;charset=utf-8")
    public Result findHostel(@RequestParam("id") Integer id) {
        List<Hostel> hostels = attractionService.findHostel(id);
        if (hostels != null) {
            return new Result<>()
                    .setCode(ResultCode.SUCCESS)
                    .setMessage("查询到的酒店")
                    .setData(hostels);
        }
        return new Result()
                .setCode(ResultCode.FAIL)
                .setMessage("该景点周围暂无酒店");
    }
    @GetMapping("findAllAttraction")
    public Result findAll(){
        List<Attraction> attractions = attractionService.findAll();
        if(attractions != null){
            return new Result<>()
                    .setCode(ResultCode.SUCCESS)
                    .setMessage("所有酒店")
                    .setData(attractions.toArray());
        }
        return new Result()
                .setCode(ResultCode.FAIL)
                .setMessage("查询失败");
    }
}