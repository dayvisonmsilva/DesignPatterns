package factory_abstract.Lanchonete;

import factory_abstract.Ingredientes.SanduichesIngredientFactory;
import factory_abstract.Sanduiche.Sanduiche;

public abstract class LanchoneteCreator {
    protected SanduichesIngredientFactory ingredientFactory;

    public LanchoneteCreator(SanduichesIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public abstract Sanduiche criarSanduiche();

    public void entregarSanduiche() {
        Sanduiche sanduiche = criarSanduiche();
        sanduiche.montar(ingredientFactory);
        System.out.println("Sanduiche montado: " + sanduiche.toString());
    }
}
