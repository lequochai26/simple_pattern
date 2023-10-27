package org.lequochai.simple_pattern.path;

import java.util.HashMap;
import java.util.Map;

public class Path implements IPath {
    // FIELDS:
    private Map<String, Object> container;

    // CONSTRUCTORS:
    public Path() {
        container = new HashMap<>();
    }

    public Path(Map<String, Object> container) {
        this.container = container;
    }

    // METHODS:
    @Override
    public void set(String key, Object value) {
        container.put(key, value);
    }

    @Override
    public void remove(String key) {
        container.remove(key);
    }

    @Override
    public void clear() {
        container.clear();
    }

    @Override
    public Object get(String key) {
        return container.get(key);
    }

    @Override
    public Object[] getAllValues() {
        return container.values().toArray();
    }

    @Override
    public String[] getAllKeys() {
        return container.keySet().toArray(new String[0]);
    }

    @Override
    public boolean exist(String key) {
        return (container.get(key) != null);
    }
}
