package com.vaibhav.interfaces;

import com.vaibhav.core.response.ApiResponseImpl;
import io.restassured.response.Response;

public interface IApi {
    Response execute();
}
