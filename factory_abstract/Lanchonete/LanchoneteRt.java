package factory_abstract.Lanchonete;

import factory_abstract.Ingredientes.SanduichesIngredientFactory;
import factory_abstract.Sanduiche.Sanduiche;
import factory_abstract.Sanduiche.SanduicheRt;

public class LanchoneteRt extends LanchoneteCreator {
    public LanchoneteRt(SanduichesIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public Sanduiche criarSanduiche() {
        return new SanduicheRt();
    }
}
