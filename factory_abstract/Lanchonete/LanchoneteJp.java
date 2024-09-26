package factory_abstract.Lanchonete;

import factory_abstract.Ingredientes.SanduichesIngredientFactory;
import factory_abstract.Sanduiche.Sanduiche;
import factory_abstract.Sanduiche.SanduicheJp;

public class LanchoneteJp extends LanchoneteCreator {
    public LanchoneteJp(SanduichesIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public Sanduiche criarSanduiche() {
        return new SanduicheJp();
    }
}