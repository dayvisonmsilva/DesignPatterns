package factory_abstract.Sanduiche;

import factory_abstract.Ingredientes.SanduichesIngredientFactory;

public interface Sanduiche {
    void montar(SanduichesIngredientFactory factory); // Método com a assinatura correta
    String toString();
}