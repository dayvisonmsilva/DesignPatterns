package factory_method.Sanduiche;

public class SanduicheCg implements Sanduiche{
    @Override
    public void montar(){
        System.out.println("Pão integral + queijo prato + presunto de frango + sem verdura");
    }

    @Override
    public String toString(){
        return "Pão integral + queijo prato + presunto de frango + sem verdura";
    }
}
