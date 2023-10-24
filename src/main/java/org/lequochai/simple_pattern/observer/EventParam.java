package org.lequochai.simple_pattern.observer;

public class EventParam {
    // FIELDS:
    private String propertyName;
    private Object oldValue;
    private Object newValue;

    // CONSTRUCTORS:
    public EventParam(String propertyName, Object oldValue, Object newValue) {
        this.propertyName = propertyName;
        this.oldValue = oldValue;
        this.newValue = newValue;
    }

    // METHODS:
    public String getPropertyName() {
        return propertyName;
    }

    public Object getOldValue() {
        return oldValue;
    }

    public Object getNewValue() {
        return newValue;
    }
}
