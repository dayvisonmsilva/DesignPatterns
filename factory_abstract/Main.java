package factory_abstract;

import factory_abstract.Ingredientes.SanduichesIngredientFactory;
import factory_abstract.Ingredientes.SanduichesIngredientFactoryCG;
import factory_abstract.Ingredientes.SanduichesIngredientFactoryJP;
import factory_abstract.Ingredientes.SanduichesIngredientFactoryRT;
import factory_abstract.Sanduiche.Sanduiche;
import factory_abstract.Sanduiche.SanduicheCg;
import factory_abstract.Sanduiche.SanduicheJp;
import factory_abstract.Sanduiche.SanduicheRt;

public class Main {
    public static void main(String[] args) {
        // Criando a fábrica para o Sanduiche CG
        SanduichesIngredientFactory factoryCG = new SanduichesIngredientFactoryCG();
        Sanduiche sanduicheCg = new SanduicheCg();
        sanduicheCg.montar(factoryCG); // Chamada correta

        // Criando a fábrica para o Sanduiche JP
        SanduichesIngredientFactory factoryJP = new SanduichesIngredientFactoryJP();
        Sanduiche sanduicheJp = new SanduicheJp();
        sanduicheJp.montar(factoryJP); // Chamada correta

        // Criando a fábrica para o Sanduiche RT
        SanduichesIngredientFactory factoryRT = new SanduichesIngredientFactoryRT();
        Sanduiche sanduicheRt = new SanduicheRt();
        sanduicheRt.montar(factoryRT); // Chamada correta
    }
}
