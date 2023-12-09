package com.vaibhav.core.response; //ApiResponseBase

import com.vaibhav.interfaces.IResponse;
import io.restassured.http.Header;
import io.restassured.response.Response;

import java.util.Map;
import java.util.stream.Collectors;

public class ApiResponseImpl implements IResponse {

    private final Response response;

    public ApiResponseImpl(Response response) {
        this.response = response;
    }

    @Override
    public Object body() {
        return this.response.body();
    }

    @Override
    public String content() {
        return this.response.contentType();
    }

    @Override
    public int statusCode() {
        return this.response.statusCode();
    }

    @Override
    public Response response() {
        return this.response;
    }

    @Override
    public Map<String, String> headers() {
        return this.response.headers().asList().stream().collect(Collectors.toMap(Header::getName, Header::getValue));
    }
}
