package com.chenli.springbootquickstart.common.exception;

import com.chenli.springbootquickstart.common.CommonResult;
import com.chenli.springbootquickstart.common.constant.ResultCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * <p>Date: 2019-10-14 10:16.</p>
 *
 * @author chenli
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(BusinessException.class)
    public CommonResult businessExceptionHandler(BusinessException e) {
        logger.error("business error, code: {}, message: {}",e.getCode(),e.getMessage());
        return CommonResult.result(e.getCode(),e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public CommonResult exceptionHandler(Exception e) {
       logger.error("system error, code: {}, message: {}", ResultCode.FAIL.getCode(),ResultCode.FAIL.getMessage(),e);
       return CommonResult.result(ResultCode.FAIL.getCode(),ResultCode.FAIL.getMessage());
    }

    @ExceptionHandler(BindException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public CommonResult exceptionHandler(BindException e) {
        FieldError fieldError = e.getBindingResult().getFieldError();
        logger.error("params error, param: {}, message: {}", fieldError.getField(),fieldError.getDefaultMessage());
        return CommonResult.result(ResultCode.PARAM_ERROR.getCode(),fieldError.getField() + fieldError.getDefaultMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public CommonResult exceptionHandle(MethodArgumentNotValidException e) {
        FieldError fieldError = e.getBindingResult().getFieldError();
        logger.error("params error, param: {}, message: {}", fieldError.getField(),fieldError.getDefaultMessage());
        return CommonResult.result(ResultCode.PARAM_ERROR.getCode(),fieldError.getField() + fieldError.getDefaultMessage());

    }
}
