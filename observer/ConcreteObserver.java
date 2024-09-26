package observer;

// Classe concreta Observer
class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject s) {
        System.out.println(name + " recebeu a notificação de que o Subject mudou!");
    }
}