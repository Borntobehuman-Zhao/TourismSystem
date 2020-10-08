package com.first.example.service;

import com.first.example.bean.Recode;

/**
 * @author : Zhaoy
 * @motto :生而为人我很抱歉
 * @date : 2020/10/8 22:36
 */
public interface RecodeService {
    /**
     * 插入预订记录单
     * @param recode 订单实体
     * @return 插入成功
     */
    public Boolean insertRecode(Recode recode);

    /**
     * 查看订单
     * @param customerId 用户号
     * @return 返回订单实体
     */
    public Recode findRecode(Integer customerId);
}
