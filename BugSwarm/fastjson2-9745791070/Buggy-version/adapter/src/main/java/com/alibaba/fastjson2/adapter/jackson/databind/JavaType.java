package com.alibaba.fastjson2.adapter.jackson.databind;

import com.alibaba.fastjson2.adapter.jackson.core.type.ResolvedType;

public abstract class JavaType
        extends ResolvedType
        implements java.io.Serializable, // 2.1
        java.lang.reflect.Type // 2.2
{
    protected final Class<?> raw;

    public JavaType(Class<?> raw) {
        this.raw = raw;
    }

    @Override
    public final Class<?> getRawClass() {
        return raw;
    }

    @Override
    public abstract boolean isContainerType();
}
