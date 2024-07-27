package com.xty.shortlink.project.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 有效期类型
 */
@RequiredArgsConstructor
public enum ValidDateTypeEnum {
    PERMANENT(0),
    CUSTOM(1);

    @Getter
    private final int type;
}
