package com.xty.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xty.shortlink.admin.dao.entity.GroupDO;
import com.xty.shortlink.admin.dto.req.ShortLinkGroupSortReqDTO;
import com.xty.shortlink.admin.dto.req.ShortLinkGroupUpdateReqDTO;
import com.xty.shortlink.admin.dto.resp.ShortLinkGroupRespDTO;

import java.util.List;

/**
 * 短链接分组接口层
 */
public interface GroupService extends IService<GroupDO> {
    /**
     * 新增短链接分组
     * @param groupName 短链接分组
     */
    void saveGroup(String groupName);

    /**
     * 查询短链接分组集合
     * @return 短链接分组集合
     */
    List<ShortLinkGroupRespDTO> listGroup();

    /**
     * 修改短链接分组名
     * @param requestParam
     */
    void updateGroup(ShortLinkGroupUpdateReqDTO requestParam);

    /**
     * 删除短链接分组
     * @param gid
     */
    void deleteGroup(String gid);

    /**
     * 短链接分组排序
     * @param requestParam
     */
    void sortGroup(List<ShortLinkGroupSortReqDTO> requestParam);
}

