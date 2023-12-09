package com.vaibhav.core.executor;

import com.vaibhav.interfaces.IApi;
import com.vaibhav.interfaces.IRequest;
import io.restassured.response.Response;

public class ApiExecutorBase implements IApi {

    private final ApiBuilderBase base;

    public ApiExecutorBase(IRequest<?> req) {
        Object reqBody;
       if (req.requestBody() == null){
           reqBody = req.build();
       }else{
           reqBody = req.requestBody();
       }
       ApiBuilderBase api = new ApiBuilderBase();
       api.setMethod(req.method());

       api.getRequestSpecBuilder().setContentType(req.contentType());
       api.getRequestSpecBuilder().setBaseUri(req.baseUrl());
       api.getRequestSpecBuilder().setBasePath(req.basePath());
       api.getRequestSpecBuilder().addHeaders(req.headers());

       if (reqBody != null){
           api.getRequestSpecBuilder().setBody(reqBody);
       }

       if (req.queryParams()!=null){
           api.getRequestSpecBuilder().addQueryParams(req.queryParams());

       }
       this.base=api;
    }

    @Override
    public Response execute() {
        return this.base.execute();
    }

    public ApiExecutorBase setRequestBody(){
        return this;
    };

    public ApiExecutorBase updateRequestBody(){
        return this;
    }
}