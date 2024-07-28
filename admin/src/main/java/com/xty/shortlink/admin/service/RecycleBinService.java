package com.xty.shortlink.admin.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xty.shortlink.admin.common.convention.result.Result;
import com.xty.shortlink.admin.remote.dto.req.ShortLinkRecycleBinPageReqDTO;
import com.xty.shortlink.admin.remote.dto.resp.ShortLinkPageRespDTO;

/**
 * 回收站接口层
 */
public interface RecycleBinService {

    Result<IPage<ShortLinkPageRespDTO>> pageRecycleBinShortLink(ShortLinkRecycleBinPageReqDTO requestParam);
}
