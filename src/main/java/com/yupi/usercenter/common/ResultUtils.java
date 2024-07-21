package com.yupi.usercenter.common;


/**
 * 返回工具类
 *
 * @author lafeier
 */
public class ResultUtils {

    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }


    public static <T> BaseResponse<T> fail(T data) {
        return new BaseResponse<>(0, data, "no");
    }
}
