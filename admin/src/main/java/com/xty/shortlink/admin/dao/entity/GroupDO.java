package com.xty.shortlink.admin.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.xty.shortlink.admin.common.database.BaseDO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 短链接分组持久层实体
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName(value ="t_group")
public class GroupDO extends BaseDO {
    private Long id;
    private String gid;
    private String name;
    private String username;
    private Integer sortOrder;
}
