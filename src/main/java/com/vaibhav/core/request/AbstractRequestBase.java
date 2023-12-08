package com.vaibhav.core.request;

import com.vaibhav.utils.ConfigReaderWriter;

public abstract class AbstractRequestBase extends RequestBaseImpl {

    public AbstractRequestBase() {
        super(ConfigReaderWriter.API_HOST);
    }
}
