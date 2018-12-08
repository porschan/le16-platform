package com.chanchifeng.le16.bean;

/**
 * @author:porschan
 * @description:
 * @date: Created in 16:30 2018/12/8
 * @modified By:
 */

public class ResultBean{
        private int statusCode;
        private String statusMsg;
        private Object data;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMsg() {
        return statusMsg;
    }

    public void setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
