package factory_method_q3;

// Fábrica concreta para SAXReader
public class SAXReaderFactory extends XMLReaderFactory {
    @Override
    public XMLReader createXMLReader() {
        return new SAXReader(); // Retorna uma instância de SAXReader
    }
}