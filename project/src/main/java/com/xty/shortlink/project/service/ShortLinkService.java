package com.xty.shortlink.project.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xty.shortlink.project.dao.entity.ShortLinkDO;
import com.xty.shortlink.project.dto.req.ShortLinkCreateReqDTO;
import com.xty.shortlink.project.dto.req.ShortLinkPageReqDTO;
import com.xty.shortlink.project.dto.resp.ShortLinkCreateRespDTO;
import com.xty.shortlink.project.dto.resp.ShortLinkPageRespDTO;

/**
 * 短链接接口层
 */
public interface ShortLinkService extends IService<ShortLinkDO> {
    /**
     * 新增短链接
     * @param requestParam 创建短链接请求参数
     * @return 短链接创建信息
     */
    ShortLinkCreateRespDTO createShortLink(ShortLinkCreateReqDTO requestParam);

    /**
     * 分页查询短链接
     * @param requestParam 分页查询短链接请求参数
     * @return 短链接分页返回结果
     */
    IPage<ShortLinkPageRespDTO> pageShortLink(ShortLinkPageReqDTO requestParam);
}
