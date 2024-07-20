package com.xty.shortlink.admin.toolkit;

import java.util.Random;

public final class RandomStringUtil {

    // 字符集，包含数字和大小写字母
    private static final String CHAR_SET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    // 随机数生成器
    private static final Random random = new Random();

    /**
     * 生成随机分组ID
     *
     * @return 随机字符串
     */
    public static String generateRandom() {
        return generateRandom(6);
    }

    /**
     * 生成指定长度的随机字符串
     *
     * @param length 字符串长度
     * @return 随机字符串
     */
    public static String generateRandom(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHAR_SET.length());
            sb.append(CHAR_SET.charAt(index));
        }
        return sb.toString();
    }

}
