package com.xty.shortlink.project.dto.req;

import lombok.Data;

/**
 * 回收站移除功能
 */
@Data
public class ShortLinkRecycleBinRemoveReqDTO {
    private String gid;
    private String fullShortUrl;
}
