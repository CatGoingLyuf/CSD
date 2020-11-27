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
public class SysCar implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private String type;

    private Integer sitnum;

    private Integer cityid;

    private Double price;

    private Integer number;

    private String picture;


}
