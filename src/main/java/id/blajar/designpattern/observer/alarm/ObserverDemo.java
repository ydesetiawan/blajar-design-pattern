package com.codeghaib.designpattern.observer.alarm;

public class ObserverDemo {
    public static void main( String[] args ) {
        SensorSystem sensorSystem = new SensorSystem();
        sensorSystem.register(new Gates());
        sensorSystem.register(new Lighting());
        sensorSystem.register(new Melody());
        sensorSystem.soundTheAlarm();
    }
}
