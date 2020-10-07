package com.first.example.controller;

import com.first.example.bean.Room;
import com.first.example.dto.HostelRoom;
import com.first.example.result.Result;
import com.first.example.result.ResultCode;
import com.first.example.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.alibaba.fastjson.*;

import java.util.List;

/**
 * @author : Zhaoy
 * @motto :生而为人我很抱歉
 * @date : 2020/9/25 16:17
 */
@RestController

public class RoomController {

    @Autowired
    RoomService roomService;

    @PostMapping("/offset")
    public Result offset(@RequestParam("pageNo") Integer pageNo, @RequestParam("pageSize") Integer pageSize,
                         @RequestParam("hostelId") Integer hostelId) {
        int temp = roomService.findAllRooms(hostelId) / pageSize + 1;
        if ((pageNo - 1) < 0) {
            List<Room> roomList = roomService.findRooms(1, pageSize, hostelId);
            return new Result<>()
                    .setCode(ResultCode.FAIL)
                    .setMessage("已经是第一页啦")
                    .setData(roomList);
        } else if (pageNo > temp) {
            List<Room> roomList = roomService.findRooms(temp, pageSize, hostelId);
            return new Result<>()
                    .setCode(ResultCode.FAIL)
                    .setMessage("已经是最后一页了啦")
                    .setData(roomList);
        } else {
            List<Room> roomList = roomService.findRooms(pageNo, pageSize, hostelId);
            if (roomList != null) {
                System.out.println(roomList.toString());
                return new Result<>()
                        .setCode(ResultCode.SUCCESS)
                        .setMessage("获取页的所有酒店")
                        .setData(roomList);
            }
        }
        return null;
    }

    @PostMapping("/setStatus")
    public Result setStatus(@RequestBody HostelRoom hostelRoom) {
        if (roomService.findRoomStatus(hostelRoom) == 0) {
            boolean flag = roomService.setRoomStatus(hostelRoom);
            if (flag) {
                return new Result<>()
                        .setCode(ResultCode.SUCCESS)
                        .setMessage("成功改变房间状态")
                        .setData(roomService.findRoomStatus(hostelRoom));
            }
        }
        return new Result<>()
                .setCode(ResultCode.FAIL)
                .setMessage("返回错误");
    }

    @PostMapping(value = "/findDefault")
    public Result findDefault(@RequestBody Room room) {
        List<Room> lists = roomService.findDefault(room.getHostelId(), room.getType());
        if (lists != null) {
            return new Result<>()
                    .setCode(ResultCode.SUCCESS)
                    .setMessage("空房间列表")
                    .setData(lists.toArray()[0]);
        } else {
            return new Result()
                    .setCode(ResultCode.FAIL)
                    .setMessage("无酒店");
        }
    }
}
