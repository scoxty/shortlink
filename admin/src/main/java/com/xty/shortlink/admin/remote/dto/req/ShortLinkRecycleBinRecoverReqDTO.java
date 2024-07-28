package com.xty.shortlink.admin.remote.dto.req;

import lombok.Data;

/**
 * 回收站保存功能
 */
@Data
public class ShortLinkRecycleBinRecoverReqDTO {
    private String gid;
    private String fullShortUrl;
}
