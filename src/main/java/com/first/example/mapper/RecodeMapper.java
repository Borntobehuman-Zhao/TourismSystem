package com.first.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;


/**
 * @author : Zhaoy
 * @motto :生而为人我很抱歉
 * @date : 2020/9/28 16:24
 */
@Mapper
public interface RecodeMapper {


    /**
     * 插入酒店入住记录
     * @param customerId 用户id
     * @param hostelId 酒店id
     * @param roomId 房间号
     * @param time 入住时间
     * @return 入住记录是否插入成功，当预订的用户入住酒店时，则插入当前的时间
     */
    public Boolean insertRecode(@Param("customerId") Integer customerId,
                                @Param("hostelId") Integer hostelId,
                                @Param("roomId") Integer roomId,
                                @Param("time") Date time);
}
