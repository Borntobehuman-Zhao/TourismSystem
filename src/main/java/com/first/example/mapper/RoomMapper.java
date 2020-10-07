package com.first.example.mapper;

import com.first.example.bean.Room;
import com.first.example.dto.HostelRoom;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author : Zhaoy
 * @motto :生而为人我很抱歉
 * @date : 2020/9/25 14:58
 */
@Mapper
public interface RoomMapper {

    /**
     * 查询酒店房间的状态
     * @param hostelRoom 酒店房间类
     * @return 返回状态值
     */
    public Integer findRoomStatus(HostelRoom hostelRoom);

    /**
     * 设置房间状态
     *
     * @param hostelRoom 酒店房间
     * @return  是否更改
     */
    public boolean setRoomStatus(HostelRoom hostelRoom);

    /**
     * 该酒店的所有房间
     *
     * @param hostelId 酒店号
     * @return 返回数目
     */
    public Integer findAllRooms(@Param("hostelId") Integer hostelId);

    /**
     * 查询单个页面的房间
     *
     * @param pageNo   页面号
     * @param pageSize 页面尺寸
     * @param hostelId 酒店id
     * @return 酒店集合
     */
    public List<Room> findRooms(@Param("pageNo") Integer pageNo, @Param("pageSize") Integer pageSize,
                                @Param("hostelId") Integer hostelId);

    /**
     * 查询默认的房间
     *
     * @param hostelId 通过酒店id
     * @param type     房间类型
     * @return 所有房间列表
     */
    public List<Room> findDefault(@Param("hostelId") Integer hostelId, @Param("type") String type);
}
