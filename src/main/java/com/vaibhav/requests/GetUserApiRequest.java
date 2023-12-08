package com.vaibhav.requests;

import com.vaibhav.core.request.AbstractRequestBase;
import com.vaibhav.enums.HttpMethods;
import io.restassured.http.ContentType;

import java.util.HashMap;
import java.util.Map;

public class GetUserApiRequest extends AbstractRequestBase {

    String baseUri = "https://reqres.in/";

    @Override
    protected String requestTemplatePath() {
        return null;
    }

    @Override
    public Object requestBody() {
        return null;
    }

    @Override
    public Map<String, ?> queryParams() {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("page",2);
        return hashMap;
    }

    @Override
    public String baseUrl() {
        return this.baseUri;
    }

    @Override
    public String basePath() {
        return "api/users";
    }

    @Override
    public String contentType() {
        return ContentType.JSON.getContentTypeStrings()[0];
    }

    @Override
    public HttpMethods method() {
        return HttpMethods.GET;
    }
}
