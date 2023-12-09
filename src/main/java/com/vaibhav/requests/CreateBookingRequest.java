package com.vaibhav.requests;

import com.vaibhav.core.request.AbstractRequestBase;
import com.vaibhav.enums.HttpMethods;
import com.vaibhav.models.createBooking.CreateBooking;
import io.restassured.http.ContentType;

import java.util.Map;

public class CreateBookingRequest extends AbstractRequestBase {

    String requestBody;
    String baseUrl = "https://restful-booker.herokuapp.com";


    public CreateBookingRequest(String requestBody) {
        this.requestBody =requestBody;
    }

    @Override
    protected String requestTemplatePath() {
        return null;
    }

    @Override
    public Object requestBody() {
        return requestBody;
    }

    @Override
    public Map<String, ?> queryParams() {
        return null;
    }

    @Override
    public String baseUrl() {
        return baseUrl;
    }

    @Override
    public String basePath() {
        return "/booking";
    }

    @Override
    public String contentType() {
        return ContentType.JSON.getContentTypeStrings()[0];
    }

    @Override
    public HttpMethods method() {
        return HttpMethods.POST;
    }
}
