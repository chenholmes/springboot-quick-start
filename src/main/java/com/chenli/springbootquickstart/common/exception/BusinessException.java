package com.chenli.springbootquickstart.common.exception;

import com.chenli.springbootquickstart.common.CommonResult;
import lombok.Data;

/**
 * <p>Date: 2019-10-14 10:09.</p>
 *
 * @author chenli
 */
@Data
public class BusinessException extends RuntimeException {

    private Integer code;
    private String message;

    public BusinessException(CommonResult result) {
        this.code = result.getCode();
        this.message = result.getMessage();
    }

    public BusinessException(Integer code,String message) {
        this.code = code;
        this.message = message;
    }
}
