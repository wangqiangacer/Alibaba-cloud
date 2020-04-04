package com.jacken.hellospringcloudalibabanacosprovider.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

/**
 * @author wangqiang
 * @version 1.0
 * @date 2020/4/4 16:18
 */
@Data
public class User implements Serializable {

    private Long id;
    private String name;
    private Integer age;
    private String email;
}
