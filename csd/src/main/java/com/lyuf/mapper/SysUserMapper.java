package com.lyuf.mapper;

import com.lyuf.pojo.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lyuf
 * @since 2020-11-20
 */
@Component
public interface SysUserMapper extends BaseMapper<SysUser> {

    @Select("select * from carsys.sys_user where tel = #{tel} and password = #{password}")
    SysUser findByTelAndPsw(String tel, String password);
}
