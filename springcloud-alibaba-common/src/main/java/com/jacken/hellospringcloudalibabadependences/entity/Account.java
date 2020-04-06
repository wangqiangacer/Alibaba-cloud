package com.jacken.hellospringcloudalibabadependences.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author wangqiang
 * @version 1.0
 * @date 2020/4/6 17:19
 */
@Data
@TableName(value = "account_tbl")
public class Account {

    private  Long id;
    private  Long userId;
    private  Integer money;

}
