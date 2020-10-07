package com.first.example.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @author : Zhaoy
 * @motto :生而为人我很抱歉
 * @date : 2020/10/6 13:44
 */
public interface FilesMapper {
    /**
     * 管理员添加酒店
     * @param hostelName 酒店名称
     * @param address 酒店地址
     * @param hostelPhone 酒店客房电话
     * @param hostelUrl 酒店照片地址
     * @return 参数值
     */
    public Integer uploadHostelWithAdmin(@Param("hostelName") String hostelName,@Param("hostelAddress") String address
    ,@Param("hostelPhone") String hostelPhone,@Param("hostelUrl") String hostelUrl);
}
