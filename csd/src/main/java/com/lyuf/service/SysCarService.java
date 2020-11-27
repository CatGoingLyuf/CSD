package com.lyuf.service;

import com.lyuf.pojo.SysCar;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lyuf.pojo.SysCity;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lyuf
 * @since 2020-11-20
 */
public interface SysCarService extends IService<SysCar> {

    List<SysCar> findByCityid(String cityid);

    List<SysCar> findByCityidOrderByNumber(String cityid);

    SysCar findById(Integer cid);
}
