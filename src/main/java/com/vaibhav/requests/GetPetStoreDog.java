package com.vaibhav.requests;

import com.vaibhav.core.request.AbstractRequestBase;
import com.vaibhav.enums.HttpMethods;
import com.vaibhav.interfaces.IApi;
import io.restassured.http.ContentType;

import java.util.Map;

public class GetPetStoreDog extends AbstractRequestBase {

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
        return null;
    }

    @Override
    public String baseUrl() {
        return "https://petstore.swagger.io/";
    }

    @Override
    public String basePath() {
        return "v2/pet/5";
    }

    @Override
    public String contentType() {
        return ContentType.JSON.toString();
    }

    @Override
    public HttpMethods method() {
        return HttpMethods.GET;
    }
}
