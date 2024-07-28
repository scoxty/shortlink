package com.xty.shortlink.project.service;

/**
 * URL标题接口层
 */
public interface UrlTitleService {
    /**
     * 根据Url获取链接的Title
     * @param url 目标网站路径
     * @return 网站标题
     */
    String getTitleByUrl(String url);
}
