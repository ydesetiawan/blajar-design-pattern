package com.codeghaib.designpattern.observer.msgsubscriber;

public class ObserverDemo {

    public static void main(String[] args)
    {
        DriverSubscriber driver = new DriverSubscriber();
        UserSubscriber user = new UserSubscriber();
        MerchantSubscriber merchant = new MerchantSubscriber();

        MessagePubliser p = new MessagePubliser();

        p.attach(driver);
        p.attach(user);

        p.notifyUpdate(new Message("First Message"));

        p.detach(driver);
        p.attach(merchant);

        p.notifyUpdate(new Message("Second Message"));
    }
}
