package com.chenli.springbootquickstart.common.constant;

import lombok.Data;

/**
 * <p>Date: 2019-10-14 09:21.</p>
 *
 * @author chenli
 */
public enum ResultCode {

    SUCCESS(200,"成功"),
    FAIL(500,"系统错误"),
    PARAM_ERROR(400,"参数错误");


    private Integer code;
    private String message;

    ResultCode(Integer code,String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
