package com.lyuf.mapper;

import com.lyuf.pojo.SysOrder;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lyuf
 * @since 2020-11-20
 */
@Component
public interface SysOrderMapper extends BaseMapper<SysOrder> {

    @Select("      select sys_order.id,oprice,sys_car.name cname,`status`,city1.`name` getcity, city2.name backcity" +
            "        from sys_order,sys_car,sys_city city1,sys_city city2" +
            "        where uid = #{uid}" +
            "        and sys_car.id = sys_order.carid" +
            "        and sys_order.getid = city1.id" +
            "        and sys_order.backid = city2.id")
    List<SysOrder> all(String uid);
}
