package factory_abstract.Ingredientes;

import factory_abstract.Ingredientes.Pao.Pao;
import factory_abstract.Ingredientes.Pao.PaoIntegral;
import factory_abstract.Ingredientes.Proteina.PresuntoDeFrango;
import factory_abstract.Ingredientes.Proteina.Proteina;
import factory_abstract.Ingredientes.Queijo.Queijo;
import factory_abstract.Ingredientes.Queijo.QueijoPrato;

public class SanduichesIngredientFactoryCG implements SanduichesIngredientFactory {
    @Override
    public Pao createPao() {
        return new PaoIntegral();
    }

    @Override
    public Queijo createQueijo() {
        return new QueijoPrato();
    }

    @Override
    public Proteina createProteina() {
        return new PresuntoDeFrango();
    }
}