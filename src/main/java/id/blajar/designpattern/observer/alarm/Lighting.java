package id.blajar.designpattern.observer.alarm;

public class Lighting implements AlarmListener {
    public void alarm() {
        System.out.println("lights up");
    }

}
