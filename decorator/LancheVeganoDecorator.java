package decorator;

public class LancheVeganoDecorator extends LancheDecorator{

    public LancheVeganoDecorator(ILanche lanche){
        super(lanche);
    }   

    public String getDescricao() {
        return super.getDescricao() + " (Vegano)";
    }

    public double getPreco() {
        return super.getPreco() + 5.0;
    }
}
