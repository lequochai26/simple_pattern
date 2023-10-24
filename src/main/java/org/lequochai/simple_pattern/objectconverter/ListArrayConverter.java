package org.lequochai.simple_pattern.objectconverter;

import java.util.ArrayList;
import java.util.List;

public abstract class ListArrayConverter<T> implements ObjectConverter<List<T>,T[]> {
    // CONSTRUCTORS:
    public ListArrayConverter() {

    }

    // METHODS:
    @Override
    public T[] convert(List<T> list) {
        return list.toArray(
            this.generateArray()
        );
    }

    @Override
    public List<T> reverse(T[] array) {
        List<T> list = new ArrayList<>();
        for (T obj : array) {
            list.add(obj);
        }
        return list;
    }

    protected abstract T[] generateArray();
}
