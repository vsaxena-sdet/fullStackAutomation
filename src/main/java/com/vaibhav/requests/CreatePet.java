package com.vaibhav.requests;

import com.vaibhav.core.request.AbstractRequestBase;
import com.vaibhav.enums.HttpMethods;

import java.util.Map;

public class CreatePet extends AbstractRequestBase {

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
        return null;
    }

    @Override
    public String basePath() {
        return null;
    }

    @Override
    public String contentType() {
        return null;
    }

    @Override
    public HttpMethods method() {
        return null;
    }
}
