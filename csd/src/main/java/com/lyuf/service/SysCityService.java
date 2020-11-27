package com.lyuf.service;

import com.lyuf.pojo.SysCity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lyuf
 * @since 2020-11-20
 */
public interface SysCityService extends IService<SysCity> {

    List<SysCity> findAll();

    List<SysCity> findByPid(Integer pid);

    SysCity findByid(String id);
}
