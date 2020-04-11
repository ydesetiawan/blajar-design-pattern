package com.codeghaib.designpattern.observer.alarm;

public class Melody extends CheckList implements AlarmListener {
    public void alarm() {
        System.out.println("Surveillance - by the numbers:");
        byTheNumbers();
    }

    @Override
    void localize() {
        System.out.println(".... localize ");
    }

    @Override
    void isolate() {
        System.out.println(".... isolate ");

    }

    @Override
    void identify() {
        System.out.println(".... identity ");
    }
}
