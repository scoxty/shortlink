package com.xty.shortlink.admin.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xty.shortlink.admin.common.convention.result.Result;
import com.xty.shortlink.admin.common.convention.result.Results;
import com.xty.shortlink.admin.remote.dto.ShortLinkRemoteService;
import com.xty.shortlink.admin.remote.dto.req.ShortLinkRecycleBinPageReqDTO;
import com.xty.shortlink.admin.remote.dto.req.ShortLinkRecycleBinRecoverReqDTO;
import com.xty.shortlink.admin.remote.dto.req.ShortLinkRecycleBinSaveReqDTO;
import com.xty.shortlink.admin.remote.dto.resp.ShortLinkPageRespDTO;
import com.xty.shortlink.admin.service.RecycleBinService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 回收站控制层
 */
@RestController
@RequiredArgsConstructor
public class RecycleBinController {

    private final RecycleBinService recycleBinService;

    /**
     * 后续重构为 SpringCloud Feign 调用
     */
    ShortLinkRemoteService shortLinkRemoteService = new ShortLinkRemoteService() {
    };

    /**
     * 保存回收站
     */
    @PostMapping("/api/short-link/admin/v1/recycle-bin/save")
    public Result<Void> saveRecycleBin(@RequestBody ShortLinkRecycleBinSaveReqDTO requestParam) {
        shortLinkRemoteService.saveRecycleBin(requestParam);
        return Results.success();
    }

    /**
     * 分页查询回收站短链接
     */
    @GetMapping("/api/short-link/admin/v1/recycle-bin/page")
    public Result<IPage<ShortLinkPageRespDTO>> pageRecycleBinShortLink(ShortLinkRecycleBinPageReqDTO requestParam) {
        return recycleBinService.pageRecycleBinShortLink(requestParam);
    }

    /**
     * 恢复回收站短链接
     */
    @PostMapping("/api/short-link/admin/v1/recycle-bin/recover")
    public Result<Void> recoverRecycleBin(@RequestBody ShortLinkRecycleBinRecoverReqDTO requestParam) {
        shortLinkRemoteService.recoverRecycleBin(requestParam);
        return Results.success();
    }
}
