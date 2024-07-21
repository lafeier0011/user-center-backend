package com.yupi.usercenter.common;

import lombok.AllArgsConstructor;

/**
 * 全局错误码
 *
 * @author lafeier
 */

@AllArgsConstructor
public enum ErrorCode {
    SUCCESS(0, "成功", ""),
    PARAMS_ERROR(40000, "请求参数错误", ""),
    NULL_ERROR(40001, "请求数据为空", ""),
    NOT_LOGIN(40100, "未登录", ""),
    NO_AUTH(40101, "无权限", "");

    /**
     * 状态码信息
     */
    private final int code;

    /**
     * 状态码描述
     */
    private final String message;

    /**
     * 状态码详情
     */
    private final String description;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }
}
