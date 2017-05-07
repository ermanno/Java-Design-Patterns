package com.ermannomoser.observer;

public class ObserverOne implements IObserver {

    @Override
    public void update(String subjectName, int data) {
        System.out.println("Observer One observes: " + subjectName + " and sees " + data);
    }

}
