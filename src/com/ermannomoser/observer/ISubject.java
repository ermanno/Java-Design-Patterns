package com.ermannomoser.observer;

public interface ISubject {
    public void register(IObserver observer);
    public void unregister(IObserver observer);
    public void notifyObservers();
    public void setData(int data);
    public int getData();
}
