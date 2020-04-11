package id.blajar.designpattern.observer.alarm;

public class Gates implements AlarmListener {
    public void alarm() {
        System.out.println("gates close");
    }
}
