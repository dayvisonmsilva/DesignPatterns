package template.src;

public abstract class FileProcessor {
    
    // Método Template
    public final void processFile(String filePath) {
        loadFile(filePath);
        if (validateFile()) {
            processData();
            saveData();
        } else {
            System.out.println("Arquivo inválido.");
        }
    }
    
    // Etapas comuns que não mudam
    protected void loadFile(String filePath) {
        System.out.println("Carregando arquivo: " + filePath);
        // Código para carregar o arquivo...
    }
    
    // Método abstrato que cada subclasse implementa
    protected abstract boolean validateFile();

    // Método abstrato que cada subclasse implementa
    protected abstract void processData();

    // Etapa comum que pode ser reutilizada
    protected void saveData() {
        System.out.println("Salvando dados no banco...");
        // Código para salvar os dados...
    }
}

