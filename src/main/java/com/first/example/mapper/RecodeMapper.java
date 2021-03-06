package com.first.example.mapper;

import com.first.example.bean.Recode;
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
     * 插入预订记录单
     * @param recode 订单实体
     * @return 插入成功
     */
    public Integer insertRecode(Recode recode);

    /**
     * 查看订单
     * @param customerId 用户号
     * @return 返回订单实体
     */
    public Recode findRecode(Integer customerId);
}
