package id.blajar.designpattern.observer.alarm;

public abstract class CheckList {

    public void byTheNumbers() {
        localize();
        isolate();
        identify();
    }

    abstract void localize();

    abstract void isolate();

    abstract void identify();
}
