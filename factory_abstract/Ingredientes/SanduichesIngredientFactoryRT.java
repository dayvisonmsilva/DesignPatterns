package factory_abstract.Ingredientes;

import factory_abstract.Ingredientes.Pao.Pao;
import factory_abstract.Ingredientes.Pao.PaoBola;
import factory_abstract.Ingredientes.Proteina.PresuntoDePeru;
import factory_abstract.Ingredientes.Proteina.Proteina;
import factory_abstract.Ingredientes.Queijo.Queijo;
import factory_abstract.Ingredientes.Queijo.QueijoCheddar;

public class SanduichesIngredientFactoryRT implements SanduichesIngredientFactory {
    @Override
    public Pao createPao() {
        return new PaoBola();
    }

    @Override
    public Queijo createQueijo() {
        return new QueijoCheddar();
    }

    @Override
    public Proteina createProteina() {
        return new PresuntoDePeru();
    }
}
