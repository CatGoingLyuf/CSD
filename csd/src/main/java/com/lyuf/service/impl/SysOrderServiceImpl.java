package com.lyuf.service.impl;

import com.lyuf.pojo.SysCar;
import com.lyuf.pojo.SysOrder;
import com.lyuf.mapper.SysOrderMapper;
import com.lyuf.service.SysOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lyuf
 * @since 2020-11-20
 */
@Service
public class SysOrderServiceImpl extends ServiceImpl<SysOrderMapper, SysOrder> implements SysOrderService {

    @Autowired
    SysOrderMapper sysOrderMapper;

    @Override
    public void add(SysOrder sysOrder) {
        sysOrderMapper.insert(sysOrder);
    }

    @Override
    public List<SysOrder> all(String uid) {
        return sysOrderMapper.all(uid);
    }


}
