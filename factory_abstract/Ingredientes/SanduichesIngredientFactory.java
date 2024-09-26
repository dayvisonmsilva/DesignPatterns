package factory_abstract.Ingredientes;

import factory_abstract.Ingredientes.Pao.Pao;
import factory_abstract.Ingredientes.Proteina.Proteina;
import factory_abstract.Ingredientes.Queijo.Queijo;

public interface SanduichesIngredientFactory {
    Pao createPao();
    Queijo createQueijo();
    Proteina createProteina();
}