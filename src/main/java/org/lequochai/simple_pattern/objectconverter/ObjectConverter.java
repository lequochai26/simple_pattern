package org.lequochai.simple_pattern.objectconverter;

public interface ObjectConverter<F,T> {
    T convert(F obj);
    F reverse(T obj);
}
