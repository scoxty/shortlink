package com.xty.shortlink.project.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xty.shortlink.project.common.convention.result.Result;
import com.xty.shortlink.project.common.convention.result.Results;
import com.xty.shortlink.project.dto.req.ShortLinkRecycleBinPageReqDTO;
import com.xty.shortlink.project.dto.req.ShortLinkRecycleBinSaveReqDTO;
import com.xty.shortlink.project.dto.resp.ShortLinkPageRespDTO;
import com.xty.shortlink.project.service.RecycleBinService;
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
     * 保存回收站
     */
    @PostMapping("/api/short-link/v1/recycle-bin/save")
    public Result<Void> saveRecycleBin(@RequestBody ShortLinkRecycleBinSaveReqDTO requestParam) {
        recycleBinService.saveRecycleBin(requestParam);
        return Results.success();
    }

    /**
     * 分页查询短链接
     */
    @GetMapping("/api/short-link/v1/recycle-bin/page")
    public Result<IPage<ShortLinkPageRespDTO>> pageRecycleBinShortLink(ShortLinkRecycleBinPageReqDTO requestParam) {
        return Results.success(recycleBinService.pageRecycleBinShortLink(requestParam));
    }
}
