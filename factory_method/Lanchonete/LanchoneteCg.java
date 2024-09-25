package factory_method.Lanchonete;

import factory_method.Sanduiche.Sanduiche;
import factory_method.Sanduiche.SanduicheCg;

public class LanchoneteCg extends LanchoneteCreator {
    @Override
    public Sanduiche criarSanduiche(){
        return new SanduicheCg();
    }    
}
