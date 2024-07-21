package com.yupi.usercenter.common;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * 通用返回类
 * @param <T>
 */
@Data
@AllArgsConstructor
public class BaseResponse<T> implements Serializable {
    private int code;

    private T data;

    private String msg;


}
