package com.sky.lli.exception;

import lombok.Getter;

/**
 * 描述：枚举异常
 * CLASSPATH: com.sky.lli.exception.ExceptionEnum.java
 * VERSION:   1.0
 * Created by lihao
 * DATE:      2017/11/20
 */
public enum ExceptionEnum implements IExceptionEnum {

    /**
     * 异常取值范围划分:
     * <p>
     * 系统保留异常: 00000 -- 10000
     * Redis异常:   10001 -- 11000
     * Mongo异常:   11001 -- 12000
     */

    //region 系统类异常信息
    INVOKING_ERROR("LLI-00000", "操作失败"),
    INVOKING_SUCCESS("LLI-00001", "操作成功"),
    JSON_FAILURE("LLI-00003", "Json序列化对象错误"),
    METHOD_NOT_ALLOWED("LLI-00004", "POST/GET请求方式错误"),
    JSON_DATA_ERROR("LLI-00005", "JSON数据格式错误"),
    UNSUPPORTED_MEDIA_TYPE("LLI-00006", "请求数据类型不正确"),
    REQUEST_PARAM_MISSING("LLI-00007", "参数缺失"),
    SERVICE_NOT_FOUND_ERROR("LLI-00008", "不存在此接口"),
    DATABASE_FAILURE("LLI-00009", "数据库调用失败"),
    DATABASE_NULL_FAILURE("LLI-00010", "数据不存在"),
    DATABASE_FIELD_NOT_EXIST("CPYY-00011", "数据库表字段缺失"),

    //endregion

    // region ============================Redis相关异常信息==========================
    REDIS_TYPE_NULL_POINTER_ERROR("LLI-10001", "Redis缓存类型未指定"),
    REDIS_KEY_NULL_POINTER_ERROR("LLI-10002", "Redis缓存钥匙为空"),

    //endregion

    // region ============================Mongo相关异常信息==========================
    MONGO_TYPE_NULL_POINTER_ERROR("LLI-01001", "Mongo类型未指定"),

    //endregion
    SYSTEM_FAILURE("LLI-10000", "系统异常");

    // region 自身Get方法和构造函数
    @Getter
    private String code;
    @Getter
    private String message;

    ExceptionEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
    //endregion


}
