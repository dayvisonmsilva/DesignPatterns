package factory_abstract.Sanduiche;

import factory_abstract.Ingredientes.SanduichesIngredientFactory;

public class SanduicheCg implements Sanduiche {
    @Override
    public void montar(SanduichesIngredientFactory factory) {
        System.out.println("Montando Sanduiche CG:");
        System.out.println(factory.createPao());
        System.out.println(factory.createQueijo());
        System.out.println(factory.createProteina());
    }

    @Override
    public String toString() {
        return "Sanduiche CG";
    }
}