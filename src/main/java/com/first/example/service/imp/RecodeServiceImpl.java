package com.first.example.service.imp;

import com.first.example.bean.Recode;
import com.first.example.mapper.RecodeMapper;
import com.first.example.service.RecodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : Zhaoy
 * @motto :生而为人我很抱歉
 * @date : 2020/10/8 22:39
 */
@Service
public class RecodeServiceImpl implements RecodeService {
    @Autowired
    RecodeMapper recodeMapper;
    /**
     * 插入预订记录单
     *
     * @param recode 订单实体
     * @return 插入成功
     */
    @Override
    public Boolean insertRecode(Recode recode) {
        try{
            return recodeMapper.insertRecode(recode) >= 1;
        }catch(Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    /**
     * 查看订单
     *
     * @param customerId 用户号
     * @return 返回订单实体
     */
    @Override
    public Recode findRecode(Integer customerId) {
        try{
            return recodeMapper.findRecode(customerId);
        }catch(Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
