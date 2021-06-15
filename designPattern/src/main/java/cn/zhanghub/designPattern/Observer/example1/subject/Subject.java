package cn.zhanghub.designPattern.Observer.example1.subject;

import cn.zhanghub.designPattern.Observer.example1.observer.Observer;

import java.util.ArrayList;
import java.util.List;

//被观察者
abstract public class Subject {

    private List<Observer> observerList = new ArrayList<Observer>();

    public void attachObserver(Observer observer) {
        observerList.add(observer);
    }

    public void detachObserver(Observer observer){
        observerList.remove(observer);
    }

    public void notifyObservers(){
        for (Observer observer: observerList){
            observer.update();
        }
    }
}
