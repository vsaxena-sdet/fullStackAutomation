package com.vaibhav.interfaces;

import io.restassured.response.Response;

import java.util.Map;

public interface IResponse<T> {

    T body();
    String content();
    int statusCode();
    Response response();
    Map<String,String> headers();
}
