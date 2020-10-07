package com.first.example.service.imp;

import com.first.example.bean.Room;
import com.first.example.dto.HostelRoom;
import com.first.example.mapper.RoomMapper;
import com.first.example.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Zhaoy
 * @motto :生而为人我很抱歉
 * @date : 2020/9/25 16:05
 */
@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    RoomMapper roomMapper;

    /**查询酒店状态
     *
     * @param hostelRoom 酒店房间类
     * @return 状态值
     */
    @Override
    public Integer findRoomStatus(HostelRoom hostelRoom) {
        return roomMapper.findRoomStatus(hostelRoom);
    }

    /**
     * 设置房间状态
     * @param hostelRoom 酒店房间类
     * @return 是否成功
     */
    @Override
    public boolean setRoomStatus(HostelRoom hostelRoom) {
        try {
            return roomMapper.setRoomStatus(hostelRoom);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /**
     * 房间个数
     * 查询总共的
     *
     * @return 房间总数
     */
    @Override
    public Integer findAllRooms(Integer hostelId) {
        return roomMapper.findAllRooms(hostelId);
    }

    /**
     * 一次查询10个房间
     *
     * @param pageSize 一页有多少数据
     * @param pageNo   当前页
     * @return 返回当前页的所有房间数据
     */
    @Override
    public List<Room> findRooms(Integer pageNo, Integer pageSize, Integer hostelId) {
        try {
            return roomMapper.findRooms((pageNo - 1) * pageSize, pageSize, hostelId);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /**
     * 查询默认的房间
     *
     * @param hostelId 通过酒店id
     * @return 所有房间列表
     */
    @Override
    public List<Room> findDefault(Integer hostelId,String type) {
        try {
            return roomMapper.findDefault(hostelId,type);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
