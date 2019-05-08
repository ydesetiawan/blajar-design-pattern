package com.codeghaib.designpattern.observer.msgsubscriber;

public class UserSubscriber implements Observer {

    @Override
    public void update(Message message) {
        System.out.println("User Subscriber :: " + message.getMessageContent());
    }

}
