package decorator;

/**
 * LancheDecorator
 */
public abstract class LancheDecorator  implements ILanche{
    ILanche lanche;

    @Override
    public String getDescricao() {
        return this.lanche.getDescricao();
    }

    @Override
    public double getPreco() {
        return this.lanche.getPreco();
    }
    
    public LancheDecorator(ILanche lanche){
        this.lanche = lanche;
    }
}