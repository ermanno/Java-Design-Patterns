package com.ermannomoser.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectTwo implements ISubject {

    private int data;
    private List<IObserver> observers = new ArrayList<>();
    
    @Override
    public void register(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update("Subject Two", data);
        }
    }

    @Override
    public int getData() {
        return data;
    }

    @Override
    public void setData(int data) {
        this.data = data;
        notifyObservers();
    }

}
