package org.lequochai.simple_pattern.path;

public interface IPath {
    void set(String key, Object value);
    void remove(String key);
    void clear();
    Object get(String key);
}
