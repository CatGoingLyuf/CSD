package com.lyuf.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author lyuf
 * @since 2020-11-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SysOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer carid;

    private Integer uid;

    private Integer getid;

    private Integer backid;

    private Double oprice;

    private String status;

    private String  cname;

    private String  getcity;

    private String  backcity;

}
