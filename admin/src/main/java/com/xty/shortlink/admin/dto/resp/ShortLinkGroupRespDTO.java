package com.xty.shortlink.admin.dto.resp;

import lombok.Data;

/**
 * 短链接分组返回实体对象
 */
@Data
public class ShortLinkGroupRespDTO {
    private String gid;
    private String name;
    private Integer sortOrder;
    private Integer shortLinkCount;
}
