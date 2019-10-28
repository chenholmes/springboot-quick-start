package com.chenli.springbootquickstart.common;

import com.chenli.springbootquickstart.common.constant.ResultCode;
import lombok.Data;

/**
 * <p>Date: 2019-10-14 09:16.</p>
 *
 * @author chenli
 */
@Data
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T data;

    protected CommonResult() {};

    protected CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> CommonResult<T> success() {
        return new CommonResult(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMessage(),null);
    }

    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<>(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMessage(),data);
    }

    public static <T> CommonResult<T> result(ResultCode resultCode) {
        return new CommonResult<>(resultCode.getCode(),resultCode.getMessage(),null);
    }

    public static <T> CommonResult<T> result(Integer code,String message) {
        return new CommonResult<>(code,message,null);
    }

}
