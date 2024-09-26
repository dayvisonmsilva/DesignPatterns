package factory_abstract.Lanchonete;

import factory_abstract.Ingredientes.SanduichesIngredientFactory;
import factory_abstract.Sanduiche.Sanduiche;
import factory_abstract.Sanduiche.SanduicheCg;

public class LanchoneteCg extends LanchoneteCreator {
    public LanchoneteCg(SanduichesIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public Sanduiche criarSanduiche() {
        return new SanduicheCg();
    }
}
