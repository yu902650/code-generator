package com.example;

import org.springframework.cglib.core.ReflectUtils;

import java.lang.reflect.Method;
import java.util.Date;

public class BaseController {

    /**
     * 填充创建时间 操作人等信息
     * @param obj
     */
    protected void fillSaveCommonData(Object obj) {
    }
    /**
     * 填充更新人和更新时间
     * @param obj
     */
    protected void fillEditCommonData(Object obj) {
    }
}
