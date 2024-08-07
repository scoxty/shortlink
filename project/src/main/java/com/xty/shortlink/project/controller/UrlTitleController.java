package com.xty.shortlink.project.controller;

import com.xty.shortlink.project.common.convention.result.Result;
import com.xty.shortlink.project.common.convention.result.Results;
import com.xty.shortlink.project.service.UrlTitleService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * URL标题控制层
 */
@RestController
@RequiredArgsConstructor
public class UrlTitleController {
    private final UrlTitleService urlTitleService;

    /**
     * 根据URL获取对应网站的标题
     */
    @GetMapping("/api/short-link/v1/title")
    public Result<String> getTitleByUrl(@RequestParam("url") String url) {
        return Results.success(urlTitleService.getTitleByUrl(url));
    }
}
