package org.lequochai.simple_pattern.memento;

public interface IOriginator<T> {
    T saveMemento();
    void applyMemento(T memento);
}
