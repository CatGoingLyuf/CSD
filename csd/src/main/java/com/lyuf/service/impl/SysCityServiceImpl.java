package com.lyuf.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lyuf.pojo.SysCity;
import com.lyuf.mapper.SysCityMapper;
import com.lyuf.service.SysCityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.quartz.QuartzTransactionManager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lyuf
 * @since 2020-11-20
 */
@Service
public class SysCityServiceImpl extends ServiceImpl<SysCityMapper, SysCity> implements SysCityService {

    @Autowired
    SysCityMapper sysCityMapper;

    @Override
    public List<SysCity> findAll() {
        return sysCityMapper.selectList(null);
    }

    @Override
    public List<SysCity> findByPid(Integer pid) {

        QueryWrapper<SysCity> objectQueryWrapper = new QueryWrapper<>();
        objectQueryWrapper.eq("pid",pid);

        return sysCityMapper.selectList(objectQueryWrapper);
    }

    @Override
    public SysCity findByid(String id) {

        return sysCityMapper.selectById(id);
    }
}
