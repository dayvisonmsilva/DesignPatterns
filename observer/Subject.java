package observer;

import java.util.ArrayList;
import java.util.List;

// Classe Subject
class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        // (A) Notifica todos os observadores sobre a mudança
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    // Um método para simular uma mudança de estado
    public void changeState() {
        // Após a mudança de estado, notifique os observadores
        notifyObservers();
    }
}