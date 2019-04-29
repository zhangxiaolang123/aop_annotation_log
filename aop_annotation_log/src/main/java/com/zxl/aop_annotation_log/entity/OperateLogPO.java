package com.zxl.aop_annotation_log.entity;

import java.util.Date;
import java.util.UUID;

/**
 * @Describe
 * @Author zxl
 * @Date 2019-04-29 9:12
 */
public class OperateLogPO {

    private String id;
    private String method;
    private Date createTime;
    private String ip;
    private String brownerNo;
    private String osNo;
    private String params;

    private String module;

    private String operationDesc;

    private String result;

    private String status;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getOperationDesc() {
        return operationDesc;
    }

    public void setOperationDesc(String operationDesc) {
        this.operationDesc = operationDesc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getBrownerNo() {
        return brownerNo;
    }

    public void setBrownerNo(String brownerNo) {
        this.brownerNo = brownerNo;
    }

    public String getOsNo() {
        return osNo;
    }

    public void setOsNo(String osNo) {
        this.osNo = osNo;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }
}
