package com.vaibhav.core.response;

import io.restassured.response.Response;

import java.util.Map;

public class ResponseBase extends ApiResponseImpl {

    public ResponseBase(Response response) {
        super(response);
    }

    @Override
    public Object body() {
        return super.body();
    }

    @Override
    public String content() {
        return super.content();
    }

    @Override
    public int statusCode() {
        return super.statusCode();
    }

    @Override
    public Response response() {
        return super.response();
    }

    @Override
    public Map<String, String> headers() {
        return super.headers();
    }
}
