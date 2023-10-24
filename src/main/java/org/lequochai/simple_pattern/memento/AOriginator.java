package org.lequochai.simple_pattern.memento;

public abstract class AOriginator<T> implements IOriginator<T> {
    // FIELDS:
    protected CareTaker<T> careTaker;

    // CONSTRUCTORS:
    public AOriginator() {
        careTaker = new CareTaker<>();
    }

    public AOriginator(CareTaker<T> careTaker) {
        this.careTaker = careTaker;
    }

    // METHODS:
    public CareTaker<T> getCareTaker() {
        return careTaker;
    }

    public void setCareTaker(CareTaker<T> careTaker) {
        this.careTaker = careTaker;
    }
}
