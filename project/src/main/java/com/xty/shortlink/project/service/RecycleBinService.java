package com.xty.shortlink.project.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xty.shortlink.project.dao.entity.ShortLinkDO;
import com.xty.shortlink.project.dto.req.ShortLinkRecycleBinSaveReqDTO;
import com.xty.shortlink.project.dto.req.ShortLinkRecycleBinPageReqDTO;
import com.xty.shortlink.project.dto.resp.ShortLinkPageRespDTO;

/**
 * 回收站接口层
 */
public interface RecycleBinService extends IService<ShortLinkDO> {

    /**
     * 保存回收站
     * @param requestParam
     */
    void saveRecycleBin(ShortLinkRecycleBinSaveReqDTO requestParam);

    /**
     * 分页查询回收站短链接
     * @param requestParam 分页查询回收站短链接请求参数
     * @return 回收站短链接分页返回结果
     */
    IPage<ShortLinkPageRespDTO> pageRecycleBinShortLink(ShortLinkRecycleBinPageReqDTO requestParam);
}
