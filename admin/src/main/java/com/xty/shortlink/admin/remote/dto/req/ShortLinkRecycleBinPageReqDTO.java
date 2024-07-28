package com.xty.shortlink.admin.remote.dto.req;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

import java.util.List;

/**
 * 短链接回收分页请求参数
 */
@Data
public class ShortLinkRecycleBinPageReqDTO extends Page {
    private List<String> gidList;
}
