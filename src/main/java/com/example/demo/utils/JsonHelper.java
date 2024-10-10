package com.example.demo.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class JsonHelper {

  private static ObjectMapper MAPPER = new ObjectMapper();

  public static <T> T jsonToObject(String json, Class<T> clazz) {

    return jsonToObject(json, null, clazz);
  }

  public static <T> T jsonToObject(String json, TypeReference type) {

    return jsonToObject(json, type, null);
  }

  private static <T> T jsonToObject(String json, TypeReference type, Class<T> clazz) {

    try {
      if (json == null) {
        return null;
      }

      if (type != null) {
        return (T) MAPPER.readValue(json, type);
      }

      return MAPPER.readValue(json, clazz);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static String toJson(Object object) {
    try {
      if(object == null)
        return "";
      return MAPPER.writeValueAsString(object);
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }


}
