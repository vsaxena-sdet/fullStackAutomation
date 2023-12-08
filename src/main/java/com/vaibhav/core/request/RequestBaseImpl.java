package com.vaibhav.core.request;

import com.vaibhav.interfaces.IApiRequest;

import java.util.HashMap;
import java.util.Map;

public abstract class RequestBaseImpl<T> implements IApiRequest<T> {

    private Map<String, String> headers = new HashMap<>();
    private Map<String, Object> queryParams = new HashMap<>();
    private String baseUrl;
    private String basePath;
    private String contentType;
    private String jsonBody;

    public RequestBaseImpl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public Map<String, String> headers() {
        return this.headers;
    }

    public RequestBaseImpl<T> setHeaders(String key, String value) {
        this.headers.put(key, value);
        return this;
    }

    public RequestBaseImpl<T> setQueryParams(String key, Object value) {
        this.queryParams.put(key, value);
        return this;
    }

    public String setBaseUrl() {
        return this.baseUrl;
    }

    public RequestBaseImpl<T> setBaseUrl(String baseUrl){
        this.baseUrl = baseUrl;
        return this;
    }

    public RequestBaseImpl<T> setRequestBody(String jsonBody){
        this.jsonBody=jsonBody;
        return this;
    }

    public final T build(){
        return null;
    }

    private String getClassName(Object obj){
        try {
            return obj.getClass().getName();
        }catch (Exception var5){
            return "";
        }
    }

    protected abstract String requestTemplatePath();

    public String getJsonBody() {
        return jsonBody;
    }

    public void setJsonBody(String jsonBody) {
        this.jsonBody = jsonBody;
    }
}
