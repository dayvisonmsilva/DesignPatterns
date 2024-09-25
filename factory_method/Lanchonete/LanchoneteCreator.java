package factory_method.Lanchonete;

import factory_method.Sanduiche.Sanduiche;

public abstract class LanchoneteCreator {
    public abstract Sanduiche criarSanduiche();

    public void entregarSanduiche() {
        Sanduiche sanduiche = criarSanduiche();
        sanduiche.montar();
        System.out.println("Sanduiche montado:" + sanduiche.toString());
    }
}
