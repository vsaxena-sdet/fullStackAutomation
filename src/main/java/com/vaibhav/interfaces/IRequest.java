package com.vaibhav.interfaces;

import com.vaibhav.enums.HttpMethods;

import java.util.Map;

public interface IRequest<T> {

    T requestBody();
    Map<String,String> headers();
    Map<String,?> queryParams();
    String baseUrl();
    String basePath();
    String contentType();
    HttpMethods method();
    T build();


}
