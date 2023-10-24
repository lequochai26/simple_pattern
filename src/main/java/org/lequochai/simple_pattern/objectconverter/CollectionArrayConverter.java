package org.lequochai.simple_pattern.objectconverter;

import java.util.Collection;

public abstract class CollectionArrayConverter<T> implements ReversableObjectConverter<Collection<T>,T[]> {
    // CONSTRUCTORS:
    public CollectionArrayConverter() {

    }

    // METHODS:
    @Override
    public T[] convert(Collection<T> collection) {
        return collection.toArray(
            this.generateArray()
        );
    }

    @Override
    public Collection<T> reverse(T[] arr) {
        Collection<T> collection = this.generateCollection();
        for (T obj : arr) {
            collection.add(obj);
        }
        return collection;
    }
    
    protected abstract Collection<T> generateCollection();
    protected abstract T[] generateArray();
}
