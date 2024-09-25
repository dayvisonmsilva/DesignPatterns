package factory_method;

import factory_method.Lanchonete.LanchoneteCreator;
import factory_method.Lanchonete.LanchoneteJp;
import factory_method.Lanchonete.LanchoneteRt;
import factory_method.Lanchonete.LanchoneteCg;

public class Main {
    public static void main(String[] args) {
        LanchoneteCreator lanchoneteRt = new LanchoneteRt();
        lanchoneteRt.criarSanduiche();
        lanchoneteRt.entregarSanduiche();


        LanchoneteCreator lanchoneteCg = new LanchoneteCg();
        lanchoneteCg.criarSanduiche();
        lanchoneteCg.entregarSanduiche();

        LanchoneteCreator lanchoneteJp = new LanchoneteJp();
        lanchoneteJp.criarSanduiche();
        lanchoneteJp.entregarSanduiche();    
    }
}
