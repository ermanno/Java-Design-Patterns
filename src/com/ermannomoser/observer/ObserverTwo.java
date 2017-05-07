package com.ermannomoser.observer;

public class ObserverTwo implements IObserver {

    @Override
    public void update(String subjectName, int data) {
        System.out.println("Observer Two observes: " + subjectName + " and sees " + data);
    }

}
