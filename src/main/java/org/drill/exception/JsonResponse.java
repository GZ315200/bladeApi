package org.drill.exception;

import org.drill.common.exception.ControllerFeedBack;

/**
 * Created by GygesM on 2016/12/21.
 */
public class JsonResponse<T> {

    private T data;
    private String code;
    private String codeDesc;


    public static class Builder{
        private String content;
        private String code;
        private String codeDesc;


        Builder(JsonResponse jsonResponse,String content){
            this.code = jsonResponse.code;
            this.codeDesc = jsonResponse.codeDesc;
            this.content = content;
        }

        public  static  JsonResponse create(String content){
            return create(content);
        }

        public static JsonResponse create(String code,String codeDesc){
            return create(code,codeDesc);
        }


        public JsonResponse content(String content){
            if (null == content){
                return JsonResponse.Builder.create(ControllerFeedBack.QUERY_FAIL.getCode(),ControllerFeedBack.QUERY_FAIL.getCodeDesc());
            }
            return JsonResponse.Builder.create("查询成功","100002");
        }

    }

    public JsonResponse(T data) {
        this.data = data;
        this.code = ControllerFeedBack.QUERY_FAIL.getCode();
        this.codeDesc = ControllerFeedBack.QUERY_FAIL.getCodeDesc();
    }

    public JsonResponse() {
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeDesc() {
        return codeDesc;
    }

    public void setCodeDesc(String codeDesc) {
        this.codeDesc = codeDesc;
    }
}
