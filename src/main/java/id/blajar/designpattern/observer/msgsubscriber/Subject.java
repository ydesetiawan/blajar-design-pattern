package id.blajar.designpattern.observer.msgsubscriber;

public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyUpdate(Message message);
}
