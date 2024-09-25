package decorator;

public class Lanche implements ILanche{
    String descricao;
    double preco;

    public Lanche(){
        descricao = "Lanche";
        preco = 10.0;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public double getPreco() {
        return preco;
    }
}
