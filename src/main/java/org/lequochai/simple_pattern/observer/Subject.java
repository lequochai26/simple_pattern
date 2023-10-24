package org.lequochai.simple_pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {
    // FIELDS:
    private List<Observer> observers;

    // CONSTRUCTORS:
    public Subject() {
        observers = new ArrayList<>();
    }

    public Subject(List<Observer> observers) {
        this.observers = observers;
    }

    // METHODS:
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(EventParam e) {
        for (Observer observer : observers) {
            observer.update(e);
        }
    }

    @Override
    public void notify(String propertyName, Object oldValue, Object newValue) {
        EventParam e = new EventParam(
            propertyName, oldValue, newValue
        );
        this.notify(e);
    }
}
