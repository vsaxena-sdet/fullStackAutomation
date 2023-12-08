package com.vaibhav.core.executor;

import com.vaibhav.core.response.ApiResponseImpl;
import com.vaibhav.interfaces.IApiRequest;
import io.restassured.response.Response;

public class ApiExecutor extends ApiExecutorBase{

    public ApiExecutor(IApiRequest req) {
        super(req);
    }

    @Override
    public Response execute() {
        return super.execute();
    }
}
