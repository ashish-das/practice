package design.pattern.observer;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface Subject{
    public void registerObserver(Observer observer);
    public void unregisterObserver(Observer observer);
    public void notifyObserver();
}

class CricketData implements Subject{

    int runs,wickets;
    float overs;

    List<Observer> observerList = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observerList.remove(observerList.indexOf(observer));
    }

    @Override
    public void notifyObserver() {
        for(Iterator<Observer> iterable = observerList.iterator(); iterable.hasNext();){
            Observer observer = iterable.next();
            observer.update(runs,wickets,overs);
        }
    }

    public void dataChange(){
        runs = getRuns();
        wickets = getWickets();
        overs = getOvers();

        notifyObserver();
    }

    private int getRuns() {
        return runs  = 50;
    }

    private int getWickets() {
        return wickets = 2;
    }

    private float getOvers() {
        return overs = 5;
    }
}

interface Observer{
    public void update(int runs,int wickets,float overs);
}

class AverageScoreDisplay implements Observer{
    @Override
    public void update(int runs, int wickets, float overs) {

    }
}

class CurrentScoreDisplay implements Observer{

    @Override
    public void update(int runs, int wickets, float overs) {

    }
}
public class ObserverPattern {
}
