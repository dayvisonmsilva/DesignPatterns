package observer;

// Classe de teste
public class ObserverPatternTest {
    public static void main(String[] args) {
        Subject subject = new Subject();
        
        Observer observer1 = new ConcreteObserver("Observador 1");
        Observer observer2 = new ConcreteObserver("Observador 2");
        
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        
        // Mudança de estado que notifica os observadores
        subject.changeState();
    }
}