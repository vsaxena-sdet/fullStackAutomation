package com.vaibhav.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonHelperUtil {

    public static String convertObjectToJsonString(Object obj) {

        String jsonString = "";
        if (obj != null) {
            try {
                jsonString = new ObjectMapper().writeValueAsString(obj);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }
        return jsonString;
    }
}
