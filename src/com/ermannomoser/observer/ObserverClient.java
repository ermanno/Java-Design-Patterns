package com.ermannomoser.observer;

public class ObserverClient {
    public static void main(String[] args) {
        IObserver observerOne = new ObserverOne();
        IObserver observerTwo = new ObserverTwo();
        ISubject subjectOne = new SubjectOne();
        ISubject subjectTwo = new SubjectTwo();
        
        subjectOne.register(observerOne);
        subjectOne.register(observerTwo);
        subjectOne.setData(10);
        
        subjectTwo.register(observerOne);
        subjectTwo.setData(2);
        
        subjectOne.unregister(observerTwo);
        subjectOne.setData(3);
        
        subjectTwo.unregister(observerOne);
        subjectTwo.setData(4);
    }
}
