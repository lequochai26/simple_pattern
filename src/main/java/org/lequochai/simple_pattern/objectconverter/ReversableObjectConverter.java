package org.lequochai.simple_pattern.objectconverter;

public interface ReversableObjectConverter<F, T> extends ObjectConverter<F, T> {
    F reverse(T obj);
}
