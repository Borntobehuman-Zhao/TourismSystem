package com.first.example.controller;

import com.first.example.bean.Attraction;
import com.first.example.bean.Hostel;
import com.first.example.result.Result;
import com.first.example.result.ResultCode;
import com.first.example.service.HostelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author : Zhaoy
 * @motto :生而为人我很抱歉
 * @date : 2020/9/25 14:17
 */
@RestController
public class HostelController {

    @Autowired
    HostelService hostelService;

    @GetMapping(value = "/hostel", produces = "application/json;charset=utf-8")
    public Result findHostels(@RequestParam("limit") Integer limit) {
        List<Hostel> listHostels = hostelService.findHostelByLimit(limit);
        if (listHostels != null) {
            return new Result<>()
                    .setCode(ResultCode.SUCCESS)
                    .setMessage("查询推荐酒店")
                    .setData(listHostels);
        }
        return new Result<>()
                .setCode(ResultCode.FAIL)
                .setMessage("暂无推荐酒店");
    }

    @GetMapping(value = "/findAttractions", produces = "application/json;charset=utf-8")
    public Result findAttractions(@RequestParam("hostelId") Integer hostelId) {
        List<Attraction> attractions = hostelService.findAttractions(hostelId);
        if (hostelId != null) {
            return new Result<>()
                    .setCode(ResultCode.SUCCESS)
                    .setMessage("查询合作景点")
                    .setData(attractions);
        }
        return new Result<>()
                .setCode(ResultCode.FAIL)
                .setMessage("暂无合作景点");
    }

    /*@PostMapping("/upload")
    public Result fileUpload(Hostel hostel) {
        try {
            if (hostel == null) {
                return new Result()
                        .setCode(ResultCode.FAIL)
                        .setMessage("录入信息为空");
                //文件存在的位置
                String path = "1";
                //获取文件名
                String fileName = hostel.getFiles().getOriginalFilename();
                //创建一个UUID用时间戳表示
                String uuId = new Date().toString() + "";
                //组合成新文件名避免有重复的文件名
                String newFileName = uuId + fileName;
                //File.separator 表示:/
                File destFile = new File(path + File.separator + newFileName);
                //判断该文件下的上级文件夹是否存在 不存在创建
                if (!destFile.getParentFile().exists()) {
                    destFile.getParentFile().mkdirs();
                }
                //上传文件
                hostel.getFiles().transferTo(destFile);
                hostel.setName(newFileName);
                hostel.setUrl(path);
                *//*Long fdFileId = saveHosetl(hostel);*//*
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }*/
}