package com.zxl.aop_annotation_log.controller;

import com.zxl.aop_annotation_log.annotation.RequestLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Describe
 * @Author zxl
 * @Date 2019-04-29 9:06
 */
@RestController
public class RequestController {

    private static final Logger logger = LoggerFactory.getLogger("RequestController");

    /**
     * request测试专用
     *
     * @return
     */
    @RequestLog(module = "requestTest", operationDesc = "request测试专用")
    @RequestMapping(value = "requestTest", method = RequestMethod.GET)
    public String requestTest() {
        String result = null;
        try {
            System.out.println("我的是方法");
            result = "请求成功";
        } catch (Exception e) {
            logger.error("requestTest查询失败", e);
            return result;
        }
        return result;
    }
}
