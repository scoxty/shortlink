package com.xty.shortlink.project.dto.req;

import lombok.Data;

/**
 * 回收站恢复功能
 */
@Data
public class ShortLinkRecycleBinRecoverReqDTO {
    private String gid;
    private String fullShortUrl;
}
