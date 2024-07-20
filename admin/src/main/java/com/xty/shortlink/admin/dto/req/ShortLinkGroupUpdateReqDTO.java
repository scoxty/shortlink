package com.xty.shortlink.admin.dto.req;

import lombok.Data;

/**
 * 短链接修改分组请求参数
 */
@Data
public class ShortLinkGroupUpdateReqDTO {
    private String gid;
    private String name;
}
