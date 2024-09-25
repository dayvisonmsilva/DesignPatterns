package factory_method.Lanchonete;

import factory_method.Sanduiche.Sanduiche;
import factory_method.Sanduiche.SanduicheRt;

public class LanchoneteRt extends LanchoneteCreator {
    @Override
    public Sanduiche criarSanduiche(){
        return new SanduicheRt();
    }    
}
