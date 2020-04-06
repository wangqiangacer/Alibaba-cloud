package com.jacken.hellospringcloudalibabadependences.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangqiang
 * @version 1.0
 * @date 2020/4/4 16:18
 * //@TableId(type = IdType.AUTO) 这里不用配置直接在全局配置文件中设置
 *
//主键的类型  自增   idType.ID_WORKER  全局分布式唯一id
 */
@Data
public class User implements Serializable {


    private Long id;
    private String name;
    private Integer age;
    private String email;
}
