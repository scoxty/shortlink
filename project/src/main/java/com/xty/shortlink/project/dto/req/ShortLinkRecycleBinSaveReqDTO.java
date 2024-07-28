package com.xty.shortlink.project.dto.req;

import lombok.Data;

/**
 * 回收站保存功能
 */
@Data
public class ShortLinkRecycleBinSaveReqDTO {
    private String gid;
    private String fullShortUrl;
}
