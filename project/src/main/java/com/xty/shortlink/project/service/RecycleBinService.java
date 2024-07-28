package com.xty.shortlink.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xty.shortlink.project.dao.entity.ShortLinkDO;
import com.xty.shortlink.project.dto.req.RecycleBinSaveReqDTO;

/**
 * 回收站接口层
 */
public interface RecycleBinService extends IService<ShortLinkDO> {

    /**
     * 保存回收站
     * @param requestParam
     */
    void saveRecycleBin(RecycleBinSaveReqDTO requestParam);
}
