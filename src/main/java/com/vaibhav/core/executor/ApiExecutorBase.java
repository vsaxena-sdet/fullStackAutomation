package com.vaibhav.core.executor;

import com.vaibhav.core.response.ApiResponseImpl;
import com.vaibhav.interfaces.IApi;
import com.vaibhav.interfaces.IApiRequest;
import io.restassured.response.Response;

import java.util.concurrent.Callable;

public class ApiExecutorBase implements IApi {

    private Response response= null;
    private BuilderBase base = null;

    public ApiExecutorBase(IApiRequest req) {
        Object reqBody = null;
       if (req.requestBody() == null){
           reqBody = req.build();
       }else{
           reqBody = req.requestBody();
       }
       BuilderBase api = new BuilderBase();
       api.setMethod(req.method());

       api.getRequestSpecBuilder().setContentType(req.contentType());
       api.getRequestSpecBuilder().setBaseUri(req.baseUrl());
       api.getRequestSpecBuilder().setBasePath(req.basePath());
       api.getRequestSpecBuilder().addHeaders(req.headers());

       if (reqBody != null){
           api.getRequestSpecBuilder().setBody(reqBody);
       }

       api.getRequestSpecBuilder().addQueryParams(req.queryParams());
       this.base=api;
    }

    @Override
    public Response execute() {
        this.response = this.base.execute();
        return this.response;
    }

//    private Callable<ApiResponseImpl> checkStatus(){
//        final int[] counter = new int[]{0};
//        return this.execute();
//    }


}
