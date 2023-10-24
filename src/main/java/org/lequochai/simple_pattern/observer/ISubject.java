package org.lequochai.simple_pattern.observer;

public interface ISubject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notify(EventParam e);
    void notify(String propertyName, Object oldValue, Object newValue);
}
