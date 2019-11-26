package com.test.davy.controller;

/**
 * 〈〉
 *
 * @author daweizhao
 * @create 19/11/25 22:09
 */

public class BaseResult<T> {

    private boolean success = false;

    private T result;

    private String errCode;

    private String errorMessage;

    private Integer pageIndex;

    private Integer pageSize;

    /**
     * 查询结果的总条目数量
     */
    private Long totalCount;

    public void fail(String errCode, String errMsg){
        this.success = false;
        this.errCode = errCode;
        this.errorMessage = errMsg;
    }

    public void success(T data){
        this.success = true;
        this.result = data;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public String getErrCode() {
        return errCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public T getResult() {
        return result;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }


    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "BaseResult{" +
                "success=" + success +
                ", result=" + result +
                ", errCode='" + errCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
