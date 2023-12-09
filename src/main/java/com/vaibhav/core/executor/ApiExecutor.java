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
        //get the current class name
        // find the request file whose name matches with current class
        return super.setRequestBody();
    }

    @Override
    public ApiExecutorBase updateRequestBody() {
        return super.updateRequestBody();
    }
}
