package com.xty.shortlink.admin.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 短链接分组持久层实体
 */
@Data
@TableName(value ="t_group")
public class GroupDO {
    private Long id;
    private String gid;
    private String username;
    private Date createTime;
    private Date updateTime;
    private Integer delFlag;
}
