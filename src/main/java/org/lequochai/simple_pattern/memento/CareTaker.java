package org.lequochai.simple_pattern.memento;

import java.util.Stack;

public class CareTaker<T> {
    // FIELDS:
    private Stack<T> done;
    private Stack<T> undone;

    // CONSTRUCTORS:
    public CareTaker() {
        done = new Stack<>();
        undone = new Stack<>();
    }

    public CareTaker(Stack<T> done, Stack<T> undone) {
        this.done = done;
        this.undone = undone;
    }

    // METHODS:
    public T getDone() {
        if (done.empty()) {
            return null;
        }

        return done.pop();
    }

    public void addDone(T memento) {
        done.push(memento);
    }

    public T getUndone() {
        if (undone.empty()) {
            return null;
        }

        return undone.pop();
    }

    public void addUndone(T memento) {
        undone.push(memento);
    }
}
