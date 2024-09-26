package factory_method_q3;

// Fábrica concreta para DOMReader
public class DOMReaderFactory extends XMLReaderFactory {
    @Override
    public XMLReader createXMLReader() {
        return new DOMReader(); // Retorna uma instância de DOMReader
    }
}