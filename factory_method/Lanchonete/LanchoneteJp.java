package factory_method.Lanchonete;

import factory_method.Sanduiche.Sanduiche;
import factory_method.Sanduiche.SanduicheJp;

public class LanchoneteJp extends LanchoneteCreator {
    @Override
    public Sanduiche criarSanduiche(){
        return new SanduicheJp();
    }    
}
