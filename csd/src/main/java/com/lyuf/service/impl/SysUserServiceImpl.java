package com.lyuf.service.impl;

import com.lyuf.pojo.SysUser;
import com.lyuf.mapper.SysUserMapper;
import com.lyuf.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lyuf
 * @since 2020-11-20
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Autowired
    SysUserMapper sysUserMapper;

    @Override
    public SysUser findByTelAndPsd(String tel, String password) {

        return sysUserMapper.findByTelAndPsw(tel,password);
    }

    @Override
    public void addUser(SysUser sysUser) {
        sysUserMapper.insert(sysUser);
    }

    @Override
    public SysUser findById(String uid) {
        return sysUserMapper.selectById(uid);
    }
}
