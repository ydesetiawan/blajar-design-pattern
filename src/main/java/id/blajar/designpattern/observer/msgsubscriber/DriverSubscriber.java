package com.codeghaib.designpattern.observer.msgsubscriber;

public class DriverSubscriber implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("Driver Subscriber :: " + message.getMessageContent());
    }

}
