package com.codeghaib.designpattern.observer.msgsubscriber;

public class MerchantSubscriber implements Observer
{
    @Override
    public void update(Message message) {
        System.out.println("Merchant Subscriber :: " + message.getMessageContent());
    }
}
