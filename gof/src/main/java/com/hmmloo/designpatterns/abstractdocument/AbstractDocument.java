package com.hmmloo.designpatterns.abstractdocument;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class AbstractDocument implements Document {
    private final Map<String, Object> properties;

    protected AbstractDocument(Map<String, Object> properties) {
        this.properties = properties;
    }

    @Override
    public void put(String key, Object value) {
        properties.put(key, value);
    }

    @Override
    public Object get(String key) {
        return properties.get(key);
    }

    @Override
    public <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor) {
        return null;
    }
}
