package com.lyuf.service;

import com.lyuf.pojo.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lyuf
 * @since 2020-11-20
 */
public interface SysUserService extends IService<SysUser> {

    SysUser findByTelAndPsd(String tel, String password);

    void addUser(SysUser sysUser);

    SysUser findById(String uid);
}
