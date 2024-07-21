package com.xty.shortlink.project.dto.resp;

import lombok.Data;

import java.util.Date;

/**
 * 短链接分页返回参数
 */
@Data
public class ShortLinkPageRespDTO {
    private Long id;
    private String domain;
    private String shortUri;
    private String fullShortUrl;
    private String originUrl;
    private String gid;
    private String favicon;
    private Integer validDateType;
    private Date validDate;
    private String describe;
}
