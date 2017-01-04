package org.drill.model.vo;

/**
 * Created by GygesM on 2016/12/21.
 */
public class OkHttpResponse {
    private int code;
    private String data;

    public OkHttpResponse(int code, String data) {
        this.code = code;
        this.data = data;
    }

    public OkHttpResponse() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
