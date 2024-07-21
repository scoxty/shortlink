package com.xty.shortlink.project.dao.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.xty.shortlink.project.common.database.BaseDO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 短链接实体
 */
@Data
@TableName("t_link")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShortLinkDO extends BaseDO {
    private Long id;
    private String domain;
    private String shortUri;
    private String fullShortUrl;
    private String originUrl;
    private Integer clickNum;
    private String gid;
    private Integer enableStatus;
    private Integer createdType;
    private Integer validDateType;
    private Date validDate;
    @TableField("`describe`")
    private String describe;
}
