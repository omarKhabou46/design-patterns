package com.springRevision.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSerialized<T> {

    public static <T> String toJson(T objectData) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(objectData);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}
