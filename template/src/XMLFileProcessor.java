package template.src;

public class XMLFileProcessor extends FileProcessor {

    @Override
    protected boolean validateFile() {
        System.out.println("Validando arquivo XML...");
        // Validações específicas de XML
        return true;
    }

    @Override
    protected void processData() {
        System.out.println("Processando dados do XML...");
        // Processamento específico de XML
    }
}
