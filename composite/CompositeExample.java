import java.util.ArrayList;
import java.util.List;

// Interface comum a ambos os nós
interface Component {
    void display();
}

// Nó folha
class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Leaf: " + name);
    }
}

// Composite
class Composite implements Component {
    private String name;
    // array para guardar os nós filhos ou sub-nós desse composite
    // vale lembrar que não necessariamente os sub-nós serão imediatamente folha
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addChild(Component component) {
        children.add(component);
    }

    @Override
    public void display() {
        System.out.println("Composite: " + name);
        for (Component child : children) {
            child.display(); // aqui é onde de fato está sendo feita a ação de mostrar/exibir o nome
        }
    }
}

// Example of usage
public class CompositeExample {
    public static void main(String[] args) {
        Component leaf1 = new Leaf("Leaf 1");
        Component leaf2 = new Leaf("Leaf 2");

        Composite composite = new Composite("Composite 1");
        composite.addChild(leaf1);  
        composite.addChild(leaf2);

        composite.display();
    }
}
