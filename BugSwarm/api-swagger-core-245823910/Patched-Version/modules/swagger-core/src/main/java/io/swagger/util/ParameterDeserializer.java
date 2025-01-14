package io.swagger.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import io.swagger.oas.models.parameters.CookieParameter;
import io.swagger.oas.models.parameters.HeaderParameter;
import io.swagger.oas.models.parameters.Parameter;
import io.swagger.oas.models.parameters.PathParameter;
import io.swagger.oas.models.parameters.QueryParameter;

import java.io.IOException;

public class ParameterDeserializer extends JsonDeserializer<Parameter> {
    @Override
    public Parameter deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException, JsonProcessingException {
        Parameter result = null;

        JsonNode node = jp.getCodec().readTree(jp);
        JsonNode sub = node.get("$ref");
        JsonNode inNode = node.get("in");
/*
        if (sub != null) {
            result = Json.mapper().convertValue(sub, RefParameter.class);
        } else if (inNode != null)*/ {
            String in = inNode.asText();
            if ("query".equals(in)) {
                result = Json.mapper().convertValue(node, QueryParameter.class);
            } else if ("header".equals(in)) {
                result = Json.mapper().convertValue(node, HeaderParameter.class);
            } else if ("path".equals(in)) {
                result = Json.mapper().convertValue(node, PathParameter.class);
            } else if ("cookie".equals(in)) {
                result = Json.mapper().convertValue(node, CookieParameter.class);
            }
        }

        return result;
    }
}
