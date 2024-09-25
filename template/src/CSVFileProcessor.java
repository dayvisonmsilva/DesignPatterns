package template.src;

public class CSVFileProcessor extends FileProcessor {

    @Override
    protected boolean validateFile() {
        System.out.println("Validando arquivo CSV...");
        // Validações específicas de CSV
        return true; 
    }

    @Override
    protected void processData() {
        System.out.println("Processando dados do CSV...");
    }
}