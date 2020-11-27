package com.lyuf.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lyuf.pojo.SysCar;
import com.lyuf.mapper.SysCarMapper;
import com.lyuf.service.SysCarService;
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
public class SysCarServiceImpl extends ServiceImpl<SysCarMapper, SysCar> implements SysCarService {

    @Autowired
    SysCarMapper sysCarMapper;

    @Override
    public List<SysCar> findByCityid(String cityid) {

        QueryWrapper<SysCar> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("cityid",cityid);
        queryWrapper.orderByAsc("price");

        return sysCarMapper.selectList(queryWrapper);
    }

    @Override
    public List<SysCar> findByCityidOrderByNumber(String cityid) {
        QueryWrapper<SysCar> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("cityid",cityid);
        queryWrapper.orderByAsc("number");

        return sysCarMapper.selectList(queryWrapper);
    }

    @Override
    public SysCar findById(Integer cid) {
        return sysCarMapper.selectById(cid);
    }
}
