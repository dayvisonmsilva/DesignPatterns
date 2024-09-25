package decorator;

public class LancheGourmetDecorator extends LancheDecorator{

    public LancheGourmetDecorator(ILanche lanche){
        super(lanche);
    }

    public String getDescricao() {
        return  super.getDescricao() + " (Gourmet)";
    }

    public double getPreco() {
        return super.getPreco() + 7.0;
    }
}
