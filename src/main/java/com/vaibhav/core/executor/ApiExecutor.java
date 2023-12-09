package com.vaibhav.core.executor;

import com.vaibhav.interfaces.IRequest;
import io.restassured.response.Response;

public class ApiExecutor extends ApiExecutorBase{

    public ApiExecutor(IRequest<?> req) {
        super(req);
    }

    @Override
    public Response execute() {
        return super.execute();
    }

    @Override
    public ApiExecutorBase setRequestBody() {
        return super.setRequestBody();
    }

    @Override
    public ApiExecutorBase updateRequestBody() {
        return super.updateRequestBody();
    }
}
