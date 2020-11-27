package com.lyuf.service;

import com.lyuf.pojo.SysCar;
import com.lyuf.pojo.SysOrder;
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
public interface SysOrderService extends IService<SysOrder> {

    void add(SysOrder sysOrder);

    List<SysOrder> all(String uid);

}
