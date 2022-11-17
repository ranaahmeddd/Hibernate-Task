package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private int state;
    private List<Observer> observers = new ArrayList<Observer>();

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public int getState() {
        return state;
    }
    public void addToList(Observer observer){
        observers.add(observer);
    }
    public void notifyAllObservers(){
        for(Observer observer: observers){
            observer.update();
        }
    }
}
