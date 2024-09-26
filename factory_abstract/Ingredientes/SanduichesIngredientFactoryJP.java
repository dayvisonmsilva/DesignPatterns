package factory_abstract.Ingredientes;

import factory_abstract.Ingredientes.Pao.Pao;
import factory_abstract.Ingredientes.Pao.PaoFrances;
import factory_abstract.Ingredientes.Proteina.PresuntoDeFrango;
import factory_abstract.Ingredientes.Proteina.Proteina;
import factory_abstract.Ingredientes.Queijo.Queijo;
import factory_abstract.Ingredientes.Queijo.QueijoMussarela;

public class SanduichesIngredientFactoryJP implements SanduichesIngredientFactory {
    @Override
    public Pao createPao() {
        return new PaoFrances();
    }

    @Override
    public Queijo createQueijo() {
        return new QueijoMussarela();
    }

    @Override
    public Proteina createProteina() {
        return new PresuntoDeFrango();
    }
}